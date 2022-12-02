package randoopoutput;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest39 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getPassword();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str11 = user0.getPassword();
        java.lang.String str12 = user0.getName();
        java.lang.String str13 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str12, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]" + "'", str13, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        user0.setPassword("User [name=, id=0, email=null, password=null]");
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=hi!], id=0, email=null, password=]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str8, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str9, "User [name=, id=0, email=null, password=null]");
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("");
        java.lang.String str6 = user0.toString();
        java.lang.String str7 = user0.toString();
        java.lang.String str8 = user0.toString();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str11 = user0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str6, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str7, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str8, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]" + "'", str11, "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]");
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getName();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.toString();
        user0.setName("");
        java.lang.String str9 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str6, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str9, "User [name=, id=0, email=null, password=null]");
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]");
        java.lang.String str6 = user0.getPassword();
        user0.setPassword("User [name=null, id=0, email=null, password=]");
        java.lang.String str9 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]" + "'", str6, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=]]" + "'", str9, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=]]");
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("hi!");
        java.lang.String str6 = user0.toString();
        java.lang.String str7 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=hi!]" + "'", str6, "User [name=null, id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=hi!]" + "'", str7, "User [name=null, id=0, email=null, password=hi!]");
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str10 = user0.getPassword();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        java.lang.String str15 = user0.toString();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=hi!]");
        java.lang.String str20 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]], id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str15, "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]], id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]" + "'", str20, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setName("User [name=, id=0, email=null, password=null]");
        java.lang.String str8 = user0.getName();
        java.lang.String str9 = user0.getName();
        java.lang.String str10 = user0.toString();
        java.lang.String str11 = user0.toString();
        java.lang.String str12 = user0.getPassword();
        java.lang.String str13 = user0.toString();
        user0.setName("User [name=User [name=null, id=0, email=null, password=hi!], id=0, email=null, password=User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str8, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str9, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=null]" + "'", str10, "User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=null]" + "'", str11, "User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=null]" + "'", str13, "User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=null]");
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.getPassword();
        user0.setName("User [name=, id=0, email=null, password=null]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.toString();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.toString();
        java.lang.String str7 = user0.toString();
        user0.setName("User [name=User [name=User [name=, id=0, email=null, password=hi!], id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str6, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str7, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        java.lang.String str2 = user0.getName();
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.getPassword();
        user0.setPassword("User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]], id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        java.lang.String str7 = user0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]], id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]" + "'", str7, "User [name=null, id=0, email=null, password=User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]], id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]");
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.toString();
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=]" + "'", str7, "User [name=null, id=0, email=null, password=]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        java.lang.String str7 = user0.getPassword();
        user0.setName("hi!");
        user0.setPassword("hi!");
        user0.setName("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        java.lang.String str14 = user0.getPassword();
        java.lang.String str15 = user0.getPassword();
        java.lang.String str16 = user0.getName();
        user0.setName("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str16, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str5 = user0.toString();
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]" + "'", str5, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]");
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str9 = user0.getPassword();
        user0.setPassword("User [name=, id=0, email=null, password=]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]" + "'", str9, "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str10 = user0.getPassword();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        java.lang.String str13 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("hi!");
        java.lang.String str8 = user0.toString();
        java.lang.String str9 = user0.toString();
        java.lang.String str10 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str8, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str9, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        login.User user0 = new login.User();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.toString();
        user0.setPassword("User [name=hi!, id=0, email=null, password=hi!]");
        java.lang.String str7 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str3, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str4, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=User [name=hi!, id=0, email=null, password=hi!]]" + "'", str7, "User [name=null, id=0, email=null, password=User [name=hi!, id=0, email=null, password=hi!]]");
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        user0.setPassword("hi!");
        user0.setName("User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getName();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=]");
        user0.setName("User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=], id=0, email=null, password=hi!]");
        user0.setPassword("User [name=, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]]");
        java.lang.Class<?> wildcardClass17 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("hi!");
        user0.setName("User [name=null, id=0, email=null, password=hi!]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        java.lang.String str12 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]" + "'", str12, "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.toString();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str7 = user0.getName();
        java.lang.String str8 = user0.toString();
        java.lang.String str9 = user0.toString();
        java.lang.String str10 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]" + "'", str8, "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]" + "'", str9, "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]" + "'", str10, "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        java.lang.String str6 = user0.getName();
        java.lang.String str7 = user0.toString();
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str7, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str9, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        user0.setName("hi!");
        user0.setName("");
        user0.setPassword("User [name=hi!, id=0, email=null, password=hi!]");
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str12 = user0.getPassword();
        java.lang.String str13 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.getName();
        java.lang.String str3 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.toString();
        java.lang.String str8 = user0.getName();
        java.lang.String str9 = user0.toString();
        java.lang.String str10 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=]" + "'", str7, "User [name=null, id=0, email=null, password=]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=]" + "'", str9, "User [name=null, id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=]" + "'", str10, "User [name=null, id=0, email=null, password=]");
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        user0.setPassword("hi!");
        user0.setName("User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.toString();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        java.lang.String str6 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        user0.setPassword("User [name=User [name=, id=0, email=null, password=hi!], id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]" + "'", str6, "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]");
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("hi!");
        java.lang.String str8 = user0.getName();
        java.lang.String str9 = user0.getName();
        java.lang.String str10 = user0.toString();
        java.lang.String str11 = user0.toString();
        user0.setName("User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]");
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]]");
        java.lang.String str18 = user0.toString();
        user0.setName("User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=null]");
        java.lang.Class<?> wildcardClass21 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str8, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str9, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str10, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]]]" + "'", str18, "User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]]]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.toString();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getName();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        user0.setName("User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setName("User [name=hi!, id=0, email=null, password=]");
        user0.setPassword("User [name=, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("hi!");
        java.lang.String str8 = user0.getName();
        java.lang.String str9 = user0.getName();
        java.lang.String str10 = user0.toString();
        java.lang.String str11 = user0.toString();
        java.lang.String str12 = user0.getName();
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str8, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str9, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str10, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str12, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]], id=0, email=null, password=]");
        java.lang.Class<?> wildcardClass5 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("hi!");
        java.lang.String str8 = user0.toString();
        java.lang.String str9 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]]");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        java.lang.String str14 = user0.toString();
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str8, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User [name=User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]" + "'", str14, "User [name=User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("hi!");
        java.lang.String str8 = user0.toString();
        java.lang.String str9 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        user0.setPassword("User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]], id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        java.lang.String str14 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str8, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str9, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]], id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]" + "'", str14, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]], id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]");
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getName();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.toString();
        user0.setName("");
        java.lang.String str9 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str6, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        java.lang.String str6 = user0.getName();
        java.lang.String str7 = user0.toString();
        java.lang.String str8 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=hi!]");
        user0.setName("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        java.lang.String str13 = user0.getPassword();
        java.lang.String str14 = user0.getPassword();
        java.lang.String str15 = user0.getPassword();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=, id=0, email=null, password=null]]");
        java.lang.String str18 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str7, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=, id=0, email=null, password=null]]" + "'", str18, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=, id=0, email=null, password=null]]");
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.toString();
        java.lang.String str9 = user0.getPassword();
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str7, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]" + "'", str8, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str9, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        java.lang.String str8 = user0.getPassword();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]" + "'", str8, "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        java.lang.String str6 = user0.getPassword();
        user0.setName("User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.toString();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getName();
        user0.setPassword("User [name=, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        user0.setName("User [name=null, id=0, email=null, password=User [name=, id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        user0.setName("hi!");
        java.lang.String str8 = user0.getName();
        user0.setName("User [name=null, id=0, email=null, password=hi!]");
        java.lang.String str11 = user0.getName();
        java.lang.String str12 = user0.getName();
        java.lang.String str13 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=null, id=0, email=null, password=hi!]" + "'", str11, "User [name=null, id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=null, id=0, email=null, password=hi!]" + "'", str12, "User [name=null, id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=User [name=null, id=0, email=null, password=hi!], id=0, email=null, password=]" + "'", str13, "User [name=User [name=null, id=0, email=null, password=hi!], id=0, email=null, password=]");
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        java.lang.String str5 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=], id=0, email=null, password=null]" + "'", str5, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=], id=0, email=null, password=null]");
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("");
        java.lang.String str10 = user0.getName();
        java.lang.String str11 = user0.toString();
        java.lang.String str12 = user0.getName();
        java.lang.String str13 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str10, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str12, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]" + "'", str13, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setPassword("User [name=null, id=0, email=null, password=]");
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]");
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("hi!");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str12 = user0.getPassword();
        java.lang.String str13 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str12, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str13, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        user0.setName("");
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        java.lang.String str10 = user0.getPassword();
        java.lang.String str11 = user0.getPassword();
        java.lang.String str12 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setName("User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]" + "'", str10, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]" + "'", str11, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]" + "'", str12, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        java.lang.String str7 = user0.toString();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=null]" + "'", str7, "User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=null]");
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]");
        user0.setName("User [name=null, id=0, email=null, password=hi!]");
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str10 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=hi!]" + "'", str10, "User [name=null, id=0, email=null, password=hi!]");
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("");
        java.lang.String str4 = user0.getName();
        java.lang.String str5 = user0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("hi!");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str12 = user0.getPassword();
        user0.setName("User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=hi!]]");
        java.lang.String str15 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str12, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=hi!]]" + "'", str15, "User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=hi!]]");
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.getPassword();
        user0.setName("User [name=, id=0, email=null, password=null]");
        java.lang.String str5 = user0.toString();
        java.lang.String str6 = user0.getName();
        user0.setPassword("User [name=, id=0, email=null, password=User [name=User [name=, id=0, email=null, password=hi!], id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=null]" + "'", str5, "User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str6, "User [name=, id=0, email=null, password=null]");
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        user0.setName("hi!");
        java.lang.String str8 = user0.getName();
        java.lang.String str9 = user0.getName();
        user0.setPassword("User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]], id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        java.lang.String str12 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]], id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str12, "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]], id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("");
        user0.setPassword("hi!");
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]");
        java.lang.String str12 = user0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]]" + "'", str12, "User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]]");
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        java.lang.String str7 = user0.getPassword();
        user0.setName("hi!");
        user0.setPassword("hi!");
        java.lang.String str12 = user0.getName();
        user0.setName("hi!");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]");
        java.lang.String str17 = user0.getPassword();
        java.lang.String str18 = user0.getPassword();
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=hi!, id=0, email=null, password=hi!]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]" + "'", str17, "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]" + "'", str18, "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]");
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.toString();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        java.lang.String str8 = user0.toString();
        java.lang.String str9 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]]" + "'", str8, "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]]");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        java.lang.String str6 = user0.getName();
        java.lang.String str7 = user0.toString();
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.toString();
        user0.setPassword("");
        user0.setName("User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=hi!]");
        java.lang.String str14 = user0.getName();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str7, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str9, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=hi!]" + "'", str14, "User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=hi!]");
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getPassword();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str11 = user0.getPassword();
        java.lang.String str12 = user0.getName();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        java.lang.String str15 = user0.getName();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=], id=0, email=null, password=hi!]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str12, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]" + "'", str15, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        java.lang.String str2 = user0.getName();
        java.lang.Class<?> wildcardClass3 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("");
        user0.setPassword("hi!");
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        java.lang.String str12 = user0.toString();
        java.lang.String str13 = user0.getPassword();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]" + "'", str12, "User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str13, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        java.lang.String str6 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=hi!], id=0, email=null, password=hi!]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        java.lang.String str2 = user0.getName();
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.toString();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str6, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        java.lang.String str6 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        java.lang.String str9 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]" + "'", str9, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getPassword();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str11 = user0.getPassword();
        java.lang.String str12 = user0.getName();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str15 = user0.getPassword();
        user0.setName("");
        java.lang.String str18 = user0.getName();
        java.lang.Class<?> wildcardClass19 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str12, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str15, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.toString();
        java.lang.String str5 = user0.toString();
        java.lang.String str6 = user0.toString();
        user0.setName("User [name=, id=0, email=null, password=hi!]");
        java.lang.String str9 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str6, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=, id=0, email=null, password=hi!], id=0, email=null, password=null]" + "'", str9, "User [name=User [name=, id=0, email=null, password=hi!], id=0, email=null, password=null]");
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        java.lang.String str6 = user0.getName();
        java.lang.String str7 = user0.toString();
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.toString();
        user0.setPassword("");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str7, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str9, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]" + "'", str7, "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]" + "'", str8, "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("hi!");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str12 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str12, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setPassword("User [name=, id=0, email=null, password=null]");
        java.lang.String str7 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=, id=0, email=null, password=null]]" + "'", str7, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=, id=0, email=null, password=null]]");
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        java.lang.String str6 = user0.getName();
        java.lang.String str7 = user0.toString();
        java.lang.String str8 = user0.getPassword();
        user0.setPassword("");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        user0.setPassword("User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str7, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        java.lang.String str6 = user0.getName();
        java.lang.String str7 = user0.toString();
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.toString();
        user0.setPassword("User [name=, id=0, email=null, password=hi!]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str7, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str9, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        user0.setName("hi!");
        user0.setName("");
        java.lang.String str10 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        java.lang.String str7 = user0.getPassword();
        user0.setName("hi!");
        user0.setPassword("hi!");
        java.lang.String str12 = user0.toString();
        java.lang.String str13 = user0.getPassword();
        java.lang.String str14 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=hi!, id=0, email=null, password=hi!]" + "'", str12, "User [name=hi!, id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getPassword();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str11 = user0.getPassword();
        java.lang.String str12 = user0.getName();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        java.lang.String str15 = user0.getPassword();
        java.lang.String str16 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str12, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str15, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]" + "'", str16, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        user0.setName("hi!");
        java.lang.String str8 = user0.getName();
        java.lang.String str9 = user0.toString();
        java.lang.String str10 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=hi!, id=0, email=null, password=]" + "'", str9, "User [name=hi!, id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=hi!, id=0, email=null, password=]" + "'", str10, "User [name=hi!, id=0, email=null, password=]");
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str5 = user0.getName();
        java.lang.String str6 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str5, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str6, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getName();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=]");
        user0.setPassword("User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=], id=0, email=null, password=]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        java.lang.String str7 = user0.getPassword();
        user0.setName("hi!");
        user0.setPassword("hi!");
        java.lang.String str12 = user0.getName();
        user0.setName("hi!");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]");
        java.lang.String str17 = user0.getPassword();
        java.lang.String str18 = user0.getPassword();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]" + "'", str17, "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]" + "'", str18, "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]");
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        java.lang.String str7 = user0.getPassword();
        user0.setName("hi!");
        user0.setPassword("hi!");
        user0.setName("hi!");
        user0.setPassword("hi!");
        java.lang.String str16 = user0.getName();
        java.lang.String str17 = user0.getPassword();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str20 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "User [name=hi!, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]" + "'", str20, "User [name=hi!, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str9 = user0.toString();
        java.lang.String str10 = user0.toString();
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]" + "'", str9, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]" + "'", str10, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.toString();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]");
        user0.setPassword("User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=hi!]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.toString();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        java.lang.String str6 = user0.toString();
        java.lang.String str7 = user0.toString();
        user0.setName("User [name=User [name=, id=0, email=null, password=hi!], id=0, email=null, password=null]");
        user0.setName("User [name=User [name=, id=0, email=null, password=hi!], id=0, email=null, password=null]");
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]" + "'", str6, "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]" + "'", str7, "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        java.lang.String str6 = user0.getName();
        java.lang.String str7 = user0.toString();
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.toString();
        user0.setPassword("");
        user0.setName("User [name=null, id=0, email=null, password=]");
        java.lang.String str14 = user0.toString();
        java.lang.String str15 = user0.toString();
        java.lang.String str16 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str7, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str9, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User [name=User [name=null, id=0, email=null, password=], id=0, email=null, password=]" + "'", str14, "User [name=User [name=null, id=0, email=null, password=], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name=User [name=null, id=0, email=null, password=], id=0, email=null, password=]" + "'", str15, "User [name=User [name=null, id=0, email=null, password=], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User [name=null, id=0, email=null, password=]" + "'", str16, "User [name=null, id=0, email=null, password=]");
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        user0.setName("");
        java.lang.String str8 = user0.toString();
        java.lang.String str9 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str8, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str9, "User [name=, id=0, email=null, password=null]");
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getName();
        java.lang.String str9 = user0.getPassword();
        java.lang.String str10 = user0.getName();
        user0.setName("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        java.lang.String str13 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=]" + "'", str13, "User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=]");
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getPassword();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        java.lang.String str11 = user0.getName();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=]]");
        java.lang.String str14 = user0.getName();
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]" + "'", str11, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]" + "'", str14, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        java.lang.String str7 = user0.getPassword();
        user0.setName("hi!");
        user0.setPassword("hi!");
        java.lang.String str12 = user0.getName();
        user0.setName("hi!");
        java.lang.String str15 = user0.toString();
        user0.setName("User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=hi!]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name=hi!, id=0, email=null, password=hi!]" + "'", str15, "User [name=hi!, id=0, email=null, password=hi!]");
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("");
        java.lang.String str10 = user0.getName();
        user0.setName("User [name=null, id=0, email=null, password=]");
        java.lang.String str13 = user0.getName();
        java.lang.String str14 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str10, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=null, id=0, email=null, password=]" + "'", str13, "User [name=null, id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.toString();
        user0.setPassword("User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        user0.setPassword("User [name=User [name=, id=0, email=null, password=], id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=]" + "'", str5, "User [name=null, id=0, email=null, password=]");
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str9 = user0.toString();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        user0.setPassword("");
        user0.setPassword("User [name=, id=0, email=null, password=null]");
        java.lang.String str16 = user0.toString();
        user0.setName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]" + "'", str9, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=, id=0, email=null, password=null]]" + "'", str16, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=, id=0, email=null, password=null]]");
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("hi!");
        java.lang.String str8 = user0.getName();
        java.lang.String str9 = user0.toString();
        java.lang.String str10 = user0.getName();
        user0.setName("hi!");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setName("User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        user0.setPassword("");
        user0.setName("User [name=User [name=null, id=0, email=null, password=], id=0, email=null, password=hi!]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str8, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str9, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str10, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getName();
        java.lang.String str9 = user0.getPassword();
        java.lang.String str10 = user0.toString();
        java.lang.String str11 = user0.getPassword();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        java.lang.String str14 = user0.toString();
        user0.setName("User [name=hi!, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=]" + "'", str10, "User [name=null, id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]]" + "'", str14, "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]]");
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getPassword();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str11 = user0.getPassword();
        java.lang.String str12 = user0.getName();
        user0.setName("User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str12, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getPassword();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str11 = user0.toString();
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("");
        user0.setName("");
        user0.setName("User [name=, id=0, email=null, password=null]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setPassword("");
        java.lang.String str14 = user0.toString();
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]" + "'", str14, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        user0.setPassword("hi!");
        java.lang.String str9 = user0.toString();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        java.lang.String str12 = user0.toString();
        java.lang.String str13 = user0.getName();
        user0.setName("User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=hi!]" + "'", str9, "User [name=null, id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]], id=0, email=null, password=hi!]" + "'", str12, "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]" + "'", str13, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("hi!");
        java.lang.String str8 = user0.getName();
        java.lang.String str9 = user0.getName();
        java.lang.String str10 = user0.toString();
        java.lang.String str11 = user0.toString();
        user0.setName("User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]");
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]]");
        java.lang.String str18 = user0.toString();
        user0.setName("User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=null]");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]]]");
        user0.setName("User [name=User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str8, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str9, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str10, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]]]" + "'", str18, "User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]]]");
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        java.lang.String str6 = user0.getName();
        java.lang.String str7 = user0.toString();
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.toString();
        user0.setPassword("");
        java.lang.String str12 = user0.getName();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=hi!], id=0, email=null, password=]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str7, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str9, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("");
        java.lang.String str10 = user0.getName();
        java.lang.String str11 = user0.toString();
        java.lang.String str12 = user0.toString();
        java.lang.String str13 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str10, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]" + "'", str12, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        user0.setName("hi!");
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        java.lang.String str10 = user0.toString();
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=], id=0, email=null, password=]" + "'", str10, "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=], id=0, email=null, password=]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getName();
        java.lang.String str9 = user0.getPassword();
        java.lang.String str10 = user0.toString();
        java.lang.String str11 = user0.getPassword();
        user0.setName("hi!");
        user0.setName("");
        java.lang.Class<?> wildcardClass16 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=]" + "'", str10, "User [name=null, id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("hi!");
        java.lang.String str8 = user0.getName();
        java.lang.String str9 = user0.toString();
        java.lang.String str10 = user0.getName();
        user0.setName("hi!");
        java.lang.String str13 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str8, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str9, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str10, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=hi!, id=0, email=null, password=hi!]" + "'", str13, "User [name=hi!, id=0, email=null, password=hi!]");
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("");
        user0.setName("");
        user0.setName("User [name=, id=0, email=null, password=null]");
        user0.setPassword("User [name=hi!, id=0, email=null, password=]");
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        java.lang.String str6 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("hi!");
        java.lang.String str8 = user0.toString();
        java.lang.String str9 = user0.getPassword();
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str8, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        java.lang.String str7 = user0.getPassword();
        user0.setName("hi!");
        user0.setPassword("hi!");
        user0.setName("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        java.lang.String str14 = user0.getPassword();
        java.lang.String str15 = user0.toString();
        java.lang.String str16 = user0.getName();
        user0.setName("User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=hi!]" + "'", str15, "User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str16, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("hi!");
        java.lang.String str8 = user0.getName();
        java.lang.String str9 = user0.toString();
        java.lang.String str10 = user0.getName();
        user0.setName("hi!");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setName("User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        java.lang.String str19 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str8, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str9, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str10, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str19, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        java.lang.String str2 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=]");
        user0.setPassword("");
        user0.setName("");
        java.lang.String str9 = user0.toString();
        java.lang.String str10 = user0.getPassword();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=, id=0, email=null, password=]" + "'", str9, "User [name=, id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("");
        java.lang.String str4 = user0.getName();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getPassword();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.getPassword();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        java.lang.String str5 = user0.toString();
        java.lang.String str6 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]" + "'", str5, "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]" + "'", str6, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.getPassword();
        user0.setName("User [name=, id=0, email=null, password=null]");
        user0.setPassword("User [name=hi!, id=0, email=null, password=]");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        java.lang.String str9 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]" + "'", str9, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        java.lang.String str7 = user0.getPassword();
        user0.setName("hi!");
        user0.setPassword("hi!");
        user0.setName("hi!");
        java.lang.String str14 = user0.getName();
        user0.setName("");
        user0.setName("User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=null]");
        java.lang.String str19 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("");
        java.lang.String str6 = user0.toString();
        java.lang.String str7 = user0.getName();
        java.lang.String str8 = user0.getName();
        java.lang.String str9 = user0.getPassword();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str6, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        user0.setName("hi!");
        java.lang.String str8 = user0.getName();
        user0.setPassword("hi!");
        user0.setPassword("User [name=, id=0, email=null, password=null]");
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]]");
        java.lang.String str15 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name=hi!, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]]]" + "'", str15, "User [name=hi!, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]]]");
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.toString();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.toString();
        java.lang.String str7 = user0.getName();
        java.lang.String str8 = user0.getName();
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str6, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("");
        java.lang.String str4 = user0.getName();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getName();
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        user0.setPassword("hi!");
        java.lang.String str8 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str9 = user0.toString();
        user0.setName("User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]");
        java.lang.String str12 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]" + "'", str9, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]], id=0, email=null, password=]" + "'", str12, "User [name=User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]], id=0, email=null, password=]");
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        user0.setPassword("hi!");
        java.lang.String str8 = user0.getPassword();
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        java.lang.String str7 = user0.getPassword();
        user0.setName("hi!");
        user0.setPassword("hi!");
        java.lang.String str12 = user0.getName();
        user0.setName("hi!");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.toString();
        java.lang.String str9 = user0.getPassword();
        user0.setPassword("User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str7, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]" + "'", str8, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str9, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("hi!");
        java.lang.String str8 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str8, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        user0.setPassword("User [name=, id=0, email=null, password=User [name=User [name=, id=0, email=null, password=hi!], id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        user0.setPassword("User [name=, id=0, email=null, password=null]");
        java.lang.String str8 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=hi!], id=0, email=null, password=User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str8, "User [name=, id=0, email=null, password=null]");
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.getPassword();
        user0.setName("User [name=, id=0, email=null, password=null]");
        java.lang.String str5 = user0.getName();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str5, "User [name=, id=0, email=null, password=null]");
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        java.lang.String str2 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=]");
        java.lang.String str5 = user0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("hi!");
        java.lang.String str8 = user0.getName();
        java.lang.String str9 = user0.getName();
        java.lang.String str10 = user0.toString();
        java.lang.String str11 = user0.getName();
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]]");
        user0.setName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str8, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str9, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str10, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str11, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        java.lang.String str7 = user0.getPassword();
        user0.setName("hi!");
        user0.setPassword("hi!");
        user0.setName("hi!");
        user0.setPassword("hi!");
        java.lang.String str16 = user0.getName();
        user0.setPassword("User [name=hi!, id=0, email=null, password=hi!]");
        java.lang.Class<?> wildcardClass19 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        login.User user0 = new login.User();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]]");
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]], id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]");
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        java.lang.String str5 = user0.getName();
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]");
        user0.setName("User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=null]");
        java.lang.String str10 = user0.getPassword();
        java.lang.String str11 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]" + "'", str5, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]" + "'", str10, "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]" + "'", str11, "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]");
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]" + "'", str6, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        login.User user0 = new login.User();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        java.lang.String str3 = user0.getName();
        user0.setName("");
        user0.setPassword("User [name=User [name=, id=0, email=null, password=hi!], id=0, email=null, password=null]");
        java.lang.String str8 = user0.getPassword();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=User [name=, id=0, email=null, password=hi!], id=0, email=null, password=null]" + "'", str8, "User [name=User [name=, id=0, email=null, password=hi!], id=0, email=null, password=null]");
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        login.User user0 = new login.User();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setName("hi!");
        user0.setPassword("User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        user0.setPassword("User [name=hi!, id=0, email=null, password=hi!]");
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("");
        user0.setName("");
        user0.setName("User [name=, id=0, email=null, password=null]");
        java.lang.String str10 = user0.getName();
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str10, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        java.lang.String str6 = user0.toString();
        user0.setPassword("User [name=User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        java.lang.String str9 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=]" + "'", str6, "User [name=null, id=0, email=null, password=]");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        user0.setName("hi!");
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        java.lang.String str10 = user0.toString();
        java.lang.String str11 = user0.getName();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=], id=0, email=null, password=]" + "'", str10, "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]" + "'", str11, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("hi!");
        java.lang.String str8 = user0.toString();
        java.lang.String str9 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]]");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        java.lang.String str14 = user0.getPassword();
        java.lang.String str15 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str8, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]" + "'", str14, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]]" + "'", str15, "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]]");
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("");
        java.lang.String str10 = user0.getPassword();
        user0.setPassword("User [name=, id=0, email=null, password=]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.toString();
        user0.setName("User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        user0.setPassword("User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]");
        java.lang.String str12 = user0.toString();
        java.lang.String str13 = user0.getName();
        user0.setName("User [name=User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=]" + "'", str7, "User [name=null, id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]]" + "'", str12, "User [name=User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str13, "User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("hi!");
        java.lang.String str8 = user0.getName();
        java.lang.String str9 = user0.getName();
        java.lang.String str10 = user0.toString();
        java.lang.String str11 = user0.toString();
        user0.setName("User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]");
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]]");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str8, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str9, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str10, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        java.lang.String str6 = user0.toString();
        user0.setPassword("User [name=, id=0, email=null, password=User [name=User [name=, id=0, email=null, password=hi!], id=0, email=null, password=null]]");
        java.lang.String str9 = user0.getPassword();
        java.lang.String str10 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]" + "'", str6, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=, id=0, email=null, password=User [name=User [name=, id=0, email=null, password=hi!], id=0, email=null, password=null]]" + "'", str9, "User [name=, id=0, email=null, password=User [name=User [name=, id=0, email=null, password=hi!], id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=User [name=, id=0, email=null, password=User [name=User [name=, id=0, email=null, password=hi!], id=0, email=null, password=null]]]" + "'", str10, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=User [name=, id=0, email=null, password=User [name=User [name=, id=0, email=null, password=hi!], id=0, email=null, password=null]]]");
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("hi!");
        java.lang.String str8 = user0.getName();
        java.lang.String str9 = user0.toString();
        java.lang.String str10 = user0.getName();
        user0.setName("hi!");
        user0.setName("User [name=, id=0, email=null, password=null]");
        java.lang.String str15 = user0.toString();
        java.lang.String str16 = user0.getPassword();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str8, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str9, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str10, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str15, "User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        java.lang.String str2 = user0.getName();
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.getName();
        java.lang.Class<?> wildcardClass5 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        login.User user0 = new login.User();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        java.lang.String str3 = user0.toString();
        user0.setPassword("User [name=User [name=, id=0, email=null, password=], id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str3, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getPassword();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str11 = user0.getPassword();
        java.lang.String str12 = user0.getName();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str15 = user0.toString();
        java.lang.String str16 = user0.toString();
        java.lang.Class<?> wildcardClass17 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str12, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]" + "'", str15, "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]" + "'", str16, "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("hi!");
        java.lang.String str8 = user0.getName();
        java.lang.String str9 = user0.getName();
        java.lang.String str10 = user0.toString();
        java.lang.String str11 = user0.getPassword();
        java.lang.String str12 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str8, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str9, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str10, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        java.lang.String str2 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=]");
        user0.setPassword("");
        user0.setName("User [name=hi!, id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("hi!");
        java.lang.String str8 = user0.getName();
        java.lang.String str9 = user0.getName();
        java.lang.String str10 = user0.toString();
        java.lang.String str11 = user0.toString();
        user0.setName("User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]");
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]]");
        java.lang.String str18 = user0.toString();
        java.lang.String str19 = user0.getName();
        user0.setName("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str8, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str9, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str10, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]]]" + "'", str18, "User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]]]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]" + "'", str19, "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        java.lang.String str2 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=]");
        user0.setPassword("");
        user0.setName("");
        java.lang.String str9 = user0.getPassword();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.toString();
        java.lang.String str5 = user0.toString();
        java.lang.String str6 = user0.toString();
        user0.setName("User [name=, id=0, email=null, password=hi!]");
        java.lang.String str9 = user0.toString();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]]");
        user0.setName("User [name=, id=0, email=null, password=]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str6, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=, id=0, email=null, password=hi!], id=0, email=null, password=null]" + "'", str9, "User [name=User [name=, id=0, email=null, password=hi!], id=0, email=null, password=null]");
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.toString();
        java.lang.String str5 = user0.toString();
        java.lang.String str6 = user0.toString();
        user0.setName("User [name=, id=0, email=null, password=hi!]");
        java.lang.String str9 = user0.toString();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]]");
        java.lang.String str14 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str6, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=, id=0, email=null, password=hi!], id=0, email=null, password=null]" + "'", str9, "User [name=User [name=, id=0, email=null, password=hi!], id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]" + "'", str14, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("hi!");
        java.lang.String str8 = user0.getName();
        java.lang.String str9 = user0.toString();
        java.lang.String str10 = user0.getName();
        user0.setName("hi!");
        java.lang.String str13 = user0.getPassword();
        user0.setPassword("User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=], id=0, email=null, password=]");
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        java.lang.String str18 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str8, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str9, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str10, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]" + "'", str18, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        java.lang.String str7 = user0.getPassword();
        user0.setName("hi!");
        user0.setPassword("hi!");
        user0.setName("hi!");
        user0.setPassword("hi!");
        java.lang.String str16 = user0.getName();
        java.lang.String str17 = user0.getName();
        java.lang.String str18 = user0.toString();
        user0.setPassword("User [name=hi!, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User [name=hi!, id=0, email=null, password=hi!]" + "'", str18, "User [name=hi!, id=0, email=null, password=hi!]");
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        user0.setName("");
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        java.lang.String str10 = user0.getPassword();
        java.lang.String str11 = user0.getPassword();
        java.lang.String str12 = user0.getPassword();
        java.lang.String str13 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=]");
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=User [name=, id=0, email=null, password=User [name=User [name=, id=0, email=null, password=hi!], id=0, email=null, password=null]]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]" + "'", str10, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]" + "'", str11, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]" + "'", str12, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]" + "'", str13, "User [name=, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]");
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("hi!");
        java.lang.String str6 = user0.toString();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        java.lang.String str9 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=hi!]" + "'", str6, "User [name=null, id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]" + "'", str9, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
    }
}

