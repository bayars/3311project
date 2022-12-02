package fetchersrandoopoutput;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest35 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
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
        fetchers.Url url22 = urlBuilder19.build();
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
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=0:-1&format=json?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json?date=52:97&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:1&format=json");
        fetchers.Url url23 = urlBuilder22.build();
        fetchers.Url url24 = urlBuilder22.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
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
        org.junit.Assert.assertNotNull(url24);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        java.lang.Class<?> wildcardClass10 = urlBuilder0.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) -1);
        fetchers.Url url13 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder10.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearEnd(100);
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
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=100:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (byte) 0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:-1&format=json");
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
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/null?date=52:1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearEnd((int) (byte) -1);
        fetchers.Url url10 = urlBuilder4.build();
        fetchers.Url url11 = urlBuilder4.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(url10);
        org.junit.Assert.assertNotNull(url11);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearEnd(10);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setCountry("");
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
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder2.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder2.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:97&format=json");
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
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
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
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
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
        fetchers.Url url17 = urlBuilder14.build();
        java.lang.String str18 = url17.toString();
        java.lang.String str19 = url17.toString();
        java.lang.Class<?> wildcardClass20 = url17.getClass();
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
        org.junit.Assert.assertNotNull(url17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/hi!?date=52:100&format=json" + "'", str18, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/hi!?date=52:100&format=json");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/hi!?date=52:100&format=json" + "'", str19, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/hi!?date=52:100&format=json");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
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
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder23.setYearStart((int) (byte) 0);
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder7.setYearStart((int) (byte) -1);
        fetchers.Url url12 = urlBuilder7.build();
        java.lang.String str13 = url12.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json/indicator/hi!?date=-1:0&format=json" + "'", str13, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json/indicator/hi!?date=-1:0&format=json");
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setYearStart((int) '4');
        java.lang.Class<?> wildcardClass9 = urlBuilder8.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setCountry("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:-1&format=json");
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
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=1:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart((int) (byte) 100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder11.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/?date=100:-1&format=json/indicator/hi!?date=0:100&format=json");
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
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:-1&format=json");
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
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder13.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder13.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder13.setYearStart((-1));
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
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (short) 10);
        fetchers.Url url12 = urlBuilder9.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url url15 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder12.setYearEnd((int) 'a');
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
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
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
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder16.setYearEnd((int) (byte) 100);
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
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
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setYearEnd((int) ' ');
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
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
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
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder12.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder12.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder23.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json/indicator/hi!?date=-1:-1&format=json");
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
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearEnd(10);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
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
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder26.setYearStart((int) (byte) -1);
        fetchers.Url url29 = urlBuilder28.build();
        java.lang.String str30 = url29.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json/indicator/?date=-1:-1&format=json" + "'", str30, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json/indicator/?date=-1:-1&format=json");
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) 10);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearEnd(10);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
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
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder17.setYearEnd((int) '4');
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
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json");
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
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        java.lang.Class<?> wildcardClass11 = urlBuilder8.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 1);
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
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json?date=10:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearStart((int) (byte) 10);
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
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
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
        fetchers.Url url21 = urlBuilder20.build();
        java.lang.String str22 = url21.toString();
        java.lang.Class<?> wildcardClass23 = url21.getClass();
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
        org.junit.Assert.assertNotNull(url21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://api.worldbank.org/v2/country//indicator/?date=52:32&format=json" + "'", str22, "http://api.worldbank.org/v2/country//indicator/?date=52:32&format=json");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json?date=52:52&format=json");
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
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
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
        fetchers.Url url18 = urlBuilder17.build();
        java.lang.Class<?> wildcardClass19 = urlBuilder17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
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
        java.lang.Class<?> wildcardClass18 = urlBuilder15.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder26.setYearEnd(10);
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
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (byte) 10);
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
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setYearEnd((int) ' ');
        fetchers.Url url9 = urlBuilder0.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url url7 = urlBuilder6.build();
        java.lang.String str8 = url7.toString();
        java.lang.String str9 = url7.toString();
        java.lang.String str10 = url7.toString();
        java.lang.String str11 = url7.toString();
        java.lang.String str12 = url7.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json" + "'", str8, "http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json" + "'", str9, "http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json" + "'", str10, "http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json" + "'", str11, "http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json" + "'", str12, "http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json");
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=0:-1&format=json/indicator/hi!?date=52:97&format=json");
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
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:10&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=52:-1&format=json");
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
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json" + "'", str18, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json" + "'", str19, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json" + "'", str20, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json" + "'", str21, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json" + "'", str22, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json");
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json?date=52:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (byte) 100);
        fetchers.Url url13 = urlBuilder12.build();
        java.lang.String str14 = url13.toString();
        java.lang.String str15 = url13.toString();
        java.lang.String str16 = url13.toString();
        java.lang.Class<?> wildcardClass17 = url13.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json" + "'", str14, "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json" + "'", str15, "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json" + "'", str16, "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearEnd((int) ' ');
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
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
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart(1);
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
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 100);
        fetchers.Url url9 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder2.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/null?date=0:0&format=json");
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
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
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
        fetchers.Url url18 = urlBuilder17.build();
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder17.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=-1:100&format=json");
        fetchers.Url url21 = urlBuilder20.build();
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
        org.junit.Assert.assertNotNull(url21);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
        fetchers.Url url15 = urlBuilder14.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json/indicator/null?date=52:10&format=json");
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
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearEnd((int) 'a');
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
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url url8 = urlBuilder4.build();
        java.lang.String str9 = url8.toString();
        java.lang.String str10 = url8.toString();
        java.lang.String str11 = url8.toString();
        java.lang.String str12 = url8.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(url8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:1&format=json" + "'", str9, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:1&format=json");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:1&format=json" + "'", str10, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:1&format=json");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:1&format=json" + "'", str11, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:1&format=json");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:1&format=json" + "'", str12, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:1&format=json");
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=1:0&format=json");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder2.setYearEnd((int) (byte) 1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:-1&format=json" + "'", str21, "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:-1&format=json");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:-1&format=json" + "'", str22, "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:-1&format=json");
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=10:-1&format=json");
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
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd((int) (byte) 1);
        fetchers.Url url10 = urlBuilder7.build();
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:-1&format=json");
        fetchers.Url url13 = urlBuilder7.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(url10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:10&format=json/indicator/?date=100:100&format=json");
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
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder15.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearStart((int) (short) 10);
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
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearStart((int) (byte) -1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
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
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder19.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder19.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=52:0&format=json");
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
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=10:35&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json");
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
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd(10);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
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
        fetchers.Url url18 = urlBuilder8.build();
        java.lang.String str19 = url18.toString();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json?date=1:1&format=json" + "'", str19, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json?date=1:1&format=json");
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
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
        org.junit.Assert.assertNotNull(url18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder4.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder4.setYearStart(0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (byte) 10);
        fetchers.Url url11 = urlBuilder6.build();
        fetchers.Url url12 = urlBuilder6.build();
        java.lang.String str13 = url12.toString();
        java.lang.String str14 = url12.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=52:10&format=json" + "'", str13, "http://api.worldbank.org/v2/country/null/indicator/null?date=52:10&format=json");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=52:10&format=json" + "'", str14, "http://api.worldbank.org/v2/country/null/indicator/null?date=52:10&format=json");
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=10:-1&format=json/indicator/?date=1:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearEnd((int) (byte) 0);
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
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder4.setYearEnd(1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder0.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder0.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/?date=52:-1&format=json");
        fetchers.Url url15 = urlBuilder0.build();
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
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder13.setYearEnd((int) (short) 100);
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
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) -1);
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url url14 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=1:-1&format=json");
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
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
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
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
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
        fetchers.Url url27 = urlBuilder26.build();
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
        org.junit.Assert.assertNotNull(url27);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder2.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder5.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country//indicator/null?date=52:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder7.setYearStart((int) (byte) 1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url url8 = urlBuilder7.build();
        fetchers.Url url9 = urlBuilder7.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(url8);
        org.junit.Assert.assertNotNull(url9);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
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
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=35:-1&format=json");
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
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
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
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json");
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
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setYearEnd((-1));
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder12.setYearEnd((int) (short) 100);
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
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json?date=52:0&format=json");
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
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder13.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json/indicator/hi!?date=10:100&format=json");
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
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=0:-1&format=json");
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
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:-1&format=json");
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
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
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
        java.lang.String str20 = url19.toString();
        java.lang.Class<?> wildcardClass21 = url19.getClass();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json?date=97:100&format=json" + "'", str20, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json?date=97:100&format=json");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (short) 10);
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
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
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
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url url17 = urlBuilder14.build();
        java.lang.Class<?> wildcardClass18 = urlBuilder14.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(url17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setYearEnd((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder11.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json/indicator/?date=100:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder11.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json?date=0:-1&format=json");
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
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setCountry("");
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
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder12.setYearStart((int) (byte) 10);
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart(10);
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
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json");
        fetchers.Url url23 = urlBuilder22.build();
        fetchers.Url url24 = urlBuilder22.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
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
        org.junit.Assert.assertNotNull(url24);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
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
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder2.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder5.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder5.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder5.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder5.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=10:1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder12.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=-1:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
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
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:-1&format=json");
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
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (short) 0);
        fetchers.Url url9 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder8.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=10:35&format=json");
        fetchers.Url url16 = urlBuilder13.build();
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:10&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder13.setYearEnd((int) (short) 1);
        fetchers.Url url21 = urlBuilder13.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(url16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(url21);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder0.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json/indicator/?date=52:52&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder7.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder13.setYearStart((int) (short) -1);
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
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:10&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) '#');
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
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json?date=52:100&format=json?date=52:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder2.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json?date=52:-1&format=json");
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
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearEnd((int) '4');
        fetchers.Url url16 = urlBuilder15.build();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json?date=0:52&format=json" + "'", str17, "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json?date=0:52&format=json");
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
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
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder21.setYearEnd((int) ' ');
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
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearEnd((int) '4');
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setanalysisMode("");
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

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/null?date=-1:0&format=json");
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
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearStart((int) (byte) 100);
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
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country//indicator/?date=0:32&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json?date=1:1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json");
        fetchers.Url url15 = urlBuilder12.build();
        java.lang.Class<?> wildcardClass16 = urlBuilder12.getClass();
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
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder2.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder5.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder7.setYearEnd(10);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearStart((int) 'a');
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
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
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
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder22.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/null?date=0:100&format=json");
        fetchers.Url url26 = urlBuilder22.build();
        java.lang.Class<?> wildcardClass27 = urlBuilder22.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
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
        org.junit.Assert.assertNotNull(url26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) (short) 100);
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
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json/indicator/hi!?date=-1:32&format=json");
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
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
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
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (short) -1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart(10);
        fetchers.Url url9 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder6.setYearEnd((int) '#');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
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
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setYearEnd((-1));
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
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
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
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=10:0&format=json");
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
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder8.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json");
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
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
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
        fetchers.Url url17 = urlBuilder14.build();
        fetchers.Url url18 = urlBuilder14.build();
        fetchers.Url url19 = urlBuilder14.build();
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
        org.junit.Assert.assertNotNull(url18);
        org.junit.Assert.assertNotNull(url19);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder13.setYearStart(0);
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
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=35:-1&format=json" + "'", str21, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=35:-1&format=json");
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart(10);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart(1);
        java.lang.Class<?> wildcardClass19 = urlBuilder18.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url url8 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder4.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearStart((int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = urlBuilder14.getClass();
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
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url url15 = urlBuilder12.build();
        fetchers.Url url16 = urlBuilder12.build();
        java.lang.String str17 = url16.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(url16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json?date=52:100&format=json" + "'", str17, "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json?date=52:100&format=json");
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("");
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
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url url7 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder6.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearEnd((int) (short) -1);
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
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) 100);
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
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder4.setYearStart((int) (short) 10);
        fetchers.Url url11 = urlBuilder10.build();
        java.lang.String str12 = url11.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:1&format=json/indicator/hi!?date=10:0&format=json" + "'", str12, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:1&format=json/indicator/hi!?date=10:0&format=json");
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearStart((int) '#');
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
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:100&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=0:-1&format=json");
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
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart((-1));
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
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart(0);
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url url16 = urlBuilder15.build();
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder15.setYearStart(1);
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
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json/indicator/hi!?date=97:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder12.setYearEnd((-1));
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
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder0.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json");
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
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearStart((int) '#');
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
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country//indicator/null?date=52:1&format=json");
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
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearStart((int) (byte) 100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (byte) 10);
        fetchers.Url url11 = urlBuilder10.build();
        fetchers.Url url12 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) '4');
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
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
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
        java.lang.Class<?> wildcardClass20 = urlBuilder15.getClass();
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
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
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
        fetchers.Url url17 = urlBuilder16.build();
        java.lang.String str18 = url17.toString();
        java.lang.String str19 = url17.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(url17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=52:10&format=json" + "'", str18, "http://api.worldbank.org/v2/country/null/indicator/null?date=52:10&format=json");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=52:10&format=json" + "'", str19, "http://api.worldbank.org/v2/country/null/indicator/null?date=52:10&format=json");
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=97:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
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
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json?date=35:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
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
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url url9 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder6.setYearEnd((int) (short) 100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) (byte) -1);
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
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
        fetchers.Url url15 = urlBuilder14.build();
        java.lang.String str16 = url15.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json/indicator/null?date=10:100&format=json" + "'", str16, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json/indicator/null?date=10:100&format=json");
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:10&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder8.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder8.setanalysisMode("");
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
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=10:35&format=json");
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
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearStart((int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = urlBuilder14.getClass();
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
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearEnd(0);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:0&format=json" + "'", str18, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:0&format=json");
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder16.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setYearEnd((int) ' ');
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder2.setYearStart((int) '#');
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
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json/indicator/hi!?date=-1:-1&format=json");
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
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart(10);
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
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=35:-1&format=json");
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
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart((int) (byte) 100);
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
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
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
        fetchers.Url url19 = urlBuilder18.build();
        fetchers.Url url20 = urlBuilder18.build();
        java.lang.String str21 = url20.toString();
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
        org.junit.Assert.assertNotNull(url20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:-1&format=json" + "'", str21, "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:-1&format=json");
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
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
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder23.setanalysisMode("");
        fetchers.Url url26 = urlBuilder23.build();
        java.lang.String str27 = url26.toString();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/?date=1:97&format=json" + "'", str27, "http://api.worldbank.org/v2/country/hi!/indicator/?date=1:97&format=json");
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) (byte) 0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearEnd((int) 'a');
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

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
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
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder24.setYearStart(100);
        fetchers.Url url29 = urlBuilder24.build();
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
        org.junit.Assert.assertNotNull(urlBuilder28);
        org.junit.Assert.assertNotNull(url29);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) -1);
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setYearStart(10);
        fetchers.Url url16 = urlBuilder15.build();
        java.lang.Class<?> wildcardClass17 = urlBuilder15.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(url16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("");
        fetchers.Url url15 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder8.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder8.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setYearEnd((int) (byte) 1);
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
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=100:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=-1:1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:10&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder13.setYearEnd((int) (short) -1);
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
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json?date=52:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=35:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=52:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd(100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
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
        java.lang.String str19 = url18.toString();
        java.lang.String str20 = url18.toString();
        java.lang.String str21 = url18.toString();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:-1&format=json" + "'", str19, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:-1&format=json");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:-1&format=json" + "'", str20, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:-1&format=json");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:-1&format=json" + "'", str21, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:-1&format=json");
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
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
        fetchers.Url.UrlBuilder urlBuilder30 = urlBuilder28.setYearStart((int) (byte) 0);
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
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
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url url8 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder4.setYearStart(100);
        java.lang.Class<?> wildcardClass11 = urlBuilder4.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(url8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json?date=97:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=0:0&format=json");
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
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart((int) (byte) 0);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=10:1&format=json/indicator/null?date=1:0&format=json");
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
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
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
        fetchers.Url url25 = urlBuilder24.build();
        fetchers.Url.UrlBuilder urlBuilder27 = urlBuilder24.setYearEnd((int) '4');
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
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
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder15.setYearEnd((int) '4');
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
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (byte) 10);
        fetchers.Url url11 = urlBuilder10.build();
        fetchers.Url url12 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=10:-1&format=json/indicator/?date=1:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
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
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
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
        fetchers.Url url18 = urlBuilder2.build();
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
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setYearStart((int) '4');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
        java.lang.Class<?> wildcardClass11 = urlBuilder8.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:10&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder2.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder5.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:32&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart((int) (byte) 0);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder8.setYearStart((int) (byte) 10);
        fetchers.Url url16 = urlBuilder8.build();
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
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder2.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder5.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd((int) (byte) 0);
        java.lang.Class<?> wildcardClass10 = urlBuilder7.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
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
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder19.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder23.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:0&format=json");
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
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=10:-1&format=json/indicator/?date=1:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder18.setYearStart((int) (short) 100);
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
        org.junit.Assert.assertNotNull(urlBuilder24);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearEnd(10);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) (byte) -1);
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
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(10);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=10:97&format=json" + "'", str14, "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=10:97&format=json");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=10:97&format=json" + "'", str15, "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=10:97&format=json");
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) -1);
        fetchers.Url url13 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json/indicator/null?date=-1:100&format=json" + "'", str17, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json/indicator/null?date=-1:100&format=json");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json/indicator/null?date=-1:100&format=json" + "'", str18, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json/indicator/null?date=-1:100&format=json");
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=32:-1&format=json");
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
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd(1);
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json/indicator/null?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=0:-1&format=json");
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
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) -1);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json" + "'", str14, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json" + "'", str15, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json");
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
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
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder23.setYearStart((int) (short) 100);
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
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearEnd((int) (short) 1);
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearStart((int) 'a');
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=97:0&format=json" + "'", str17, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=97:0&format=json");
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
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
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
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
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder13.setYearStart(0);
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
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setYearStart(1);
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
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
        java.lang.String str21 = url20.toString();
        java.lang.Class<?> wildcardClass22 = url20.getClass();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json" + "'", str21, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json/indicator/null?date=-1:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setYearStart((int) (short) 1);
        fetchers.Url url17 = urlBuilder8.build();
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
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart(0);
        fetchers.Url url11 = urlBuilder10.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) -1);
        fetchers.Url url13 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder10.setYearStart((int) (short) 100);
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
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (short) 0);
        fetchers.Url url9 = urlBuilder8.build();
        fetchers.Url url10 = urlBuilder8.build();
        java.lang.String str11 = url10.toString();
        java.lang.Class<?> wildcardClass12 = url10.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(url10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json" + "'", str11, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
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
        java.lang.String str18 = url16.toString();
        java.lang.String str19 = url16.toString();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/?date=-1:-1&format=json" + "'", str18, "http://api.worldbank.org/v2/country/hi!/indicator/?date=-1:-1&format=json");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/?date=-1:-1&format=json" + "'", str19, "http://api.worldbank.org/v2/country/hi!/indicator/?date=-1:-1&format=json");
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=100:1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
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
        java.lang.String str21 = url20.toString();
        java.lang.String str22 = url20.toString();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json" + "'", str21, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json" + "'", str22, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json");
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
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
        fetchers.Url url20 = urlBuilder15.build();
        java.lang.String str21 = url20.toString();
        java.lang.String str22 = url20.toString();
        java.lang.String str23 = url20.toString();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/?date=0:10&format=json" + "'", str22, "http://api.worldbank.org/v2/country/null/indicator/?date=0:10&format=json");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/?date=0:10&format=json" + "'", str23, "http://api.worldbank.org/v2/country/null/indicator/?date=0:10&format=json");
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=-1:100&format=json");
        fetchers.Url url12 = urlBuilder11.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:-1&format=json?date=35:100&format=json");
        java.lang.Class<?> wildcardClass15 = urlBuilder14.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearEnd(1);
        java.lang.Class<?> wildcardClass7 = urlBuilder6.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder26.setCountry("");
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
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=35:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder2.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json/indicator/null?date=10:100&format=json");
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
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
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
        java.lang.String str18 = url17.toString();
        java.lang.String str19 = url17.toString();
        java.lang.String str20 = url17.toString();
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
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder8.setYearStart((int) '#');
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
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
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
        java.lang.Class<?> wildcardClass23 = urlBuilder8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:100&format=json");
        fetchers.Url url15 = urlBuilder12.build();
        java.lang.String str16 = url15.toString();
        java.lang.Class<?> wildcardClass17 = url15.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:100&format=json?date=100:0&format=json" + "'", str16, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:100&format=json?date=100:0&format=json");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder2.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder5.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder5.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder5.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=-1:-1&format=json?date=10:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setCountry("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder15.setYearStart(0);
        java.lang.Class<?> wildcardClass20 = urlBuilder19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder8.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder8.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json?date=35:100&format=json");
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
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (short) 0);
        fetchers.Url url15 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=0:100&format=json");
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
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
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
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder22.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=-1:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
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
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearEnd(100);
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
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json/indicator/?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:97&format=json/indicator/null?date=52:100&format=json");
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
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder14.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=35:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=-1:-1&format=json");
        fetchers.Url url16 = urlBuilder15.build();
        java.lang.Class<?> wildcardClass17 = urlBuilder15.getClass();
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
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder6.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=100:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json/indicator/hi!?date=10:1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=52:-1&format=json");
        fetchers.Url url21 = urlBuilder14.build();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=52:-1&format=json?date=52:52&format=json" + "'", str22, "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=52:-1&format=json?date=52:52&format=json");
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
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
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) (byte) 1);
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
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/hi!?date=10:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearStart((int) (short) 0);
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json/indicator/null?date=10:100&format=json");
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
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/?date=52:-1&format=json");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=52:-1&format=json/indicator/?date=-1:-1&format=json" + "'", str16, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=52:-1&format=json/indicator/?date=-1:-1&format=json");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=52:-1&format=json/indicator/?date=-1:-1&format=json" + "'", str17, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=52:-1&format=json/indicator/?date=-1:-1&format=json");
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearEnd((int) (byte) 0);
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
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json");
        fetchers.Url url10 = urlBuilder7.build();
        fetchers.Url url11 = urlBuilder7.build();
        java.lang.String str12 = url11.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(url10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json/indicator/hi!?date=52:0&format=json" + "'", str12, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json/indicator/hi!?date=52:0&format=json");
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:97&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=100:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json?date=52:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:10&format=json");
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
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) '#');
        fetchers.Url url7 = urlBuilder6.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) 1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=1:0&format=json");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearStart((int) 'a');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
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
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder21.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder27 = urlBuilder25.setYearEnd((int) (byte) 0);
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
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder4.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json?date=52:-1&format=json");
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
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder0.setYearEnd((int) (short) 1);
        fetchers.Url url11 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder10.setYearEnd((int) (byte) 0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
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
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url url9 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url url12 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setYearEnd((int) ' ');
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
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url url9 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country//indicator/?date=0:-1&format=json");
        fetchers.Url url14 = urlBuilder13.build();
        java.lang.Class<?> wildcardClass15 = urlBuilder13.getClass();
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
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/null?date=0:100&format=json");
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
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
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
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearEnd(0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=100:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/hi!?date=100:100&format=json");
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
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearEnd((int) (byte) -1);
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
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setCountry("");
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
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=10:-1&format=json");
        fetchers.Url url17 = urlBuilder16.build();
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder16.setYearEnd((int) (short) 0);
        fetchers.Url url20 = urlBuilder16.build();
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
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url url15 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=10:-1&format=json");
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
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
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
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder26.setYearStart((int) (short) -1);
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
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
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
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder20.setYearStart((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder27 = urlBuilder20.setYearEnd((int) (byte) 1);
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
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setCountry("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder11.setYearStart(10);
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
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) 100);
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
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setYearEnd((int) (byte) 0);
        fetchers.Url url9 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder8.setCountry("");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json/indicator/null?date=52:1&format=json");
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
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=52:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
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
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url url9 = urlBuilder6.build();
        fetchers.Url url10 = urlBuilder6.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(url10);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) (byte) 10);
        fetchers.Url url17 = urlBuilder16.build();
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder16.setYearEnd(100);
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
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder2.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder5.setanalysisMode("");
        fetchers.Url url8 = urlBuilder7.build();
        java.lang.String str9 = url8.toString();
        java.lang.String str10 = url8.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(url8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json" + "'", str9, "http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json" + "'", str10, "http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart((int) (byte) 0);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearEnd((int) 'a');
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
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
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
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
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
        fetchers.Url url17 = urlBuilder13.build();
        java.lang.String str18 = url17.toString();
        java.lang.Class<?> wildcardClass19 = url17.getClass();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=52:0&format=json" + "'", str18, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=52:0&format=json");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url url9 = urlBuilder8.build();
        fetchers.Url url10 = urlBuilder8.build();
        java.lang.String str11 = url10.toString();
        java.lang.String str12 = url10.toString();
        java.lang.String str13 = url10.toString();
        java.lang.String str14 = url10.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(url10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json" + "'", str11, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json" + "'", str12, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json" + "'", str13, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json" + "'", str14, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart(0);
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url url14 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder12.setYearStart((int) (short) -1);
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
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
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
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json/indicator/?date=52:10&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd(1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearEnd((int) 'a');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setYearEnd((int) '4');
        java.lang.Class<?> wildcardClass22 = urlBuilder19.getClass();
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
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country//indicator/?date=0:32&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart((int) ' ');
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
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder12.setYearStart((-1));
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
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url url8 = urlBuilder7.build();
        java.lang.String str9 = url8.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(url8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:1&format=json" + "'", str9, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:1&format=json");
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:100&format=json");
        java.lang.Class<?> wildcardClass14 = urlBuilder4.getClass();
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
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder17.setYearEnd((int) (byte) 10);
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
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder10.setYearEnd(100);
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
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder6.build();
        java.lang.String str8 = url7.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/null?date=0:-1&format=json" + "'", str8, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/null?date=0:-1&format=json");
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setYearStart(0);
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url url9 = urlBuilder8.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) '4');
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearStart((-1));
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
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url url6 = urlBuilder5.build();
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder5.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(100);
        fetchers.Url url13 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder10.setYearEnd((int) (byte) -1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(url6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(urlBuilder15);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json?date=32:100&format=json");
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
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setCountry("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder15.setYearEnd((int) (byte) -1);
        fetchers.Url url20 = urlBuilder15.build();
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
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder0.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json?date=0:10&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json");
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
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
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
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearStart((int) (short) -1);
        fetchers.Url url19 = urlBuilder14.build();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json?date=-1:100&format=json" + "'", str20, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json?date=-1:100&format=json");
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
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
        fetchers.Url.UrlBuilder urlBuilder33 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=52:-1&format=json?date=0:35&format=json");
        fetchers.Url url34 = urlBuilder20.build();
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
        org.junit.Assert.assertNotNull(url34);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url url11 = urlBuilder8.build();
        java.lang.String str12 = url11.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:100&format=json" + "'", str12, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:100&format=json");
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) ' ');
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
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder2.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) ' ');
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
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=10:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder6.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=100:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setYearStart((int) (byte) -1);
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url url17 = urlBuilder16.build();
        java.lang.String str18 = url17.toString();
        java.lang.String str19 = url17.toString();
        java.lang.Class<?> wildcardClass20 = url17.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(url17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/hi!?date=100:100&format=json" + "'", str18, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/hi!?date=100:100&format=json");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/hi!?date=100:100&format=json" + "'", str19, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/hi!?date=100:100&format=json");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
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
        fetchers.Url url23 = urlBuilder18.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=-1:-1&format=json");
        fetchers.Url url14 = urlBuilder13.build();
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder13.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("");
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
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
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
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder26.setYearStart((int) (short) 10);
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
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
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setCountry("");
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
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        java.lang.Class<?> wildcardClass5 = urlBuilder4.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart(100);
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
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart((int) (byte) 0);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json/indicator/null?date=52:10&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder15.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder15.setYearEnd((int) 'a');
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
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:100&format=json");
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
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) 0);
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
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json?date=10:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 1);
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
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:-1&format=json");
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
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((-1));
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
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart(1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setYearStart((int) 'a');
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
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) (short) -1);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/?date=-1:-1&format=json" + "'", str16, "http://api.worldbank.org/v2/country/null/indicator/?date=-1:-1&format=json");
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder2.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder5.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:97&format=json");
        fetchers.Url url8 = urlBuilder5.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(url8);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=1:-1&format=json");
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
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
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
        fetchers.Url url25 = urlBuilder20.build();
        java.lang.Class<?> wildcardClass26 = urlBuilder20.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder2.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder5.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=1:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
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
        fetchers.Url url20 = urlBuilder11.build();
        fetchers.Url url21 = urlBuilder11.build();
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
        org.junit.Assert.assertNotNull(url21);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json?date=10:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
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
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
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
        java.lang.String str25 = url24.toString();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json?date=0:0&format=json" + "'", str25, "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json?date=0:0&format=json");
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
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
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder15.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/?date=-1:-1&format=json");
        fetchers.Url url24 = urlBuilder23.build();
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
        org.junit.Assert.assertNotNull(url24);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/hi!?date=10:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) '#');
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
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder16.setYearStart(0);
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json?date=97:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url url14 = urlBuilder13.build();
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder13.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("");
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
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
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
        fetchers.Url.UrlBuilder urlBuilder31 = urlBuilder29.setYearStart((int) '4');
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
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=0:0&format=json");
        fetchers.Url url5 = urlBuilder2.build();
        java.lang.String str6 = url5.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=0:0&format=json?date=52:0&format=json" + "'", str6, "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=0:0&format=json?date=52:0&format=json");
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
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
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
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
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder17.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=-1:100&format=json");
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
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearEnd((int) ' ');
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
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=100:1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country//indicator/?date=0:-1&format=json");
        fetchers.Url url10 = urlBuilder7.build();
        java.lang.String str11 = url10.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(url10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=0:-1&format=json/indicator/hi!?date=52:97&format=json" + "'", str11, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=0:-1&format=json/indicator/hi!?date=52:97&format=json");
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (byte) 100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:-1&format=json");
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
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (byte) 1);
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setYearEnd((int) (short) -1);
        fetchers.Url url16 = urlBuilder12.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(url16);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=1:-1&format=json?date=1:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder17.setYearStart((int) (short) 1);
        fetchers.Url url22 = urlBuilder21.build();
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
        org.junit.Assert.assertNotNull(url22);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=-1:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setYearEnd((int) (short) 100);
        fetchers.Url url15 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder6.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder6.setanalysisMode("");
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
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json/indicator/hi!?date=-1:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder15.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:97&format=json");
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
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/null?date=-1:0&format=json");
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
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=10:-1&format=json");
        fetchers.Url url27 = urlBuilder20.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
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
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder17.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder17.setYearStart((int) (byte) 0);
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
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url url10 = urlBuilder9.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(url10);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder14.setYearEnd((int) (byte) 1);
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
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
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
        java.lang.String str20 = url19.toString();
        java.lang.Class<?> wildcardClass21 = url19.getClass();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=-1:0&format=json" + "'", str20, "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=-1:0&format=json");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) 'a');
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
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/hi!?date=100:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=-1:100&format=json");
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
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url url12 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country//indicator/?date=1:100&format=json");
        fetchers.Url url17 = urlBuilder16.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(url17);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url url9 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder11.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder11.setYearEnd((int) '#');
        java.lang.Class<?> wildcardClass18 = urlBuilder17.getClass();
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
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setYearEnd((int) '#');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd(1);
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
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((-1));
        fetchers.Url url13 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder10.setYearStart((int) (byte) 10);
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
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder12.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder12.setYearStart((int) ' ');
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=1:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder12.setYearEnd(100);
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
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder7.setanalysisMode("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=-1:0&format=json");
        fetchers.Url url12 = urlBuilder11.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) (byte) 10);
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
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:100&format=json?date=100:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
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
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json?date=0:-1&format=json");
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
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) '4');
        fetchers.Url url11 = urlBuilder8.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearEnd(1);
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
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
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
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearEnd(10);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setYearEnd(10);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=10:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setYearEnd(1);
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
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=52:-1&format=json/indicator/?date=100:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart(0);
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
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) (short) -1);
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
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=32:-1&format=json");
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
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearEnd((int) '#');
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
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
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
        java.lang.Class<?> wildcardClass20 = urlBuilder19.getClass();
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
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/?date=52:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 100);
        fetchers.Url url9 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder2.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder2.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=10:97&format=json");
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
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url url12 = urlBuilder11.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder11.setYearStart(0);
        fetchers.Url url15 = urlBuilder14.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder14.setCountry("");
        fetchers.Url url18 = urlBuilder17.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(url18);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder4.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearStart((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder17.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json");
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
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart(1);
        fetchers.Url url9 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json?date=52:100&format=json");
        java.lang.Class<?> wildcardClass12 = urlBuilder2.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
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
        fetchers.Url url21 = urlBuilder14.build();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json/indicator/hi!?date=10:52&format=json" + "'", str22, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json/indicator/hi!?date=10:52&format=json");
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
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
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setYearEnd((int) (byte) 1);
        fetchers.Url url17 = urlBuilder8.build();
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
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setYearEnd((int) ' ');
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json/indicator/hi!?date=0:97&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (short) 100);
        fetchers.Url url15 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder10.setYearStart((int) (short) 1);
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
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=100:-1&format=json");
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

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=52:0&format=json");
        fetchers.Url url17 = urlBuilder8.build();
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
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
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
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=0:0&format=json");
        java.lang.Class<?> wildcardClass21 = urlBuilder18.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
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
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
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
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearStart((int) 'a');
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
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=10:-1&format=json");
        fetchers.Url url13 = urlBuilder12.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
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
        fetchers.Url url20 = urlBuilder19.build();
        java.lang.String str21 = url20.toString();
        java.lang.String str22 = url20.toString();
        java.lang.String str23 = url20.toString();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=-1:100&format=json?date=10:0&format=json" + "'", str21, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=-1:100&format=json?date=10:0&format=json");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=-1:100&format=json?date=10:0&format=json" + "'", str22, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=-1:100&format=json?date=10:0&format=json");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=-1:100&format=json?date=10:0&format=json" + "'", str23, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=-1:100&format=json?date=10:0&format=json");
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json?date=0:-1&format=json");
        java.lang.Class<?> wildcardClass9 = urlBuilder0.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=97:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
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
        fetchers.Url url19 = urlBuilder18.build();
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder18.setYearStart((int) (byte) 0);
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
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
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
        fetchers.Url url21 = urlBuilder16.build();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json?date=0:0&format=json" + "'", str22, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json?date=0:0&format=json");
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=1:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json");
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
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setYearEnd((int) (byte) -1);
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
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
        fetchers.Url url19 = urlBuilder18.build();
        fetchers.Url url20 = urlBuilder18.build();
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:-1&format=json");
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
        org.junit.Assert.assertNotNull(url20);
        org.junit.Assert.assertNotNull(urlBuilder22);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) 100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setYearEnd((int) (byte) 100);
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
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json" + "'", str16, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json" + "'", str17, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json" + "'", str18, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearEnd(1);
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
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=52:10&format=json");
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
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=1:10&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearStart((int) (short) 0);
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=97:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
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
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
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
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder21.setYearEnd((int) '4');
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
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearEnd(10);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/hi!?date=1:1&format=json" + "'", str22, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/hi!?date=1:1&format=json");
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
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
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder26.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=-1:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder13.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearStart(1);
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
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("hi!");
        fetchers.Url url13 = urlBuilder10.build();
        java.lang.String str14 = url13.toString();
        java.lang.Class<?> wildcardClass15 = url13.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/?date=52:-1&format=json" + "'", str14, "http://api.worldbank.org/v2/country/hi!/indicator/?date=52:-1&format=json");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder8.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json?date=1:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setYearEnd((int) (byte) 1);
        fetchers.Url url25 = urlBuilder24.build();
        fetchers.Url.UrlBuilder urlBuilder27 = urlBuilder24.setYearEnd((int) (short) 0);
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=10:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder15.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=100:52&format=json");
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
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
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
        fetchers.Url url27 = urlBuilder8.build();
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
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setYearStart((int) (short) 1);
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setCountry("");
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
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
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
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setYearStart(100);
        fetchers.Url url22 = urlBuilder21.build();
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
        org.junit.Assert.assertNotNull(url22);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd(1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) 1);
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
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = urlBuilder8.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=100:0&format=json");
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
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url url11 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearStart((int) (byte) 10);
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
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=-1:100&format=json?date=10:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json?date=97:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url url20 = urlBuilder13.build();
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
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
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
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder15.setYearStart(100);
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
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=1:-1&format=json" + "'", str18, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=1:-1&format=json");
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
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
        fetchers.Url url21 = urlBuilder20.build();
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder20.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder23.setYearEnd((int) (short) 10);
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
        org.junit.Assert.assertNotNull(url21);
        org.junit.Assert.assertNotNull(urlBuilder23);
        org.junit.Assert.assertNotNull(urlBuilder25);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=-1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=35:0&format=json");
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
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json/indicator/null?date=-1:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearEnd((int) (byte) 100);
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
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
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
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url url9 = urlBuilder8.build();
        java.lang.String str10 = url9.toString();
        java.lang.String str11 = url9.toString();
        java.lang.String str12 = url9.toString();
        java.lang.String str13 = url9.toString();
        java.lang.String str14 = url9.toString();
        java.lang.String str15 = url9.toString();
        java.lang.String str16 = url9.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json" + "'", str10, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json" + "'", str11, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json" + "'", str12, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json" + "'", str13, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json" + "'", str14, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json" + "'", str15, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json" + "'", str16, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder10.setYearEnd((int) (short) 1);
        fetchers.Url url21 = urlBuilder10.build();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json?date=1:1&format=json" + "'", str22, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json?date=1:1&format=json");
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        fetchers.Url url12 = urlBuilder9.build();
        java.lang.String str13 = url12.toString();
        java.lang.String str14 = url12.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json?date=52:100&format=json" + "'", str13, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json?date=52:100&format=json");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json?date=52:100&format=json" + "'", str14, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json?date=52:100&format=json");
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
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
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
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
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        java.lang.Class<?> wildcardClass11 = urlBuilder10.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=0:-1&format=json/indicator/hi!?date=52:97&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url url9 = urlBuilder8.build();
        java.lang.String str10 = url9.toString();
        java.lang.String str11 = url9.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=97:0&format=json" + "'", str10, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=97:0&format=json");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=97:0&format=json" + "'", str11, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=97:0&format=json");
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
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
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearStart((int) (byte) 10);
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
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder11.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=-1:-1&format=json");
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
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearEnd((int) (byte) 10);
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
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:100&format=json?date=1:-1&format=json" + "'", str20, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:100&format=json?date=1:-1&format=json");
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
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
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=100:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url url1 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder3 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder3.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder3.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json?date=1:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder3.setCountry("");
        org.junit.Assert.assertNotNull(url1);
        org.junit.Assert.assertNotNull(urlBuilder3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/hi!?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json?date=97:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
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
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=-1:-1&format=json");
        java.lang.Class<?> wildcardClass8 = urlBuilder7.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setYearStart((int) (short) -1);
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url url8 = urlBuilder7.build();
        fetchers.Url url9 = urlBuilder7.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder7.setYearEnd((int) (short) -1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(url8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
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
        java.lang.Class<?> wildcardClass22 = urlBuilder20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart((int) (short) 100);
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
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=10:-1&format=json");
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
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json/indicator/hi!?date=10:52&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearEnd((int) ' ');
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
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder18.setYearEnd((int) (byte) 0);
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
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder0.setYearEnd((int) (short) 100);
        java.lang.Class<?> wildcardClass12 = urlBuilder0.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearEnd(10);
        fetchers.Url url10 = urlBuilder9.build();
        java.lang.String str11 = url10.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(url10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=52:10&format=json" + "'", str11, "http://api.worldbank.org/v2/country/null/indicator/null?date=52:10&format=json");
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json");
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
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) 100);
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
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json");
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
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/?date=1:97&format=json");
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
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
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
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder23.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:10&format=json");
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
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setYearEnd((int) (short) 1);
        fetchers.Url url14 = urlBuilder13.build();
        fetchers.Url url15 = urlBuilder13.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder13.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=35:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(url14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(urlBuilder17);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json/indicator/hi!?date=52:0&format=json");
        fetchers.Url url14 = urlBuilder9.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(url14);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=-1:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
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
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
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
        fetchers.Url url21 = urlBuilder18.build();
        java.lang.String str22 = url21.toString();
        java.lang.String str23 = url21.toString();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json?date=100:-1&format=json" + "'", str22, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json?date=100:-1&format=json");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json?date=100:-1&format=json" + "'", str23, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json?date=100:-1&format=json");
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
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
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder12.setYearEnd((int) (short) 10);
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
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (byte) 0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:10&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json");
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
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:100&format=json?date=0:0&format=json");
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
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url url10 = urlBuilder7.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(url10);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url url13 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(urlBuilder15);
    }
}

