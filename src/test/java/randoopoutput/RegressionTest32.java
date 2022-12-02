package randoopoutput;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest32 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/?date=52:-1&format=json");
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
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=-1:-1&format=json");
        fetchers.Url url16 = urlBuilder13.build();
        java.lang.String str17 = url16.toString();
        java.lang.String str18 = url16.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(url16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=-1:-1&format=json?date=10:0&format=json" + "'", str17, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=-1:-1&format=json?date=10:0&format=json");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=-1:-1&format=json?date=10:0&format=json" + "'", str18, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=-1:-1&format=json?date=10:0&format=json");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearStart((int) (short) 10);
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
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) -1);
        fetchers.Url url13 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder10.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=-1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearEnd(0);
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
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder15.setYearStart((int) (short) 100);
        java.lang.Class<?> wildcardClass20 = urlBuilder15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setYearStart((int) 'a');
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
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder19.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder19.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/?date=52:-1&format=json");
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
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json");
        java.lang.Class<?> wildcardClass11 = urlBuilder10.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd(0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearStart((int) (short) 10);
        fetchers.Url url9 = urlBuilder8.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=100:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
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
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country//indicator/null?date=52:1&format=json");
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
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json");
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
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json/indicator/null?date=52:52&format=json/indicator/hi!?date=52:0&format=json");
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
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=10:-1&format=json");
        fetchers.Url url10 = urlBuilder7.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(url10);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (byte) 10);
        fetchers.Url url9 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:10&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url url15 = urlBuilder8.build();
        fetchers.Url url16 = urlBuilder8.build();
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
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url url9 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder2.setYearEnd((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json?date=0:10&format=json");
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
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url url14 = urlBuilder13.build();
        java.lang.Class<?> wildcardClass15 = urlBuilder13.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(url14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json/indicator/hi!?date=97:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:100&format=json?date=0:0&format=json");
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
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setCountry("hi!");
        fetchers.Url url11 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder10.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder10.setCountry("");
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
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(100);
        fetchers.Url url11 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder10.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder10.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder10.setYearEnd((int) '4');
        java.lang.Class<?> wildcardClass18 = urlBuilder10.getClass();
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
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearEnd((int) (byte) 1);
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
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder2.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder5.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=-1:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json/indicator/?date=1:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder2.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
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
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=35:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=52:-1&format=json");
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
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((-1));
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
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(100);
        fetchers.Url url11 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder10.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder10.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder10.setYearEnd((int) '4');
        fetchers.Url url18 = urlBuilder17.build();
        java.lang.String str19 = url18.toString();
        java.lang.String str20 = url18.toString();
        java.lang.String str21 = url18.toString();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/?date=100:52&format=json" + "'", str19, "http://api.worldbank.org/v2/country/null/indicator/?date=100:52&format=json");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/?date=100:52&format=json" + "'", str20, "http://api.worldbank.org/v2/country/null/indicator/?date=100:52&format=json");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/?date=100:52&format=json" + "'", str21, "http://api.worldbank.org/v2/country/null/indicator/?date=100:52&format=json");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url url9 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder2.setYearEnd((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
        java.lang.Class<?> wildcardClass16 = urlBuilder2.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:-1&format=json");
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
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder21.setYearStart((int) (byte) 1);
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
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (short) 0);
        fetchers.Url url9 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder8.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder11.setYearEnd((int) (short) 100);
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
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
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
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url url12 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearEnd((int) (byte) 0);
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
        org.junit.Assert.assertNotNull(urlBuilder20);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json");
        fetchers.Url url15 = urlBuilder10.build();
        java.lang.String str16 = url15.toString();
        java.lang.String str17 = url15.toString();
        java.lang.String str18 = url15.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json?date=35:100&format=json" + "'", str16, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json?date=35:100&format=json");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json?date=35:100&format=json" + "'", str17, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json?date=35:100&format=json");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json?date=35:100&format=json" + "'", str18, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json?date=35:100&format=json");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder9.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearEnd((int) (short) 1);
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
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) (byte) 0);
        fetchers.Url url15 = urlBuilder14.build();
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
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) 100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
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
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder21.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder26.setYearEnd((int) (short) 1);
        java.lang.Class<?> wildcardClass29 = urlBuilder26.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart(10);
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
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setCountry("");
        fetchers.Url url19 = urlBuilder18.build();
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder18.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setYearStart(10);
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
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:-1&format=json");
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
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearEnd((int) ' ');
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
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=35:-1&format=json");
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
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url url9 = urlBuilder8.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder9.setYearStart((int) (byte) 100);
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
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
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
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder19.setYearStart((int) (byte) 1);
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
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=10:-1&format=json");
        fetchers.Url url11 = urlBuilder10.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearStart(1);
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
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder13.setYearEnd((int) (byte) 1);
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
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setCountry("");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearStart(0);
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
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
        java.lang.String str22 = url21.toString();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:-1&format=json?date=0:-1&format=json" + "'", str22, "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:-1&format=json?date=0:-1&format=json");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setCountry("");
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
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        java.lang.Class<?> wildcardClass11 = urlBuilder10.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url url9 = urlBuilder8.build();
        fetchers.Url url10 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json/indicator/null?date=-1:100&format=json");
        fetchers.Url url15 = urlBuilder14.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(url10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url url7 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder6.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
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
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (byte) 100);
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
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearEnd((int) ' ');
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
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=10:0&format=json");
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
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setYearEnd((int) (byte) 0);
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
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
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
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder19.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder23.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
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
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        fetchers.Url url21 = urlBuilder18.build();
        java.lang.String str22 = url21.toString();
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
        org.junit.Assert.assertNotNull(url21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://api.worldbank.org/v2/country//indicator/?date=0:-1&format=json" + "'", str22, "http://api.worldbank.org/v2/country//indicator/?date=0:-1&format=json");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
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
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder24.setYearStart((int) (short) 1);
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
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
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
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(10);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
        fetchers.Url url21 = urlBuilder8.build();
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
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (byte) 100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) (short) 100);
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
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json");
        fetchers.Url url18 = urlBuilder15.build();
        java.lang.String str19 = url18.toString();
        java.lang.String str20 = url18.toString();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json/indicator/hi!?date=-1:0&format=json" + "'", str19, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json/indicator/hi!?date=-1:0&format=json");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json/indicator/hi!?date=-1:0&format=json" + "'", str20, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json/indicator/hi!?date=-1:0&format=json");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearEnd((int) 'a');
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
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (byte) 10);
        fetchers.Url url13 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=0:-1&format=json/indicator/hi!?date=52:97&format=json");
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
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url url7 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:10&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setYearStart((int) (byte) 1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
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
        java.lang.Class<?> wildcardClass22 = urlBuilder20.getClass();
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
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder0.setYearEnd(0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=-1:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setYearEnd((-1));
        java.lang.Class<?> wildcardClass14 = urlBuilder9.getClass();
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
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json/indicator/null?date=-1:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setYearStart((int) (short) -1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url url17 = urlBuilder14.build();
        fetchers.Url url18 = urlBuilder14.build();
        java.lang.String str19 = url18.toString();
        java.lang.Class<?> wildcardClass20 = url18.getClass();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json" + "'", str19, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder8.setYearEnd((int) (byte) 1);
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
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder11.setYearStart((int) (short) 1);
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
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
        java.lang.Class<?> wildcardClass22 = urlBuilder21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/?date=100:100&format=json" + "'", str20, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/?date=100:100&format=json");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearStart((int) (byte) 0);
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
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
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
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearStart(0);
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
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
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
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setYearStart((-1));
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
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearEnd((int) (byte) 10);
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
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url url9 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder6.setYearEnd((-1));
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) (byte) 0);
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url url6 = urlBuilder4.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(url6);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:-1&format=json");
        fetchers.Url url12 = urlBuilder11.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json/indicator/?date=100:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart(0);
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
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder13.setYearStart(0);
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
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
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
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:10&format=json");
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
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearStart((int) (short) 0);
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
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=1:0&format=json");
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
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
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
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setanalysisMode("http://api.worldbank.org/v2/country//indicator/?date=0:32&format=json");
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
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url url9 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder8.setanalysisMode("hi!");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=100:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json?date=52:97&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url url11 = urlBuilder10.build();
        fetchers.Url url12 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json");
        fetchers.Url url15 = urlBuilder14.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
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
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setanalysisMode("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json?date=97:-1&format=json");
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
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
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
        java.lang.Class<?> wildcardClass19 = urlBuilder16.getClass();
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
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url url8 = urlBuilder0.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(url8);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url url9 = urlBuilder6.build();
        java.lang.String str10 = url9.toString();
        java.lang.String str11 = url9.toString();
        java.lang.Class<?> wildcardClass12 = url9.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json" + "'", str10, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json" + "'", str11, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
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
        java.lang.Class<?> wildcardClass19 = url18.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder20.setYearEnd((int) (short) -1);
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
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearEnd((int) (short) 10);
        fetchers.Url url20 = urlBuilder17.build();
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder17.setYearEnd((int) (byte) -1);
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
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder0.setYearStart((int) 'a');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
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
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder26.setYearStart(0);
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
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url url13 = urlBuilder12.build();
        java.lang.String str14 = url13.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=1:-1&format=json" + "'", str14, "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=1:-1&format=json");
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url url9 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json");
        fetchers.Url url12 = urlBuilder11.build();
        java.lang.String str13 = url12.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json/indicator/?date=52:-1&format=json" + "'", str13, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json/indicator/?date=52:-1&format=json");
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearEnd(1);
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
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart((int) (short) 1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
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
        fetchers.Url.UrlBuilder urlBuilder30 = urlBuilder24.setYearStart((int) '4');
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
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
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
        java.lang.Class<?> wildcardClass17 = urlBuilder13.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(url14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url url7 = urlBuilder6.build();
        java.lang.String str8 = url7.toString();
        java.lang.String str9 = url7.toString();
        java.lang.String str10 = url7.toString();
        java.lang.String str11 = url7.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json" + "'", str8, "http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json" + "'", str9, "http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json" + "'", str10, "http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json" + "'", str11, "http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearEnd((int) (short) -1);
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
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url url12 = urlBuilder0.build();
        fetchers.Url url13 = urlBuilder0.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(url13);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
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
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setYearStart((int) (byte) -1);
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
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearStart((int) (byte) 10);
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
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json/indicator/?date=52:-1&format=json");
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
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json");
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
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
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
        fetchers.Url url17 = urlBuilder16.build();
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
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((-1));
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
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearEnd((int) '4');
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
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json?date=35:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearStart((int) '#');
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
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url url9 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder11.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:10&format=json");
        java.lang.Class<?> wildcardClass18 = urlBuilder11.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:10&format=json");
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
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
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
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder24.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=0:0&format=json");
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
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
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
        fetchers.Url url18 = urlBuilder15.build();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json/indicator/hi!?date=-1:-1&format=json" + "'", str19, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json/indicator/hi!?date=-1:-1&format=json");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url url13 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder6.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/?date=-1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder15.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/?date=100:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setYearStart((int) '#');
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
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=-1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=-1:-1&format=json?date=10:0&format=json");
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
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearEnd((int) (short) 1);
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
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url url9 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json");
        java.lang.Class<?> wildcardClass14 = urlBuilder13.getClass();
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
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        java.lang.Class<?> wildcardClass20 = urlBuilder19.getClass();
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
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd((int) (short) 10);
        fetchers.Url url15 = urlBuilder14.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder14.setYearEnd((int) 'a');
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
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url url9 = urlBuilder8.build();
        java.lang.String str10 = url9.toString();
        java.lang.String str11 = url9.toString();
        java.lang.String str12 = url9.toString();
        java.lang.String str13 = url9.toString();
        java.lang.String str14 = url9.toString();
        java.lang.String str15 = url9.toString();
        java.lang.String str16 = url9.toString();
        java.lang.Class<?> wildcardClass17 = url9.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json" + "'", str10, "http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json" + "'", str11, "http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json" + "'", str12, "http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json" + "'", str13, "http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json" + "'", str14, "http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json" + "'", str15, "http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json" + "'", str16, "http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        java.lang.String str6 = url5.toString();
        java.lang.String str7 = url5.toString();
        java.lang.Class<?> wildcardClass8 = url5.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json" + "'", str6, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json" + "'", str7, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setYearEnd((int) (byte) 1);
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
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder7.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder13.setYearEnd((int) (byte) 10);
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
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
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
        fetchers.Url url20 = urlBuilder8.build();
        java.lang.String str21 = url20.toString();
        java.lang.String str22 = url20.toString();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:0&format=json" + "'", str21, "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:0&format=json");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:0&format=json" + "'", str22, "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:0&format=json");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=52:0&format=json");
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
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearEnd(10);
        fetchers.Url url10 = urlBuilder9.build();
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder9.setYearStart((int) (short) 100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(url10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url13 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder10.setanalysisMode("");
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
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder5.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country//indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearStart(1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearStart((int) (short) 0);
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
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=1:-1&format=json");
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
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json?date=52:97&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json/indicator/?date=52:10&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder15.setYearEnd((-1));
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
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd(0);
        fetchers.Url url19 = urlBuilder16.build();
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
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=100:52&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url url12 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart((-1));
        fetchers.Url url19 = urlBuilder16.build();
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder16.setYearEnd((int) (short) 100);
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
        org.junit.Assert.assertNotNull(url19);
        org.junit.Assert.assertNotNull(urlBuilder21);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setYearEnd((int) (byte) 1);
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
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/?date=1:0&format=json");
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
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        java.lang.Class<?> wildcardClass11 = urlBuilder10.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setYearEnd((int) (byte) 0);
        fetchers.Url url9 = urlBuilder8.build();
        java.lang.String str10 = url9.toString();
        java.lang.String str11 = url9.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/null?date=1:0&format=json" + "'", str10, "http://api.worldbank.org/v2/country/hi!/indicator/null?date=1:0&format=json");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/null?date=1:0&format=json" + "'", str11, "http://api.worldbank.org/v2/country/hi!/indicator/null?date=1:0&format=json");
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
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
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder18.setYearEnd((-1));
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
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url url12 = urlBuilder11.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder11.setYearStart((int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = urlBuilder11.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder12.setYearEnd((int) (short) -1);
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
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setYearEnd((int) ' ');
        java.lang.Class<?> wildcardClass11 = urlBuilder10.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearEnd(1);
        fetchers.Url url15 = urlBuilder8.build();
        java.lang.String str16 = url15.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/null?date=100:1&format=json" + "'", str16, "http://api.worldbank.org/v2/country/hi!/indicator/null?date=100:1&format=json");
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearEnd((-1));
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
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder7.setYearEnd((int) (short) -1);
        java.lang.Class<?> wildcardClass12 = urlBuilder7.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json?date=35:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json?date=1:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (short) -1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
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
        fetchers.Url url22 = urlBuilder21.build();
        java.lang.String str23 = url22.toString();
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
        org.junit.Assert.assertNotNull(url22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=0:-1&format=json?date=0:-1&format=json" + "'", str23, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=0:-1&format=json?date=0:-1&format=json");
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearStart((int) (byte) 10);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=10:-1&format=json" + "'", str16, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=10:-1&format=json");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=10:-1&format=json" + "'", str17, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=10:-1&format=json");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (short) 1);
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
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) 'a');
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
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
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
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setYearEnd((int) (byte) -1);
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
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
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
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/?date=52:-1&format=json");
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
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (byte) 1);
        fetchers.Url url11 = urlBuilder8.build();
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
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:-1&format=json?date=0:-1&format=json");
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
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearStart((int) (byte) 0);
        java.lang.Class<?> wildcardClass10 = urlBuilder7.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder15.setYearStart((int) (short) 0);
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
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(100);
        fetchers.Url url11 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder10.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearEnd((int) '4');
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
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=0:-1&format=json?date=0:-1&format=json");
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
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:0&format=json");
        java.lang.Class<?> wildcardClass20 = urlBuilder17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearStart((int) '4');
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
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
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
        fetchers.Url url18 = urlBuilder13.build();
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
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:100&format=json");
        fetchers.Url url13 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder10.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder10.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json");
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
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
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
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setYearStart((int) (byte) 1);
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
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url url11 = urlBuilder8.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) -1);
        fetchers.Url url15 = urlBuilder14.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
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
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setYearEnd((int) (short) 0);
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
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=-1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/?date=52:-1&format=json");
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
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearEnd((int) (byte) 10);
        fetchers.Url url17 = urlBuilder10.build();
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
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder11.setYearStart(0);
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
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json");
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
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        java.lang.Class<?> wildcardClass10 = urlBuilder9.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url url7 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder6.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearEnd(10);
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
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) (byte) 0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder10.setYearEnd((int) '4');
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
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/?date=100:-1&format=json/indicator/hi!?date=0:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder2.setYearEnd(1);
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
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=0:-1&format=json?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
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
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country//indicator/?date=97:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart(100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder12.setYearEnd((int) (byte) 0);
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
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
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
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=-1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json/indicator/?date=0:-1&format=json");
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
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
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
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
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
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        java.lang.Class<?> wildcardClass7 = urlBuilder4.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json");
        fetchers.Url url17 = urlBuilder16.build();
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder16.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=35:0&format=json");
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
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url url11 = urlBuilder8.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=10:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) ' ');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearStart((int) '4');
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
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:35&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder12.setYearEnd(100);
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
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((-1));
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
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
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
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder18.setYearStart((int) (short) 1);
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
        org.junit.Assert.assertNotNull(urlBuilder26);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=10:0&format=json");
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
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        fetchers.Url url12 = urlBuilder9.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json/indicator/null?date=52:52&format=json");
        java.lang.Class<?> wildcardClass17 = urlBuilder14.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:-1&format=json");
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
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearEnd((int) 'a');
        fetchers.Url url9 = urlBuilder2.build();
        java.lang.Class<?> wildcardClass10 = urlBuilder2.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
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
        java.lang.Class<?> wildcardClass26 = urlBuilder25.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearStart(10);
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
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 1);
        fetchers.Url url11 = urlBuilder8.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=10:35&format=json");
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
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
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
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder22.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
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
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url url13 = urlBuilder10.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
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
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:52&format=json");
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
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:1&format=json");
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
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearEnd((int) (short) 1);
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
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearStart((int) (short) 1);
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
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
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
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setYearStart((int) (short) 10);
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
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearStart((int) (byte) 0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=-1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setYearStart(0);
        fetchers.Url url25 = urlBuilder22.build();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=-1:-1&format=json?date=0:100&format=json" + "'", str26, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=-1:-1&format=json?date=0:100&format=json");
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder12.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder12.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setYearEnd((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder21.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
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
        org.junit.Assert.assertNotNull(urlBuilder25);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country//indicator/?date=0:-1&format=json");
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
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
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
        java.lang.Class<?> wildcardClass24 = urlBuilder21.getClass();
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
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=-1:-1&format=json");
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
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) (short) 1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
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
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json?date=0:10&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:0&format=json");
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
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=-1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json/indicator/?date=52:-1&format=json");
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
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder0.setYearEnd((int) (byte) -1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 10);
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
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=10:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/?date=1:0&format=json");
        java.lang.Class<?> wildcardClass17 = urlBuilder6.getClass();
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
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart(0);
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setYearEnd((int) (byte) 100);
        java.lang.Class<?> wildcardClass16 = urlBuilder12.getClass();
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
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:52&format=json");
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
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setYearStart(0);
        fetchers.Url url23 = urlBuilder22.build();
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder22.setYearStart((int) 'a');
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
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
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
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
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
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder20.setYearStart(0);
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
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart(0);
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
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
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
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder8.setYearStart((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder23.setanalysisMode("");
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
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setYearStart((int) (byte) 100);
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
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
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
        fetchers.Url.UrlBuilder urlBuilder30 = urlBuilder24.setYearStart((int) (byte) 100);
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
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
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
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
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
        java.lang.Class<?> wildcardClass23 = urlBuilder17.getClass();
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
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearStart((int) 'a');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setYearEnd((int) (short) 10);
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
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder19.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setYearStart((int) (byte) 0);
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
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearEnd(1);
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
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearEnd((int) (short) 0);
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
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
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
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
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
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder23.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=100:52&format=json");
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
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setYearStart((int) ' ');
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
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
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
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json");
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
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json/indicator/hi!?date=10:100&format=json");
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
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
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
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/?date=100:-1&format=json");
        java.lang.Class<?> wildcardClass5 = urlBuilder2.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
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
        java.lang.Class<?> wildcardClass19 = urlBuilder12.getClass();
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
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=32:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json/indicator/?date=1:52&format=json");
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
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url url9 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder2.setYearEnd((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder2.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setYearStart((int) (short) 100);
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
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
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
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json?date=0:-1&format=json");
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
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder0.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json?date=0:0&format=json");
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
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=10:0&format=json");
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
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json");
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
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=1:0&format=json");
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
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder2.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setYearStart(10);
        java.lang.Class<?> wildcardClass8 = urlBuilder2.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder2.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder5.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=97:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
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
        fetchers.Url url25 = urlBuilder24.build();
        fetchers.Url.UrlBuilder urlBuilder27 = urlBuilder24.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json/indicator/null?date=52:97&format=json");
        fetchers.Url url28 = urlBuilder27.build();
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
        org.junit.Assert.assertNotNull(url28);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/hi!?date=10:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart(100);
        java.lang.Class<?> wildcardClass19 = urlBuilder16.getClass();
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
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearEnd((int) (byte) 1);
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
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json");
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
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) (byte) 0);
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
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
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
        org.junit.Assert.assertNotNull(url19);
        org.junit.Assert.assertNotNull(urlBuilder21);
        org.junit.Assert.assertNotNull(url22);
        org.junit.Assert.assertNotNull(urlBuilder24);
        org.junit.Assert.assertNotNull(url25);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (byte) 10);
        fetchers.Url url11 = urlBuilder6.build();
        java.lang.String str12 = url11.toString();
        java.lang.String str13 = url11.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:10&format=json" + "'", str12, "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:10&format=json");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:10&format=json" + "'", str13, "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:10&format=json");
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) (byte) 1);
        fetchers.Url url17 = urlBuilder14.build();
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=100:-1&format=json");
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
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (short) 10);
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
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearEnd((int) ' ');
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
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=100:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearEnd(0);
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
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) '4');
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json" + "'", str16, "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json" + "'", str17, "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json");
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url url7 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder6.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd((int) (byte) 1);
        fetchers.Url url10 = urlBuilder7.build();
        fetchers.Url url11 = urlBuilder7.build();
        fetchers.Url url12 = urlBuilder7.build();
        java.lang.Class<?> wildcardClass13 = urlBuilder7.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(url10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:-1&format=json");
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
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url url7 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder6.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url url12 = urlBuilder11.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder11.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/?date=100:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json?date=1:0&format=json");
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
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:97&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
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
        fetchers.Url url19 = urlBuilder18.build();
        fetchers.Url url20 = urlBuilder18.build();
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
        org.junit.Assert.assertNotNull(url20);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setYearStart((int) ' ');
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
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder4.setYearStart((-1));
        fetchers.Url url14 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder4.setYearStart((int) (short) 1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(url14);
        org.junit.Assert.assertNotNull(urlBuilder16);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
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
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
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
        java.lang.Class<?> wildcardClass17 = url15.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json" + "'", str16, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearStart((int) 'a');
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
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
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
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (short) 100);
        fetchers.Url url15 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder10.setYearStart((int) '4');
        fetchers.Url url20 = urlBuilder10.build();
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
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:10&format=json");
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
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url url7 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:10&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json?date=52:97&format=json");
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
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setYearStart((int) (short) 10);
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
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json/indicator/hi!?date=0:-1&format=json");
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
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
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
        fetchers.Url url19 = urlBuilder18.build();
        java.lang.String str20 = url19.toString();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json/indicator/null?date=0:100&format=json?date=1:0&format=json" + "'", str20, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json/indicator/null?date=0:100&format=json?date=1:0&format=json");
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder14.setYearEnd(0);
        java.lang.Class<?> wildcardClass23 = urlBuilder14.getClass();
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
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart((int) (byte) 10);
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
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearStart((int) (short) 1);
        fetchers.Url url17 = urlBuilder12.build();
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
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearStart((int) (byte) 0);
        fetchers.Url url10 = urlBuilder9.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(url10);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((-1));
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
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setYearStart((int) (short) 1);
        fetchers.Url url9 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder8.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setYearEnd((int) (short) 1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=100:52&format=json");
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
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=10:1&format=json");
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
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json?date=10:100&format=json");
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
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder13.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearEnd((int) (byte) 0);
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
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url url9 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url url12 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
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
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart((int) (byte) 1);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:10&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
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
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
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
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder24.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=10:-1&format=json");
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
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(100);
        fetchers.Url url11 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder10.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:100&format=json");
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
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/?date=52:-1&format=json");
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
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
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
        java.lang.String str21 = url20.toString();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/?date=0:10&format=json" + "'", str21, "http://api.worldbank.org/v2/country/null/indicator/?date=0:10&format=json");
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearEnd((int) (byte) 0);
        fetchers.Url url20 = urlBuilder19.build();
        java.lang.String str21 = url20.toString();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=-1:0&format=json" + "'", str21, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=-1:0&format=json");
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
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
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder19.setanalysisMode("");
        fetchers.Url url24 = urlBuilder19.build();
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
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearStart((-1));
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
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
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
        java.lang.Class<?> wildcardClass22 = urlBuilder21.getClass();
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
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart(0);
        fetchers.Url url15 = urlBuilder14.build();
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
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:97&format=json/indicator/null?date=52:100&format=json");
        java.lang.Class<?> wildcardClass11 = urlBuilder6.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
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
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder5.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country//indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url url7 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder6.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=-1:1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder18.setYearStart((int) ' ');
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
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setYearEnd(100);
        fetchers.Url url21 = urlBuilder14.build();
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
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearStart((int) ' ');
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
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("");
        fetchers.Url url13 = urlBuilder12.build();
        java.lang.String str14 = url13.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json/indicator/?date=52:52&format=json" + "'", str14, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json/indicator/?date=52:52&format=json");
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
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
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder17.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder23.setYearEnd((int) (short) 1);
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
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json/indicator/null?date=52:52&format=json/indicator/hi!?date=52:0&format=json");
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
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json/indicator/hi!?date=97:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart(1);
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
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
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
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setYearStart((int) (byte) 1);
        java.lang.Class<?> wildcardClass22 = urlBuilder19.getClass();
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
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=10:-1&format=json");
        fetchers.Url url12 = urlBuilder4.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json");
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
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json");
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
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
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
        fetchers.Url.UrlBuilder urlBuilder27 = urlBuilder17.setanalysisMode("");
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
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=100:52&format=json/indicator/hi!?date=52:10&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json?date=0:1&format=json");
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
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd(100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url url14 = urlBuilder13.build();
        fetchers.Url url15 = urlBuilder13.build();
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
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder5.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder5.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder5.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder11.setYearEnd((int) (short) 1);
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
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url url8 = urlBuilder7.build();
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder7.setYearEnd(0);
        java.lang.Class<?> wildcardClass11 = urlBuilder10.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(url8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json/indicator/hi!?date=-1:-1&format=json");
        fetchers.Url url19 = urlBuilder18.build();
        java.lang.Class<?> wildcardClass20 = url19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearStart((int) (byte) -1);
        java.lang.Class<?> wildcardClass12 = urlBuilder9.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url url13 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder8.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json");
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
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((-1));
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setYearStart((int) (byte) 100);
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
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=0:-1&format=json");
        java.lang.Class<?> wildcardClass25 = urlBuilder22.getClass();
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
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder8.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json?date=10:100&format=json");
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
        org.junit.Assert.assertNotNull(urlBuilder22);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd((int) (short) 1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder22.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder22.setYearStart((int) 'a');
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
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder16.setYearStart((int) (short) 1);
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
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearStart((int) (short) 10);
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
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) -1);
        fetchers.Url url15 = urlBuilder10.build();
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
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearStart(10);
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
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
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
        fetchers.Url url20 = urlBuilder17.build();
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
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
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
        fetchers.Url url19 = urlBuilder18.build();
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder18.setYearEnd((int) '4');
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
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder7.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=52:0&format=json");
        fetchers.Url url16 = urlBuilder13.build();
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
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder0.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder0.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/null?date=0:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:32&format=json");
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
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder9.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearEnd((int) (short) 0);
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
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setYearEnd((int) (short) 1);
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
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
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
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearEnd((int) (short) 10);
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
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:10&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json?date=0:10&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearEnd((int) '#');
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
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder2.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setYearEnd(10);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder14.setYearEnd(1);
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
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder12.setYearEnd((int) '4');
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
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder12.setYearStart((int) (short) 10);
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
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearStart((int) (short) 1);
        fetchers.Url url16 = urlBuilder15.build();
        java.lang.Class<?> wildcardClass17 = url16.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(url16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
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
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url url9 = urlBuilder6.build();
        fetchers.Url url10 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(url10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (short) 0);
        fetchers.Url url9 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder6.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=52:-1&format=json");
        java.lang.Class<?> wildcardClass14 = urlBuilder13.getClass();
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
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/?date=0:-1&format=json");
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
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
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
        java.lang.Class<?> wildcardClass23 = urlBuilder22.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:35&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=52:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:100&format=json");
        fetchers.Url url12 = urlBuilder11.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
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
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=35:0&format=json");
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
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
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
        fetchers.Url url20 = urlBuilder8.build();
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
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:-1&format=json");
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
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder13.setYearStart((int) 'a');
        fetchers.Url url18 = urlBuilder17.build();
        java.lang.String str19 = url18.toString();
        java.lang.String str20 = url18.toString();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=97:0&format=json" + "'", str19, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=97:0&format=json");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=97:0&format=json" + "'", str20, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=97:0&format=json");
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:100&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json");
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
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=-1:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:-1&format=json");
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
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
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
        java.lang.Class<?> wildcardClass20 = urlBuilder15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json?date=10:100&format=json" + "'", str16, "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json?date=10:100&format=json");
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart(1);
        fetchers.Url url9 = urlBuilder2.build();
        java.lang.String str10 = url9.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/null?date=1:100&format=json" + "'", str10, "http://api.worldbank.org/v2/country/hi!/indicator/null?date=1:100&format=json");
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/hi!?date=10:1&format=json");
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
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setYearEnd(1);
        java.lang.Class<?> wildcardClass15 = urlBuilder6.getClass();
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
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd((int) (byte) 1);
        fetchers.Url url10 = urlBuilder7.build();
        fetchers.Url url11 = urlBuilder7.build();
        java.lang.Class<?> wildcardClass12 = urlBuilder7.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(url10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        java.lang.Class<?> wildcardClass10 = urlBuilder7.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=-1:-1&format=json");
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
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
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
        java.lang.Class<?> wildcardClass22 = url21.getClass();
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
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (byte) 10);
        fetchers.Url url11 = urlBuilder10.build();
        fetchers.Url url12 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((-1));
        fetchers.Url url15 = urlBuilder14.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country//indicator/?date=32:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (short) 0);
        fetchers.Url url9 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder8.setCountry("hi!");
        fetchers.Url url12 = urlBuilder11.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder11.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) (short) 0);
        fetchers.Url url17 = urlBuilder14.build();
        java.lang.String str18 = url17.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(url17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json" + "'", str18, "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json");
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json");
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
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json?date=0:-1&format=json" + "'", str20, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json?date=0:-1&format=json");
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearEnd(0);
        fetchers.Url url18 = urlBuilder15.build();
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
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url url7 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder6.setYearEnd((int) (short) 1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=10:1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=100:100&format=json");
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
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url url13 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder8.setYearEnd((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder19.setanalysisMode("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:-1&format=json");
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
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=52:97&format=json");
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
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd((int) (byte) 100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
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
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder22.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=-1:-1&format=json");
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
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder0.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
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
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart((int) (short) -1);
        fetchers.Url url11 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/?date=100:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=-1:52&format=json" + "'", str20, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=-1:52&format=json");
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url url7 = urlBuilder2.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder2.setYearEnd(100);
        fetchers.Url url6 = urlBuilder5.build();
        java.lang.String str7 = url6.toString();
        java.lang.Class<?> wildcardClass8 = url6.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(url6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=52:100&format=json" + "'", str7, "http://api.worldbank.org/v2/country/null/indicator/null?date=52:100&format=json");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
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
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json/indicator/?date=1:100&format=json");
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
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url url9 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder11.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder15.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder15.setYearEnd((int) (byte) 100);
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
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=-1:100&format=json");
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
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json/indicator/?date=0:-1&format=json");
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
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearStart(100);
        java.lang.Class<?> wildcardClass16 = urlBuilder15.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=52:-1&format=json?date=-1:0&format=json");
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
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json?date=35:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=0:0&format=json");
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
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setCountry("");
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
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url url15 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearStart((int) (short) -1);
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
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder2.setYearStart(0);
        fetchers.Url url10 = urlBuilder2.build();
        java.lang.String str11 = url10.toString();
        java.lang.String str12 = url10.toString();
        java.lang.String str13 = url10.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(url10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json" + "'", str11, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json" + "'", str12, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json" + "'", str13, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json");
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=-1:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder0.setYearEnd((int) (short) 10);
        fetchers.Url url11 = urlBuilder10.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearEnd((int) (byte) 1);
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
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=1:10&format=json");
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
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
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
        java.lang.Class<?> wildcardClass19 = urlBuilder18.getClass();
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
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
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
        fetchers.Url.UrlBuilder urlBuilder31 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json");
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
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setCountry("hi!");
        fetchers.Url url11 = urlBuilder2.build();
        java.lang.String str12 = url11.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json" + "'", str12, "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart((int) (short) 1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url url13 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/null?date=0:0&format=json");
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
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json?date=0:0&format=json");
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
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url15 = urlBuilder14.build();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:-1&format=json" + "'", str16, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:-1&format=json");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:-1&format=json" + "'", str17, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:-1&format=json");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:-1&format=json" + "'", str18, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:-1&format=json");
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url url7 = urlBuilder4.build();
        java.lang.String str8 = url7.toString();
        java.lang.String str9 = url7.toString();
        java.lang.String str10 = url7.toString();
        java.lang.String str11 = url7.toString();
        java.lang.String str12 = url7.toString();
        java.lang.String str13 = url7.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json" + "'", str8, "http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json" + "'", str9, "http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json" + "'", str10, "http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json" + "'", str11, "http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json" + "'", str12, "http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json" + "'", str13, "http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/null?date=0:0&format=json");
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
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder18.setYearStart(1);
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
        org.junit.Assert.assertNotNull(urlBuilder24);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearEnd(0);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json" + "'", str18, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json" + "'", str19, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json");
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
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
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=52:97&format=json");
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
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
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
        java.lang.Class<?> wildcardClass28 = urlBuilder27.getClass();
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
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=100:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=32:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:100&format=json?date=0:0&format=json");
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
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setCountry("");
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
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd((int) (byte) 100);
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setYearEnd(1);
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
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder7.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder7.setYearEnd((int) '#');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder5.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd((int) (short) -1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=-1:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setYearEnd(100);
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
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearEnd((int) (byte) 10);
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
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearStart((int) (byte) 1);
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
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setYearEnd((int) (short) 10);
        fetchers.Url url14 = urlBuilder9.build();
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart((int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = urlBuilder18.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) '4');
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url url12 = urlBuilder8.build();
        fetchers.Url url13 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder8.setYearStart((-1));
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(urlBuilder15);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) -1);
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setYearEnd((int) 'a');
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
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/?date=100:100&format=json");
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
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
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
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder22.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder22.setYearStart((int) (short) 10);
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
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json/indicator/hi!?date=0:-1&format=json");
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
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:1&format=json");
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
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearStart(100);
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
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder0.setYearEnd(10);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart(0);
        fetchers.Url url9 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder6.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setYearStart((int) (byte) 1);
        fetchers.Url url14 = urlBuilder11.build();
        java.lang.String str15 = url14.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(url14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=1:0&format=json" + "'", str15, "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=1:0&format=json");
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json/indicator/null?date=0:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder13.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json?date=32:100&format=json");
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
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) 'a');
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
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setYearStart((int) (short) 0);
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
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setYearEnd((int) (byte) -1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json");
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
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
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
        fetchers.Url.UrlBuilder urlBuilder27 = urlBuilder23.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=35:97&format=json");
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
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearStart((int) (byte) 100);
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
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json?date=100:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setYearStart((int) (byte) 10);
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
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder13.setYearStart((int) 'a');
        java.lang.Class<?> wildcardClass18 = urlBuilder13.getClass();
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
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json");
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
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = urlBuilder4.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((-1));
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setYearStart((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder15.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=-1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder15.setYearStart((-1));
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
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=32:-1&format=json");
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
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url url7 = urlBuilder6.build();
        java.lang.String str8 = url7.toString();
        java.lang.String str9 = url7.toString();
        java.lang.String str10 = url7.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:100&format=json" + "'", str8, "http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:100&format=json");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:100&format=json" + "'", str9, "http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:100&format=json");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:100&format=json" + "'", str10, "http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:100&format=json");
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=10:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearStart((int) '4');
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
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder17.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=10:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder17.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder23.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
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
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
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
        fetchers.Url url22 = urlBuilder21.build();
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
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setYearStart((int) (short) 100);
        java.lang.Class<?> wildcardClass25 = urlBuilder24.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        java.lang.Class<?> wildcardClass5 = urlBuilder0.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setYearEnd((int) (short) 10);
        fetchers.Url url14 = urlBuilder9.build();
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=10:-1&format=json");
        fetchers.Url url17 = urlBuilder9.build();
        java.lang.String str18 = url17.toString();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=10:-1&format=json?date=10:10&format=json" + "'", str18, "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=10:-1&format=json?date=10:10&format=json");
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=1:-1&format=json");
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
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json");
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
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json");
        java.lang.Class<?> wildcardClass21 = urlBuilder10.getClass();
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
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder18.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json/indicator/null?date=52:-1&format=json");
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
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
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
        fetchers.Url.UrlBuilder urlBuilder27 = urlBuilder25.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=-1:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
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
        org.junit.Assert.assertNotNull(urlBuilder27);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearStart((int) (short) 1);
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
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setYearStart((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json/indicator/hi!?date=-1:-1&format=json");
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
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:-1&format=json");
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
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder10.setYearStart((int) (short) 1);
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
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart(10);
        fetchers.Url url7 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
    }
}

