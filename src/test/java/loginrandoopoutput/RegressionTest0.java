package loginrandoopoutput;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.Class<?> wildcardClass3 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        java.lang.String str7 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("hi!");
        java.lang.String str8 = user0.getName();
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str8, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        login.User user0 = new login.User();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        java.lang.Class<?> wildcardClass3 = user0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        java.lang.String str7 = user0.getPassword();
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        user0.setName("hi!");
        java.lang.String str8 = user0.getName();
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.toString();
        java.lang.String str5 = user0.getPassword();
        java.lang.Class<?> wildcardClass6 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getPassword();
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        java.lang.Class<?> wildcardClass7 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        java.lang.String str6 = user0.getPassword();
        java.lang.Class<?> wildcardClass7 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        java.lang.String str7 = user0.getPassword();
        user0.setName("hi!");
        user0.setPassword("hi!");
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        user0.setName("");
        java.lang.String str4 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str4, "User [name=, id=0, email=null, password=null]");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        java.lang.String str7 = user0.getPassword();
        user0.setName("hi!");
        user0.setPassword("hi!");
        user0.setName("hi!");
        java.lang.Class<?> wildcardClass14 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
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
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
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
        java.lang.Class<?> wildcardClass16 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        user0.setName("hi!");
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        java.lang.String str7 = user0.getPassword();
        user0.setName("hi!");
        user0.setPassword("hi!");
        java.lang.String str12 = user0.getName();
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("hi!");
        java.lang.Class<?> wildcardClass6 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.toString();
        java.lang.Class<?> wildcardClass5 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str9 = user0.toString();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]" + "'", str9, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        user0.setName("hi!");
        user0.setName("");
        java.lang.String str10 = user0.getPassword();
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("");
        user0.setName("");
        user0.setName("User [name=, id=0, email=null, password=null]");
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.toString();
        java.lang.Class<?> wildcardClass5 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        java.lang.Class<?> wildcardClass5 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        java.lang.String str6 = user0.getName();
        java.lang.String str7 = user0.toString();
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str7, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        login.User user0 = new login.User();
        java.lang.Class<?> wildcardClass1 = user0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("");
        java.lang.String str10 = user0.getName();
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str10, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
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
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str7, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getName();
        user0.setName("User [name=, id=0, email=null, password=null]");
        java.lang.Class<?> wildcardClass6 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        java.lang.Class<?> wildcardClass7 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.toString();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getName();
        java.lang.String str7 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("");
        java.lang.String str4 = user0.toString();
        java.lang.String str5 = user0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str4, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str5, "User [name=, id=0, email=null, password=null]");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("");
        java.lang.String str6 = user0.getName();
        java.lang.String str7 = user0.getPassword();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str6, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getName();
        java.lang.Class<?> wildcardClass4 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("hi!");
        java.lang.String str8 = user0.getName();
        java.lang.String str9 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str8, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str9, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
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
        java.lang.Class<?> wildcardClass17 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.Class<?> wildcardClass2 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getName();
        user0.setPassword("User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        java.lang.String str6 = user0.getPassword();
        user0.setName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str10 = user0.getPassword();
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        login.User user0 = new login.User();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setName("hi!");
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
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
        java.lang.String str15 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
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
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str12, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.Class<?> wildcardClass2 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        user0.setPassword("User [name=, id=0, email=null, password=null]");
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str9 = user0.toString();
        java.lang.String str10 = user0.toString();
        java.lang.String str11 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]" + "'", str9, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]" + "'", str10, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        java.lang.Class<?> wildcardClass6 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]");
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
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
        java.lang.Class<?> wildcardClass16 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
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
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str8 = user0.toString();
        java.lang.String str9 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]" + "'", str8, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str9, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.toString();
        java.lang.String str10 = user0.getName();
        java.lang.String str11 = user0.toString();
        java.lang.String str12 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]" + "'", str9, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str10, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]" + "'", str12, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("");
        user0.setName("");
        user0.setName("User [name=, id=0, email=null, password=null]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        user0.setName("hi!");
        user0.setName("");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        java.lang.String str12 = user0.toString();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=]" + "'", str12, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=]");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
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
        java.lang.String str19 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        java.lang.Class<?> wildcardClass5 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
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
        user0.setName("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str10, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]" + "'", str12, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        java.lang.String str2 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.getPassword();
        java.lang.Class<?> wildcardClass3 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("");
        java.lang.String str6 = user0.toString();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str6, "User [name=, id=0, email=null, password=null]");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        java.lang.String str6 = user0.getName();
        java.lang.String str7 = user0.toString();
        java.lang.String str8 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str7, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.getPassword();
        user0.setName("User [name=, id=0, email=null, password=null]");
        java.lang.Class<?> wildcardClass5 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.toString();
        java.lang.String str5 = user0.toString();
        java.lang.String str6 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("hi!");
        user0.setName("User [name=null, id=0, email=null, password=hi!]");
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        java.lang.Class<?> wildcardClass6 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        java.lang.Class<?> wildcardClass7 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
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
        java.lang.Class<?> wildcardClass16 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=hi!]" + "'", str15, "User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        user0.setName("hi!");
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        user0.setPassword("User [name=hi!, id=0, email=null, password=]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        user0.setName("hi!");
        java.lang.String str8 = user0.getName();
        user0.setPassword("hi!");
        user0.setPassword("User [name=, id=0, email=null, password=null]");
        user0.setName("User [name=hi!, id=0, email=null, password=]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        user0.setName("hi!");
        user0.setName("");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        java.lang.String str12 = user0.toString();
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=]" + "'", str12, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
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
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("");
        user0.setPassword("hi!");
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        java.lang.String str10 = user0.getPassword();
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str10, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("hi!");
        java.lang.String str6 = user0.toString();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        java.lang.String str9 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=hi!]" + "'", str6, "User [name=null, id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]" + "'", str9, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getPassword();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        user0.setPassword("User [name=null, id=0, email=null, password=hi!]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        java.lang.String str2 = user0.toString();
        java.lang.Class<?> wildcardClass3 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getName();
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("hi!");
        user0.setName("User [name=null, id=0, email=null, password=hi!]");
        java.lang.String str10 = user0.getPassword();
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.toString();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str7 = user0.getName();
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        java.lang.Class<?> wildcardClass2 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        java.lang.String str9 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]" + "'", str9, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.toString();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        java.lang.String str7 = user0.toString();
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]" + "'", str7, "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getPassword();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.toString();
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=]" + "'", str7, "User [name=null, id=0, email=null, password=]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        user0.setPassword("User [name=, id=0, email=null, password=null]");
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        user0.setPassword("User [name=, id=0, email=null, password=null]");
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getName();
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str8, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
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
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        java.lang.String str20 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
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
        user0.setName("User [name=null, id=0, email=null, password=hi!]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str10 = user0.getPassword();
        java.lang.String str11 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]" + "'", str11, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("hi!");
        java.lang.String str6 = user0.toString();
        java.lang.String str7 = user0.getName();
        java.lang.String str8 = user0.getPassword();
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=hi!]" + "'", str6, "User [name=null, id=0, email=null, password=hi!]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        user0.setName("hi!");
        java.lang.String str8 = user0.getName();
        user0.setPassword("hi!");
        java.lang.String str11 = user0.getName();
        user0.setName("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        java.lang.String str14 = user0.toString();
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=hi!]" + "'", str14, "User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]");
        java.lang.String str6 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.getPassword();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]" + "'", str5, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]" + "'", str6, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("");
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
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
        user0.setName("User [name=null, id=0, email=null, password=hi!]");
        user0.setName("User [name=hi!, id=0, email=null, password=hi!]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str8, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str9, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str10, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]");
        java.lang.Class<?> wildcardClass6 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.Class<?> wildcardClass7 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
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
        java.lang.String str15 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str8, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str9, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str10, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        java.lang.String str6 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        java.lang.String str9 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]], id=0, email=null, password=]" + "'", str9, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]], id=0, email=null, password=]");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("");
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setPassword("User [name=hi!, id=0, email=null, password=]");
        user0.setName("User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        login.User user0 = new login.User();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        java.lang.Class<?> wildcardClass5 = user0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
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
        java.lang.String str16 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str12, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]" + "'", str15, "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str16, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!]");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]");
        java.lang.String str6 = user0.toString();
        java.lang.Class<?> wildcardClass7 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]]" + "'", str6, "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        user0.setName("hi!");
        java.lang.String str8 = user0.getName();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str12 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str12, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!]");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.toString();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.toString();
        java.lang.Class<?> wildcardClass7 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str6, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        login.User user0 = new login.User();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setName("hi!");
        java.lang.String str5 = user0.toString();
        java.lang.String str6 = user0.toString();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=]");
        java.lang.String str9 = user0.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str5, "User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str6, "User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=]" + "'", str9, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=]");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str9 = user0.getName();
        user0.setName("User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=], id=0, email=null, password=]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str9, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
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
        user0.setName("User [name=null, id=0, email=null, password=]");
        user0.setName("User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=], id=0, email=null, password=]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User [name=hi!, id=0, email=null, password=hi!]" + "'", str18, "User [name=hi!, id=0, email=null, password=hi!]");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("");
        java.lang.String str6 = user0.toString();
        java.lang.String str7 = user0.toString();
        java.lang.String str8 = user0.getName();
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str6, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str7, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
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
        java.lang.Class<?> wildcardClass19 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User [name=hi!, id=0, email=null, password=hi!]" + "'", str18, "User [name=hi!, id=0, email=null, password=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.getPassword();
        user0.setName("User [name=, id=0, email=null, password=null]");
        user0.setPassword("User [name=hi!, id=0, email=null, password=]");
        java.lang.Class<?> wildcardClass7 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
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
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str8, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str9, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str10, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        java.lang.String str7 = user0.getPassword();
        user0.setName("hi!");
        user0.setPassword("hi!");
        java.lang.String str12 = user0.getName();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        java.lang.String str7 = user0.getName();
        java.lang.String str8 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str7, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        java.lang.String str6 = user0.getName();
        java.lang.String str7 = user0.toString();
        java.lang.String str8 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=hi!]");
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
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
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
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str8, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str9, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str10, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        java.lang.String str8 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]" + "'", str8, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        java.lang.String str4 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]" + "'", str4, "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("");
        java.lang.String str6 = user0.getName();
        java.lang.String str7 = user0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str6, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str7, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.toString();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        java.lang.String str6 = user0.toString();
        java.lang.String str7 = user0.toString();
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]" + "'", str6, "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]" + "'", str7, "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.toString();
        java.lang.String str10 = user0.getName();
        java.lang.String str11 = user0.toString();
        java.lang.String str12 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]" + "'", str9, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str10, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getPassword();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.toString();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        java.lang.String str6 = user0.getName();
        java.lang.Class<?> wildcardClass7 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("");
        java.lang.Class<?> wildcardClass6 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str9 = user0.toString();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        java.lang.String str12 = user0.toString();
        user0.setPassword("hi!");
        java.lang.String str15 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]" + "'", str9, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]" + "'", str12, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setPassword("User [name=, id=0, email=null, password=null]");
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]");
        java.lang.String str9 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]]" + "'", str9, "User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]]");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        java.lang.String str5 = user0.getName();
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]");
        java.lang.String str8 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]" + "'", str5, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]" + "'", str8, "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("");
        user0.setPassword("hi!");
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        java.lang.String str10 = user0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str10, "User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
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
        java.lang.String str18 = user0.getPassword();
        java.lang.Class<?> wildcardClass19 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("hi!");
        user0.setName("User [name=null, id=0, email=null, password=null]");
        java.lang.String str8 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
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
        java.lang.String str12 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str12, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        user0.setName("");
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        user0.setPassword("hi!");
        user0.setName("hi!");
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]], id=0, email=null, password=]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        user0.setName("User [name=hi!, id=0, email=null, password=]");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getName();
        java.lang.String str5 = user0.toString();
        user0.setPassword("");
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setName("User [name=, id=0, email=null, password=null]");
        java.lang.Class<?> wildcardClass7 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
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
        java.lang.String str11 = user0.toString();
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str7, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=null, id=0, email=null, password=]" + "'", str11, "User [name=null, id=0, email=null, password=]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        user0.setName("hi!");
        java.lang.String str8 = user0.getName();
        user0.setPassword("hi!");
        java.lang.String str11 = user0.getName();
        java.lang.String str12 = user0.getPassword();
        java.lang.String str13 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=hi!, id=0, email=null, password=hi!]" + "'", str13, "User [name=hi!, id=0, email=null, password=hi!]");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("User [name=null, id=0, email=null, password=hi!]");
        java.lang.String str10 = user0.getPassword();
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("");
        java.lang.String str10 = user0.getName();
        java.lang.String str11 = user0.getName();
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str10, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str11, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.toString();
        java.lang.String str5 = user0.toString();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
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
        java.lang.String str14 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str8, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str9, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str10, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("");
        user0.setPassword("User [name=null, id=0, email=null, password=hi!]");
        java.lang.String str12 = user0.getPassword();
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=null, id=0, email=null, password=hi!]" + "'", str12, "User [name=null, id=0, email=null, password=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("");
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str10 = user0.getName();
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]");
        java.lang.String str13 = user0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=]" + "'", str13, "User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=]");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        user0.setPassword("hi!");
        java.lang.String str9 = user0.toString();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        user0.setName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=hi!]" + "'", str9, "User [name=null, id=0, email=null, password=hi!]");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
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
        user0.setName("User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]");
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
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
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
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=hi!], id=0, email=null, password=]");
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
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
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
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        java.lang.String str17 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=], id=0, email=null, password=hi!]" + "'", str17, "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=], id=0, email=null, password=hi!]");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.toString();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getName();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("hi!");
        user0.setPassword("User [name=hi!, id=0, email=null, password=]");
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
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
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str7, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str9, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        user0.setPassword("User [name=, id=0, email=null, password=null]");
        java.lang.String str8 = user0.getPassword();
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str8, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]");
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
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
        user0.setName("User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=null]");
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
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
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
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=]");
        java.lang.String str12 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str7, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str9, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=]]" + "'", str12, "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=]]");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("");
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setPassword("User [name=hi!, id=0, email=null, password=]");
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
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
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        java.lang.String str20 = user0.toString();
        java.lang.String str21 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str20, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]" + "'", str21, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
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
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str12, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getName();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("");
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        java.lang.String str12 = user0.getPassword();
        java.lang.String str13 = user0.getPassword();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]" + "'", str12, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]" + "'", str13, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
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
        java.lang.String str11 = user0.toString();
        java.lang.String str12 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str7, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=null, id=0, email=null, password=]" + "'", str11, "User [name=null, id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("hi!");
        java.lang.String str8 = user0.toString();
        java.lang.String str9 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]]");
        java.lang.String str12 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str8, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]]" + "'", str12, "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]]");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.toString();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getName();
        java.lang.String str7 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        user0.setPassword("User [name=null, id=0, email=null, password=]");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setPassword("User [name=, id=0, email=null, password=null]");
        java.lang.Class<?> wildcardClass7 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.toString();
        user0.setPassword("User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        java.lang.String str8 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=]" + "'", str5, "User [name=null, id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]" + "'", str8, "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        java.lang.String str5 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str5, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        user0.setName("hi!");
        java.lang.String str8 = user0.getName();
        user0.setPassword("hi!");
        java.lang.String str11 = user0.getName();
        user0.setName("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        java.lang.Class<?> wildcardClass14 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        login.User user0 = new login.User();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setName("hi!");
        java.lang.String str5 = user0.toString();
        java.lang.String str6 = user0.toString();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=]");
        user0.setPassword("User [name=, id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str5, "User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str6, "User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        user0.setName("hi!");
        java.lang.String str8 = user0.getName();
        user0.setPassword("hi!");
        java.lang.String str11 = user0.getName();
        user0.setName("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        java.lang.String str14 = user0.toString();
        java.lang.String str15 = user0.getPassword();
        user0.setPassword("User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=hi!]" + "'", str14, "User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
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
        java.lang.Class<?> wildcardClass14 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str8, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getName();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.toString();
        java.lang.String str7 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str6, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str7, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("");
        java.lang.String str4 = user0.getPassword();
        user0.setName("User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getPassword();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
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
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        user0.setPassword("User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        java.lang.String str22 = user0.getPassword();
        java.lang.String str23 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str22, "User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]" + "'", str23, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        user0.setPassword("hi!");
        java.lang.String str9 = user0.toString();
        java.lang.String str10 = user0.toString();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=hi!]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=hi!]" + "'", str9, "User [name=null, id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=hi!]" + "'", str10, "User [name=null, id=0, email=null, password=hi!]");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("hi!");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setName("");
        java.lang.String str14 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User [name=, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]" + "'", str14, "User [name=, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        login.User user0 = new login.User();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setName("hi!");
        java.lang.String str5 = user0.toString();
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.toString();
        java.lang.String str8 = user0.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str5, "User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str6, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str7, "User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str8, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setName("User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]], id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("hi!");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setName("");
        java.lang.String str14 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
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
        java.lang.Class<?> wildcardClass16 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]], id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str15, "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]], id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("");
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("");
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        java.lang.Class<?> wildcardClass6 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        login.User user0 = new login.User();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.toString();
        user0.setPassword("User [name=hi!, id=0, email=null, password=hi!]");
        java.lang.String str7 = user0.toString();
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str3, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str4, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=User [name=hi!, id=0, email=null, password=hi!]]" + "'", str7, "User [name=null, id=0, email=null, password=User [name=hi!, id=0, email=null, password=hi!]]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.toString();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getName();
        user0.setName("User [name=, id=0, email=null, password=]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
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
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        user0.setName("User [name=User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
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
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]");
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str10, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str12, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        user0.setName("User [name=, id=0, email=null, password=null]");
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setPassword("User [name=, id=0, email=null, password=null]");
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]");
        java.lang.String str9 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str9, "User [name=, id=0, email=null, password=null]");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
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
        java.lang.String str13 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str7, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]" + "'", str13, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]], id=0, email=null, password=]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("hi!");
        java.lang.String str8 = user0.getName();
        java.lang.String str9 = user0.toString();
        java.lang.String str10 = user0.getName();
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str8, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str9, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str10, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        login.User user0 = new login.User();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        java.lang.String str3 = user0.getName();
        user0.setName("");
        java.lang.String str6 = user0.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str6, "User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
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
        java.lang.String str14 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str8, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]]" + "'", str14, "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]]");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setName("User [name=, id=0, email=null, password=null]");
        java.lang.String str8 = user0.getName();
        java.lang.String str9 = user0.getName();
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str8, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str9, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        java.lang.String str7 = user0.getPassword();
        user0.setName("hi!");
        user0.setPassword("hi!");
        user0.setName("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.Class<?> wildcardClass18 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str9 = user0.toString();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        java.lang.String str12 = user0.toString();
        java.lang.String str13 = user0.toString();
        java.lang.String str14 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]" + "'", str9, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]" + "'", str12, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]" + "'", str13, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str14, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
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
        java.lang.String str15 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str15, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("");
        java.lang.String str6 = user0.toString();
        java.lang.String str7 = user0.toString();
        java.lang.String str8 = user0.getPassword();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str6, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str7, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str9 = user0.toString();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        java.lang.String str12 = user0.toString();
        user0.setPassword("hi!");
        java.lang.String str15 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]" + "'", str9, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]" + "'", str12, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str15, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getName();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]], id=0, email=null, password=]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
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
        java.lang.String str13 = user0.getName();
        java.lang.String str14 = user0.getPassword();
        java.lang.String str15 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str10, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]" + "'", str12, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str13, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str15, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        user0.setName("hi!");
        user0.setName("");
        user0.setPassword("");
        java.lang.String str12 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=, id=0, email=null, password=]" + "'", str12, "User [name=, id=0, email=null, password=]");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.toString();
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str7, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]" + "'", str8, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
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
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
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
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=null, id=0, email=null, password=hi!]" + "'", str11, "User [name=null, id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=null, id=0, email=null, password=hi!]" + "'", str12, "User [name=null, id=0, email=null, password=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
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
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=]" + "'", str10, "User [name=null, id=0, email=null, password=]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
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
        user0.setPassword("User [name=, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=hi!]" + "'", str15, "User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str16, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        user0.setPassword("hi!");
        java.lang.String str9 = user0.getName();
        user0.setName("hi!");
        java.lang.String str12 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getName();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.toString();
        user0.setName("");
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str6, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.toString();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.toString();
        java.lang.String str7 = user0.getName();
        user0.setPassword("User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=], id=0, email=null, password=]");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str6, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("");
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        login.User user0 = new login.User();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        java.lang.String str5 = user0.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str5, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.toString();
        java.lang.String str8 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=]" + "'", str7, "User [name=null, id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=]" + "'", str8, "User [name=null, id=0, email=null, password=]");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.toString();
        user0.setName("User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        user0.setPassword("User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]");
        user0.setName("User [name=null, id=0, email=null, password=hi!]");
        java.lang.Class<?> wildcardClass14 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=]" + "'", str7, "User [name=null, id=0, email=null, password=]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getName();
        java.lang.String str5 = user0.toString();
        java.lang.Class<?> wildcardClass6 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("hi!");
        java.lang.String str6 = user0.toString();
        java.lang.String str7 = user0.getName();
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=hi!]" + "'", str6, "User [name=null, id=0, email=null, password=hi!]");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        java.lang.String str6 = user0.toString();
        java.lang.Class<?> wildcardClass7 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]" + "'", str6, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.toString();
        user0.setName("User [name=, id=0, email=null, password=]");
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("hi!");
        java.lang.String str8 = user0.getName();
        java.lang.String str9 = user0.toString();
        java.lang.String str10 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str8, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str9, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        java.lang.String str5 = user0.getName();
        java.lang.Class<?> wildcardClass6 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]" + "'", str5, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.toString();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getName();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("hi!");
        java.lang.String str8 = user0.getName();
        java.lang.String str9 = user0.getPassword();
        java.lang.String str10 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str8, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
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
        java.lang.String str13 = user0.getName();
        java.lang.Class<?> wildcardClass14 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str7, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str13, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
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
        java.lang.String str13 = user0.getName();
        java.lang.String str14 = user0.getPassword();
        user0.setName("User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str10, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]" + "'", str12, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str13, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
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
        java.lang.Class<?> wildcardClass18 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str8, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str9, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str10, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str10 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("hi!");
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
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
        java.lang.String str14 = user0.getPassword();
        java.lang.String str15 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str8, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str9, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str10, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        user0.setPassword("User [name=, id=0, email=null, password=null]");
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getPassword();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]], id=0, email=null, password=]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str8, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str9, "User [name=, id=0, email=null, password=null]");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        login.User user0 = new login.User();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setName("hi!");
        java.lang.String str5 = user0.toString();
        java.lang.String str6 = user0.getPassword();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str5, "User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str6, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
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
        user0.setName("User [name=null, id=0, email=null, password=]");
        java.lang.String str21 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User [name=hi!, id=0, email=null, password=hi!]" + "'", str18, "User [name=hi!, id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "User [name=User [name=null, id=0, email=null, password=], id=0, email=null, password=hi!]" + "'", str21, "User [name=User [name=null, id=0, email=null, password=], id=0, email=null, password=hi!]");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.toString();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.toString();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str7 = user0.getName();
        java.lang.String str8 = user0.toString();
        java.lang.String str9 = user0.toString();
        java.lang.String str10 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]" + "'", str8, "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]" + "'", str9, "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
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
        java.lang.String str16 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
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
        java.lang.String str16 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=hi!]" + "'", str16, "User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=hi!]");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
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
        java.lang.String str18 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str8, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str9, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str10, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]" + "'", str18, "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        user0.setName("hi!");
        user0.setName("");
        user0.setPassword("");
        java.lang.String str12 = user0.toString();
        java.lang.String str13 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=, id=0, email=null, password=]" + "'", str12, "User [name=, id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        login.User user0 = new login.User();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setName("hi!");
        java.lang.String str5 = user0.toString();
        java.lang.String str6 = user0.getPassword();
        user0.setName("User [name=hi!, id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str5, "User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str6, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("");
        java.lang.String str10 = user0.getName();
        java.lang.String str11 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str10, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        java.lang.String str5 = user0.getName();
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]");
        user0.setName("User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=null]");
        java.lang.String str10 = user0.getPassword();
        java.lang.String str11 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]" + "'", str5, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]" + "'", str10, "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]]" + "'", str11, "User [name=User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]]");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getName();
        java.lang.String str4 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        login.User user0 = new login.User();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]]");
        java.lang.Class<?> wildcardClass7 = user0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getPassword();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str7, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("");
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        user0.setPassword("User [name=null, id=0, email=null, password=hi!]");
        java.lang.String str14 = user0.toString();
        java.lang.String str15 = user0.getPassword();
        java.lang.Class<?> wildcardClass16 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=hi!]]" + "'", str14, "User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=hi!]]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name=null, id=0, email=null, password=hi!]" + "'", str15, "User [name=null, id=0, email=null, password=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
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
        java.lang.String str13 = user0.toString();
        java.lang.String str14 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]], id=0, email=null, password=]" + "'", str13, "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
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
        java.lang.String str14 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]" + "'", str10, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]" + "'", str11, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]" + "'", str12, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]" + "'", str13, "User [name=, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]" + "'", str14, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
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
        java.lang.String str14 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str7, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str9, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User [name=null, id=0, email=null, password=]" + "'", str14, "User [name=null, id=0, email=null, password=]");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getName();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.toString();
        java.lang.String str7 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str6, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.toString();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        java.lang.String str6 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]" + "'", str6, "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        login.User user0 = new login.User();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        java.lang.String str3 = user0.getName();
        user0.setName("User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
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
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        java.lang.String str20 = user0.toString();
        java.lang.String str21 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str20, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        java.lang.String str6 = user0.getName();
        user0.setName("");
        user0.setName("User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
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
        java.lang.String str18 = user0.getPassword();
        java.lang.String str19 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str8, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str9, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str10, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]]" + "'", str18, "User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]]" + "'", str19, "User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]]");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
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
        user0.setName("User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]]");
        java.lang.String str15 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=]" + "'", str7, "User [name=null, id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]]" + "'", str12, "User [name=User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]]" + "'", str15, "User [name=User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]]");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setPassword("User [name=, id=0, email=null, password=null]");
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]");
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]");
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.getPassword();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        java.lang.String str5 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]" + "'", str5, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setName("User [name=, id=0, email=null, password=null]");
        java.lang.String str8 = user0.getName();
        java.lang.String str9 = user0.getName();
        java.lang.String str10 = user0.toString();
        java.lang.String str11 = user0.toString();
        java.lang.String str12 = user0.getName();
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str8, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str9, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=null]" + "'", str10, "User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=null]" + "'", str11, "User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str12, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        user0.setPassword("User [name=, id=0, email=null, password=null]");
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getName();
        java.lang.String str10 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str8, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str10, "User [name=, id=0, email=null, password=null]");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("");
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        user0.setPassword("User [name=null, id=0, email=null, password=hi!]");
        java.lang.String str14 = user0.getName();
        java.lang.String str15 = user0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=hi!]]" + "'", str15, "User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=hi!]]");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
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
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str10, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]" + "'", str12, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
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
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=]" + "'", str7, "User [name=null, id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]]" + "'", str12, "User [name=User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        user0.setPassword("User [name=, id=0, email=null, password=null]");
        java.lang.String str8 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str8, "User [name=, id=0, email=null, password=null]");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str9 = user0.toString();
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]" + "'", str9, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("hi!");
        user0.setName("User [name=null, id=0, email=null, password=hi!]");
        java.lang.String str10 = user0.getPassword();
        java.lang.String str11 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=hi!], id=0, email=null, password=hi!]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=hi!], id=0, email=null, password=hi!]");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
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
        java.lang.String str12 = user0.toString();
        user0.setPassword("User [name=User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]" + "'", str12, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        java.lang.String str6 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]" + "'", str6, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        java.lang.String str7 = user0.getName();
        user0.setName("");
        java.lang.String str10 = user0.toString();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str7, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str10, "User [name=, id=0, email=null, password=null]");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("");
        user0.setPassword("hi!");
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setName("User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str12 = user0.getName();
        java.lang.String str13 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str12, "User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]" + "'", str13, "User [name=User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
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
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]" + "'", str10, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]" + "'", str11, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]" + "'", str12, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getPassword();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]");
        java.lang.String str11 = user0.getName();
        java.lang.String str12 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]" + "'", str11, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null], id=0, email=null, password=null]" + "'", str12, "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null], id=0, email=null, password=null]");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setName("User [name=, id=0, email=null, password=null]");
        java.lang.String str7 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str7, "User [name=, id=0, email=null, password=null]");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        java.lang.String str6 = user0.getName();
        java.lang.String str7 = user0.toString();
        java.lang.String str8 = user0.getPassword();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]], id=0, email=null, password=]");
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
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.getPassword();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.toString();
        java.lang.String str7 = user0.getName();
        java.lang.String str8 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]" + "'", str5, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]" + "'", str6, "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]" + "'", str8, "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getName();
        java.lang.String str5 = user0.toString();
        java.lang.String str6 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str6, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        java.lang.String str5 = user0.getName();
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]");
        user0.setName("User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=null]");
        java.lang.String str10 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]" + "'", str5, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]" + "'", str10, "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
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
        user0.setPassword("User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str5 = user0.getName();
        java.lang.Class<?> wildcardClass6 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str5, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
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
        java.lang.String str12 = user0.getName();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]], id=0, email=null, password=]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str8, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str9, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str12, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        user0.setPassword("User [name=, id=0, email=null, password=null]");
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getName();
        java.lang.String str10 = user0.getName();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        java.lang.String str13 = user0.toString();
        java.lang.Class<?> wildcardClass14 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str8, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]" + "'", str13, "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
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
        java.lang.Class<?> wildcardClass14 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str8, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str9, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str10, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str11, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("");
        java.lang.String str10 = user0.getName();
        user0.setPassword("User [name=null, id=0, email=null, password=hi!]");
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str10, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        login.User user0 = new login.User();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]]");
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        java.lang.String str9 = user0.getPassword();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]" + "'", str9, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.toString();
        java.lang.String str5 = user0.toString();
        java.lang.String str6 = user0.toString();
        user0.setName("User [name=, id=0, email=null, password=hi!]");
        java.lang.String str9 = user0.toString();
        java.lang.String str10 = user0.getPassword();
        user0.setName("User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str6, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=, id=0, email=null, password=hi!], id=0, email=null, password=null]" + "'", str9, "User [name=User [name=, id=0, email=null, password=hi!], id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("");
        java.lang.String str6 = user0.toString();
        java.lang.String str7 = user0.toString();
        java.lang.String str8 = user0.toString();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str6, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str7, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str8, "User [name=, id=0, email=null, password=null]");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]], id=0, email=null, password=]");
        user0.setPassword("User [name=, id=0, email=null, password=hi!]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
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
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=hi!]" + "'", str15, "User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=hi!]");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        login.User user0 = new login.User();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        java.lang.String str3 = user0.getName();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str9 = user0.toString();
        user0.setName("User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]");
        java.lang.String str12 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]" + "'", str9, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]" + "'", str12, "User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
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
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        user0.setName("hi!");
        java.lang.String str8 = user0.getName();
        user0.setPassword("hi!");
        java.lang.String str11 = user0.getName();
        user0.setName("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        java.lang.String str14 = user0.toString();
        java.lang.String str15 = user0.getPassword();
        user0.setPassword("User [name=, id=0, email=null, password=]");
        java.lang.String str18 = user0.getName();
        user0.setName("User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=]]");
        java.lang.Class<?> wildcardClass21 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=hi!]" + "'", str14, "User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str18, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getName();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.toString();
        user0.setName("");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str6, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        user0.setName("");
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        java.lang.String str10 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]]");
        java.lang.String str13 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]" + "'", str10, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]" + "'", str13, "User [name=User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        login.User user0 = new login.User();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setName("hi!");
        java.lang.String str5 = user0.toString();
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getName();
        user0.setName("User [name=User [name=null, id=0, email=null, password=hi!], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str5, "User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str6, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
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
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]");
        java.lang.String str15 = user0.getPassword();
        java.lang.Class<?> wildcardClass16 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str10, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str12, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]" + "'", str15, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
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
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
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
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        user0.setName("hi!");
        java.lang.String str8 = user0.getName();
        java.lang.String str9 = user0.getPassword();
        java.lang.String str10 = user0.getName();
        java.lang.String str11 = user0.toString();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=0, email=null, password=]" + "'", str11, "User [name=hi!, id=0, email=null, password=]");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
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
        java.lang.String str11 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=]" + "'", str10, "User [name=null, id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=null, id=0, email=null, password=]" + "'", str11, "User [name=null, id=0, email=null, password=]");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str9 = user0.toString();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        java.lang.String str12 = user0.toString();
        user0.setPassword("hi!");
        user0.setName("User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]], id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]" + "'", str9, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]" + "'", str12, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=hi!, id=0, email=null, password=]");
        user0.setPassword("User [name=hi!, id=0, email=null, password=hi!]");
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.toString();
        java.lang.String str5 = user0.toString();
        java.lang.String str6 = user0.toString();
        user0.setName("User [name=, id=0, email=null, password=hi!]");
        user0.setName("User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str6, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        user0.setPassword("hi!");
        java.lang.String str9 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        login.User user0 = new login.User();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        java.lang.String str3 = user0.getName();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=hi!]");
        user0.setPassword("User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]], id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.toString();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.toString();
        user0.setName("User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]], id=0, email=null, password=]");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str6, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("");
        java.lang.String str6 = user0.toString();
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getPassword();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str6, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
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
        java.lang.Class<?> wildcardClass16 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str12, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str15, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
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
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str8, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str9, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str10, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        java.lang.String str7 = user0.getPassword();
        user0.setName("hi!");
        user0.setPassword("hi!");
        user0.setName("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setPassword("User [name=User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]]");
        java.lang.Class<?> wildcardClass20 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
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
        java.lang.String str11 = user0.getName();
        java.lang.String str12 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str7, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=hi!]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=hi!]");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        java.lang.String str7 = user0.toString();
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]]" + "'", str7, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.toString();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]");
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str9 = user0.getName();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str9, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        login.User user0 = new login.User();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.toString();
        java.lang.String str5 = user0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str3, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str4, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str5, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.toString();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        java.lang.String str6 = user0.toString();
        java.lang.String str7 = user0.toString();
        user0.setName("User [name=User [name=, id=0, email=null, password=hi!], id=0, email=null, password=null]");
        java.lang.String str10 = user0.getPassword();
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]" + "'", str6, "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]" + "'", str7, "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]" + "'", str10, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        user0.setName("hi!");
        java.lang.String str8 = user0.getName();
        user0.setPassword("hi!");
        java.lang.String str11 = user0.getName();
        user0.setName("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        java.lang.String str14 = user0.toString();
        java.lang.String str15 = user0.getPassword();
        user0.setPassword("User [name=, id=0, email=null, password=]");
        java.lang.Class<?> wildcardClass18 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=hi!]" + "'", str14, "User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.toString();
        java.lang.String str5 = user0.toString();
        java.lang.String str6 = user0.toString();
        user0.setName("User [name=, id=0, email=null, password=hi!]");
        java.lang.String str9 = user0.toString();
        java.lang.String str10 = user0.getPassword();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str6, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=, id=0, email=null, password=hi!], id=0, email=null, password=null]" + "'", str9, "User [name=User [name=, id=0, email=null, password=hi!], id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
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
        java.lang.String str16 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str12, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]" + "'", str13, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str16, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        user0.setPassword("");
        java.lang.String str9 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=, id=0, email=null, password=]" + "'", str9, "User [name=, id=0, email=null, password=]");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        login.User user0 = new login.User();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        java.lang.String str3 = user0.getName();
        user0.setName("");
        user0.setPassword("User [name=User [name=, id=0, email=null, password=hi!], id=0, email=null, password=null]");
        java.lang.String str8 = user0.toString();
        user0.setName("User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=, id=0, email=null, password=User [name=User [name=, id=0, email=null, password=hi!], id=0, email=null, password=null]]" + "'", str8, "User [name=, id=0, email=null, password=User [name=User [name=, id=0, email=null, password=hi!], id=0, email=null, password=null]]");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        user0.setPassword("User [name=, id=0, email=null, password=null]");
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getPassword();
        java.lang.String str10 = user0.getPassword();
        java.lang.String str11 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str8, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str9, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str10, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=null, id=0, email=null, password=User [name=, id=0, email=null, password=null]]" + "'", str11, "User [name=null, id=0, email=null, password=User [name=, id=0, email=null, password=null]]");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        user0.setPassword("");
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        login.User user0 = new login.User();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setName("hi!");
        java.lang.String str5 = user0.toString();
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getName();
        java.lang.String str8 = user0.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str5, "User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str6, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str8, "User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        user0.setName("User [name=null, id=0, email=null, password=hi!]");
        java.lang.String str11 = user0.getName();
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=null, id=0, email=null, password=hi!]" + "'", str11, "User [name=null, id=0, email=null, password=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getName();
        java.lang.String str5 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]]");
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getPassword();
        java.lang.String str10 = user0.getName();
        java.lang.String str11 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]]" + "'", str10, "User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]], id=0, email=null, password=null]" + "'", str11, "User [name=User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]], id=0, email=null, password=null]");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str9 = user0.getName();
        java.lang.String str10 = user0.getName();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str9, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str10, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getName();
        java.lang.String str5 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]]");
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getPassword();
        java.lang.String str10 = user0.getName();
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]]" + "'", str10, "User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        user0.setName("hi!");
        java.lang.String str8 = user0.getName();
        user0.setName("User [name=null, id=0, email=null, password=hi!]");
        java.lang.String str11 = user0.toString();
        java.lang.String str12 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=hi!], id=0, email=null, password=]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=hi!], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=null, id=0, email=null, password=hi!]" + "'", str12, "User [name=null, id=0, email=null, password=hi!]");
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
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
        java.lang.String str13 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str7, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=null]" + "'", str13, "User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=null]");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getName();
        java.lang.String str5 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]]");
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]], id=0, email=null, password=null]" + "'", str9, "User [name=User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]], id=0, email=null, password=null]");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        user0.setPassword("User [name=, id=0, email=null, password=null]");
        java.lang.String str8 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str8, "User [name=, id=0, email=null, password=null]");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        java.lang.String str2 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=]");
        user0.setPassword("");
        java.lang.String str7 = user0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("");
        java.lang.String str6 = user0.toString();
        java.lang.String str7 = user0.toString();
        user0.setPassword("User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]], id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str6, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str7, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        java.lang.String str7 = user0.getPassword();
        user0.setName("hi!");
        user0.setPassword("hi!");
        user0.setName("hi!");
        java.lang.String str14 = user0.getPassword();
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        java.lang.String str6 = user0.getName();
        user0.setName("");
        java.lang.String str9 = user0.toString();
        user0.setName("User [name=, id=0, email=null, password=hi!]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str9, "User [name=, id=0, email=null, password=null]");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.getPassword();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        java.lang.String str5 = user0.toString();
        java.lang.Class<?> wildcardClass6 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]" + "'", str5, "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        java.lang.String str4 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        user0.setName("");
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]" + "'", str4, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        user0.setName("hi!");
        java.lang.String str8 = user0.getName();
        user0.setName("User [name=null, id=0, email=null, password=hi!]");
        java.lang.String str11 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        user0.setPassword("hi!");
        java.lang.String str9 = user0.toString();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        java.lang.String str12 = user0.getPassword();
        java.lang.String str13 = user0.getName();
        user0.setName("User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=], id=0, email=null, password=hi!]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=hi!]" + "'", str9, "User [name=null, id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]" + "'", str13, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("hi!");
        java.lang.String str8 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str8, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
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
        java.lang.String str12 = user0.toString();
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]" + "'", str12, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("hi!");
        user0.setPassword("User [name=hi!, id=0, email=null, password=]");
        java.lang.String str12 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=hi!, id=0, email=null, password=User [name=hi!, id=0, email=null, password=]]" + "'", str12, "User [name=hi!, id=0, email=null, password=User [name=hi!, id=0, email=null, password=]]");
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
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
        java.lang.String str10 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str7, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str9, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        java.lang.String str6 = user0.getName();
        java.lang.String str7 = user0.toString();
        java.lang.String str8 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
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
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        java.lang.String str6 = user0.toString();
        user0.setPassword("User [name=User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=]" + "'", str6, "User [name=null, id=0, email=null, password=]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str6 = user0.getPassword();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
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
        user0.setName("User [name=, id=0, email=null, password=null]");
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str7, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
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
        java.lang.String str17 = user0.toString();
        java.lang.Class<?> wildcardClass18 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User [name=hi!, id=0, email=null, password=hi!]" + "'", str17, "User [name=hi!, id=0, email=null, password=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
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
        java.lang.String str16 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]], id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str15, "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]], id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str16, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.getPassword();
        user0.setName("User [name=, id=0, email=null, password=null]");
        user0.setPassword("User [name=hi!, id=0, email=null, password=]");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=], id=0, email=null, password=]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
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
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        user0.setPassword("User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        java.lang.String str22 = user0.getPassword();
        java.lang.Class<?> wildcardClass23 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str22, "User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        user0.setName("");
        java.lang.String str8 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getName();
        user0.setName("User [name=, id=0, email=null, password=null]");
        java.lang.String str6 = user0.getName();
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str6, "User [name=, id=0, email=null, password=null]");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
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
        user0.setName("User [name=null, id=0, email=null, password=User [name=hi!, id=0, email=null, password=hi!]]");
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
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
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
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        user0.setName("hi!");
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        java.lang.String str10 = user0.toString();
        java.lang.String str11 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=], id=0, email=null, password=]" + "'", str10, "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=], id=0, email=null, password=]" + "'", str11, "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=], id=0, email=null, password=]");
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("hi!");
        java.lang.String str8 = user0.toString();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=hi!]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str8, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.toString();
        java.lang.Class<?> wildcardClass5 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setName("User [name=, id=0, email=null, password=null]");
        java.lang.String str5 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=null]" + "'", str5, "User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=null]");
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("");
        user0.setPassword("hi!");
        java.lang.String str8 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=, id=0, email=null, password=hi!]" + "'", str8, "User [name=, id=0, email=null, password=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str9 = user0.toString();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        java.lang.String str12 = user0.getName();
        java.lang.String str13 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]" + "'", str9, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str12, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]" + "'", str13, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.toString();
        user0.setName("User [name=, id=0, email=null, password=]");
        java.lang.String str7 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=, id=0, email=null, password=]" + "'", str7, "User [name=, id=0, email=null, password=]");
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]");
        user0.setPassword("User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]], id=0, email=null, password=]");
        java.lang.String str13 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.toString();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        java.lang.String str6 = user0.getName();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        java.lang.String str9 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]" + "'", str9, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.toString();
        java.lang.String str9 = user0.getPassword();
        user0.setName("User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]], id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str7, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]" + "'", str8, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str9, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        java.lang.String str6 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        java.lang.String str9 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("hi!");
        java.lang.String str8 = user0.toString();
        java.lang.String str9 = user0.getPassword();
        java.lang.String str10 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str8, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str10, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.toString();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.toString();
        java.lang.String str7 = user0.getName();
        user0.setPassword("User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=], id=0, email=null, password=]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=hi!, id=0, email=null, password=hi!]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str6, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.toString();
        java.lang.String str5 = user0.toString();
        java.lang.String str6 = user0.toString();
        user0.setName("User [name=, id=0, email=null, password=hi!]");
        user0.setName("User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setName("User [name=, id=0, email=null, password=User [name=User [name=, id=0, email=null, password=hi!], id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str6, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        login.User user0 = new login.User();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.toString();
        user0.setPassword("User [name=hi!, id=0, email=null, password=hi!]");
        java.lang.String str7 = user0.toString();
        java.lang.String str8 = user0.getPassword();
        user0.setName("User [name=, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str3, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str4, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=User [name=hi!, id=0, email=null, password=hi!]]" + "'", str7, "User [name=null, id=0, email=null, password=User [name=hi!, id=0, email=null, password=hi!]]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=hi!, id=0, email=null, password=hi!]" + "'", str8, "User [name=hi!, id=0, email=null, password=hi!]");
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        java.lang.String str7 = user0.getPassword();
        user0.setName("hi!");
        user0.setPassword("hi!");
        user0.setName("hi!");
        java.lang.String str14 = user0.getPassword();
        java.lang.String str15 = user0.getName();
        java.lang.String str16 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User [name=hi!, id=0, email=null, password=hi!]" + "'", str16, "User [name=hi!, id=0, email=null, password=hi!]");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("hi!");
        java.lang.String str8 = user0.toString();
        java.lang.String str9 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        user0.setName("User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str8, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str9, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.toString();
        java.lang.String str8 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=]" + "'", str7, "User [name=null, id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.toString();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        java.lang.String str6 = user0.toString();
        java.lang.String str7 = user0.toString();
        user0.setName("User [name=User [name=, id=0, email=null, password=hi!], id=0, email=null, password=null]");
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]" + "'", str6, "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]" + "'", str7, "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.toString();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str7 = user0.getName();
        java.lang.String str8 = user0.toString();
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]" + "'", str8, "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
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
        java.lang.String str17 = user0.toString();
        user0.setName("User [name=, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User [name=hi!, id=0, email=null, password=hi!]" + "'", str17, "User [name=hi!, id=0, email=null, password=hi!]");
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
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
        user0.setName("User [name=null, id=0, email=null, password=User [name=, id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str12, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]" + "'", str15, "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
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
        user0.setPassword("User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=], id=0, email=null, password=]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=hi!, id=0, email=null, password=hi!]" + "'", str12, "User [name=hi!, id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("hi!");
        user0.setName("User [name=null, id=0, email=null, password=hi!]");
        java.lang.String str10 = user0.getPassword();
        user0.setPassword("User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]");
        java.lang.String str13 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=User [name=null, id=0, email=null, password=hi!], id=0, email=null, password=User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]]" + "'", str13, "User [name=User [name=null, id=0, email=null, password=hi!], id=0, email=null, password=User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]]");
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setName("User [name=, id=0, email=null, password=null]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        java.lang.String str7 = user0.getName();
        java.lang.String str8 = user0.toString();
        user0.setName("User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=hi!]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str7, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]" + "'", str8, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        java.lang.String str4 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        user0.setName("");
        user0.setPassword("User [name=User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]" + "'", str4, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.toString();
        user0.setName("User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        user0.setPassword("User [name=, id=0, email=null, password=hi!]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=]" + "'", str7, "User [name=null, id=0, email=null, password=]");
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("");
        user0.setPassword("hi!");
        java.lang.String str8 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        java.lang.String str11 = user0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=, id=0, email=null, password=hi!]" + "'", str8, "User [name=, id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]]" + "'", str11, "User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]]");
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("hi!");
        java.lang.String str8 = user0.getName();
        java.lang.String str9 = user0.getPassword();
        user0.setPassword("User [name=, id=0, email=null, password=null]");
        user0.setName("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str8, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
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
        user0.setName("User [name=null, id=0, email=null, password=hi!]");
        java.lang.String str15 = user0.toString();
        java.lang.Class<?> wildcardClass16 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str8, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str9, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str10, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name=User [name=null, id=0, email=null, password=hi!], id=0, email=null, password=hi!]" + "'", str15, "User [name=User [name=null, id=0, email=null, password=hi!], id=0, email=null, password=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        java.lang.String str7 = user0.getName();
        user0.setName("");
        java.lang.String str10 = user0.toString();
        user0.setName("User [name=, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str7, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str10, "User [name=, id=0, email=null, password=null]");
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("hi!");
        java.lang.String str10 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=hi!, id=0, email=null, password=]" + "'", str10, "User [name=hi!, id=0, email=null, password=]");
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        login.User user0 = new login.User();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]]");
        java.lang.String str7 = user0.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]], id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]" + "'", str7, "User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]], id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getName();
        user0.setName("User [name=User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]");
        java.lang.String str7 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getName();
        java.lang.String str5 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]]");
        java.lang.String str8 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        java.lang.String str7 = user0.getPassword();
        user0.setName("hi!");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        java.lang.String str12 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str12, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        java.lang.String str7 = user0.getPassword();
        user0.setName("hi!");
        user0.setPassword("hi!");
        user0.setName("hi!");
        java.lang.String str14 = user0.getPassword();
        java.lang.String str15 = user0.getName();
        user0.setName("User [name=, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str9 = user0.toString();
        java.lang.String str10 = user0.toString();
        java.lang.String str11 = user0.getName();
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]" + "'", str9, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]" + "'", str10, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
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
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("");
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str10 = user0.getName();
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        java.lang.Class<?> wildcardClass6 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
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
        user0.setName("User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]]");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=]" + "'", str7, "User [name=null, id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]]" + "'", str12, "User [name=User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]]");
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str10 = user0.getName();
        java.lang.String str11 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str10, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
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
        java.lang.String str16 = user0.getName();
        java.lang.String str17 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]], id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str15, "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]], id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]" + "'", str16, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str17, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        user0.setName("");
        java.lang.String str8 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        user0.setPassword("hi!");
        java.lang.String str9 = user0.getName();
        user0.setName("hi!");
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        java.lang.Class<?> wildcardClass4 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]");
        java.lang.String str6 = user0.getPassword();
        user0.setPassword("User [name=null, id=0, email=null, password=]");
        user0.setName("User [name=User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]" + "'", str6, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]");
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        login.User user0 = new login.User();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]");
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.toString();
        user0.setPassword("User [name=hi!, id=0, email=null, password=]");
        java.lang.String str12 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]" + "'", str9, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str12, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        login.User user0 = new login.User();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setName("hi!");
        java.lang.String str5 = user0.toString();
        java.lang.String str6 = user0.toString();
        user0.setName("User [name=, id=0, email=null, password=]");
        java.lang.String str9 = user0.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str5, "User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str6, "User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=, id=0, email=null, password=], id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str9, "User [name=User [name=, id=0, email=null, password=], id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("");
        user0.setName("");
        user0.setName("User [name=, id=0, email=null, password=null]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setPassword("");
        user0.setName("User [name=hi!, id=0, email=null, password=]");
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
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
        java.lang.String str17 = user0.toString();
        java.lang.String str18 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User [name=hi!, id=0, email=null, password=hi!]" + "'", str17, "User [name=hi!, id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        user0.setPassword("hi!");
        java.lang.String str9 = user0.toString();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        java.lang.String str12 = user0.toString();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=hi!]" + "'", str9, "User [name=null, id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]], id=0, email=null, password=hi!]" + "'", str12, "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]], id=0, email=null, password=hi!]");
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setPassword("User [name=, id=0, email=null, password=null]");
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]");
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]");
        java.lang.String str13 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]], id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]]" + "'", str13, "User [name=User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]], id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]]");
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getName();
        user0.setName("User [name=User [name=null, id=0, email=null, password=hi!], id=0, email=null, password=]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("");
        user0.setPassword("hi!");
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        user0.setName("User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null], id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        java.lang.Class<?> wildcardClass7 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
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
        java.lang.Class<?> wildcardClass17 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str8, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str9, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str10, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str15, "User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.toString();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.toString();
        java.lang.String str7 = user0.getName();
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str6, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("hi!");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str12 = user0.getPassword();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str12, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("");
        user0.setPassword("User [name=null, id=0, email=null, password=hi!]");
        java.lang.String str12 = user0.getPassword();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=null, id=0, email=null, password=hi!]" + "'", str12, "User [name=null, id=0, email=null, password=hi!]");
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]");
        java.lang.String str6 = user0.toString();
        user0.setPassword("User [name=User [name=, id=0, email=null, password=], id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]]" + "'", str6, "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]]");
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str9 = user0.toString();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        java.lang.String str12 = user0.getName();
        java.lang.String str13 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]" + "'", str9, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str12, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str13, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        java.lang.String str6 = user0.getName();
        java.lang.String str7 = user0.toString();
        java.lang.String str8 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        java.lang.String str11 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str7, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        java.lang.String str6 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=]" + "'", str6, "User [name=null, id=0, email=null, password=]");
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        login.User user0 = new login.User();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.toString();
        user0.setPassword("User [name=hi!, id=0, email=null, password=hi!]");
        java.lang.String str7 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]]]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str3, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str4, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=User [name=hi!, id=0, email=null, password=hi!]]" + "'", str7, "User [name=null, id=0, email=null, password=User [name=hi!, id=0, email=null, password=hi!]]");
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=, id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        user0.setName("hi!");
        java.lang.String str8 = user0.getName();
        user0.setPassword("hi!");
        java.lang.String str11 = user0.getName();
        user0.setName("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        java.lang.String str14 = user0.toString();
        java.lang.String str15 = user0.getPassword();
        user0.setPassword("User [name=, id=0, email=null, password=]");
        java.lang.String str18 = user0.toString();
        java.lang.Class<?> wildcardClass19 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=hi!]" + "'", str14, "User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=]]" + "'", str18, "User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=]]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("");
        java.lang.Class<?> wildcardClass6 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.toString();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        java.lang.Class<?> wildcardClass6 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
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
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]], id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str10, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=null, id=0, email=null, password=]" + "'", str13, "User [name=null, id=0, email=null, password=]");
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        java.lang.String str4 = user0.toString();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.toString();
        java.lang.String str7 = user0.getName();
        user0.setPassword("User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=], id=0, email=null, password=]");
        user0.setPassword("User [name=null, id=0, email=null, password=]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str6, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        user0.setName("User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        user0.setPassword("hi!");
        java.lang.String str9 = user0.toString();
        java.lang.String str10 = user0.toString();
        user0.setName("User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]], id=0, email=null, password=hi!]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=hi!]" + "'", str9, "User [name=null, id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=hi!]" + "'", str10, "User [name=null, id=0, email=null, password=hi!]");
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
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
        user0.setName("User [name=User [name=, id=0, email=null, password=], id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str8, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str9, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str10, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
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
        user0.setName("User [name=, id=0, email=null, password=]");
        java.lang.String str17 = user0.toString();
        user0.setName("User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=], id=0, email=null, password=]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User [name=User [name=, id=0, email=null, password=], id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str17, "User [name=User [name=, id=0, email=null, password=], id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        java.lang.String str4 = user0.toString();
        java.lang.Class<?> wildcardClass5 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]" + "'", str4, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        login.User user0 = new login.User();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        java.lang.String str3 = user0.getName();
        user0.setName("");
        user0.setPassword("User [name=User [name=, id=0, email=null, password=hi!], id=0, email=null, password=null]");
        java.lang.String str8 = user0.toString();
        user0.setName("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=, id=0, email=null, password=User [name=User [name=, id=0, email=null, password=hi!], id=0, email=null, password=null]]" + "'", str8, "User [name=, id=0, email=null, password=User [name=User [name=, id=0, email=null, password=hi!], id=0, email=null, password=null]]");
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        java.lang.String str12 = user0.getPassword();
        java.lang.String str13 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str12, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str13, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        user0.setPassword("User [name=, id=0, email=null, password=null]");
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getName();
        java.lang.String str10 = user0.toString();
        user0.setName("User [name=User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]");
        java.lang.String str13 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str8, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=User [name=, id=0, email=null, password=null]]" + "'", str10, "User [name=null, id=0, email=null, password=User [name=, id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str13, "User [name=, id=0, email=null, password=null]");
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        java.lang.String str7 = user0.getPassword();
        user0.setName("hi!");
        user0.setPassword("hi!");
        user0.setName("hi!");
        java.lang.String str14 = user0.getPassword();
        java.lang.String str15 = user0.getName();
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        user0.setPassword("User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=], id=0, email=null, password=hi!]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
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
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str10, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str12, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
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
        java.lang.String str14 = user0.getPassword();
        java.lang.String str15 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str8, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str9, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str10, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name=hi!, id=0, email=null, password=hi!]" + "'", str15, "User [name=hi!, id=0, email=null, password=hi!]");
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getName();
        java.lang.String str5 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=]");
        java.lang.String str8 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=User [name=null, id=0, email=null, password=], id=0, email=null, password=null]" + "'", str8, "User [name=User [name=null, id=0, email=null, password=], id=0, email=null, password=null]");
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        java.lang.String str7 = user0.getPassword();
        user0.setName("hi!");
        user0.setPassword("hi!");
        user0.setName("User [name=null, id=0, email=null, password=hi!]");
        java.lang.String str14 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User [name=null, id=0, email=null, password=hi!]" + "'", str14, "User [name=null, id=0, email=null, password=hi!]");
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("");
        user0.setPassword("User [name=null, id=0, email=null, password=hi!]");
        java.lang.String str12 = user0.getPassword();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str15 = user0.getName();
        java.lang.String str16 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=null, id=0, email=null, password=hi!]" + "'", str12, "User [name=null, id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str15, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str16, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        login.User user0 = new login.User();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setName("hi!");
        java.lang.String str5 = user0.toString();
        java.lang.String str6 = user0.toString();
        user0.setName("User [name=, id=0, email=null, password=]");
        java.lang.String str9 = user0.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str5, "User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str6, "User [name=hi!, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=, id=0, email=null, password=]" + "'", str9, "User [name=, id=0, email=null, password=]");
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
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
        java.lang.String str15 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=], id=0, email=null, password=hi!]" + "'", str15, "User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=], id=0, email=null, password=hi!]");
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("");
        user0.setPassword("hi!");
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        java.lang.String str10 = user0.getPassword();
        java.lang.String str11 = user0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str10, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        user0.setName("hi!");
        java.lang.String str8 = user0.getName();
        user0.setPassword("hi!");
        user0.setPassword("User [name=, id=0, email=null, password=null]");
        java.lang.String str13 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.toString();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        java.lang.String str6 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]" + "'", str6, "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]");
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getName();
        java.lang.String str5 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]], id=0, email=null, password=User [name=, id=0, email=null, password=null]]");
        java.lang.String str8 = user0.getPassword();
        user0.setPassword("User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]], id=0, email=null, password=hi!]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("");
        user0.setName("");
        user0.setName("User [name=, id=0, email=null, password=null]");
        java.lang.String str10 = user0.getName();
        java.lang.String str11 = user0.getPassword();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str10, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]], id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setName("User [name=, id=0, email=null, password=null]");
        java.lang.String str8 = user0.getName();
        java.lang.String str9 = user0.getName();
        java.lang.String str10 = user0.toString();
        java.lang.String str11 = user0.toString();
        java.lang.String str12 = user0.getName();
        java.lang.String str13 = user0.getPassword();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str8, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str9, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=null]" + "'", str10, "User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=null]" + "'", str11, "User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str12, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("");
        user0.setPassword("hi!");
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        java.lang.String str12 = user0.toString();
        java.lang.String str13 = user0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]" + "'", str12, "User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]" + "'", str13, "User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]]");
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setPassword("User [name=, id=0, email=null, password=null]");
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]");
        user0.setName("User [name=null, id=0, email=null, password=null]");
        java.lang.String str11 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str11, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        java.lang.String str5 = user0.getName();
        user0.setName("hi!");
        java.lang.String str8 = user0.getName();
        user0.setPassword("hi!");
        java.lang.String str11 = user0.getName();
        user0.setName("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        java.lang.String str14 = user0.toString();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=hi!]" + "'", str14, "User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=hi!]");
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
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
        java.lang.String str18 = user0.getPassword();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
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
        java.lang.String str13 = user0.getName();
        java.lang.String str14 = user0.toString();
        java.lang.String str15 = user0.getName();
        java.lang.String str16 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str7, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str13, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=null]" + "'", str14, "User [name=User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]], id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str15, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str16, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
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
        java.lang.String str12 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str7, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str9, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=null, id=0, email=null, password=]" + "'", str12, "User [name=null, id=0, email=null, password=]");
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]], id=0, email=null, password=]");
        java.lang.String str5 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]], id=0, email=null, password=]]" + "'", str5, "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]], id=0, email=null, password=]]");
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
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
        java.lang.String str12 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str8, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str9, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str10, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]" + "'", str11, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.toString();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
        java.lang.String str7 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]" + "'", str7, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]");
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.toString();
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]");
        java.lang.String str6 = user0.toString();
        java.lang.String str7 = user0.toString();
        user0.setName("User [name=User [name=, id=0, email=null, password=hi!], id=0, email=null, password=null]");
        user0.setName("User [name=User [name=, id=0, email=null, password=hi!], id=0, email=null, password=null]");
        user0.setPassword("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]]");
        java.lang.String str14 = user0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]" + "'", str6, "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]" + "'", str7, "User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User [name=User [name=User [name=, id=0, email=null, password=hi!], id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]]]" + "'", str14, "User [name=User [name=User [name=, id=0, email=null, password=hi!], id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]]]");
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        java.lang.String str7 = user0.toString();
        java.lang.String str8 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]]" + "'", str7, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]" + "'", str8, "User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getPassword();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]");
        java.lang.String str11 = user0.getName();
        java.lang.String str12 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]" + "'", str11, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("");
        java.lang.String str6 = user0.toString();
        java.lang.String str7 = user0.toString();
        java.lang.String str8 = user0.toString();
        java.lang.String str9 = user0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str6, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str7, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str8, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("hi!");
        user0.setName("User [name=null, id=0, email=null, password=hi!]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        user0.setPassword("User [name=null, id=0, email=null, password=hi!]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        java.lang.String str4 = user0.getName();
        java.lang.String str5 = user0.getPassword();
        java.lang.Class<?> wildcardClass6 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]" + "'", str4, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("hi!");
        user0.setName("User [name=, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.toString();
        java.lang.String str6 = user0.getName();
        java.lang.String str7 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str5, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("");
        user0.setPassword("hi!");
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        user0.setPassword("User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        java.lang.String str12 = user0.getName();
        user0.setName("User [name=hi!, id=0, email=null, password=hi!]");
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        login.User user0 = new login.User();
        user0.setPassword("User [name=null, id=0, email=null, password=null]");
        java.lang.String str3 = user0.getName();
        java.lang.String str4 = user0.toString();
        java.lang.String str5 = user0.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str4, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]" + "'", str5, "User [name=null, id=0, email=null, password=User [name=null, id=0, email=null, password=null]]");
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str9 = user0.toString();
        java.lang.String str10 = user0.getPassword();
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=], id=0, email=null, password=]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]" + "'", str9, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        user0.setPassword("");
        user0.setName("");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        java.lang.String str9 = user0.toString();
        java.lang.String str10 = user0.toString();
        user0.setName("User [name=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=], id=0, email=null, password=]");
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]" + "'", str9, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]" + "'", str10, "User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("");
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setPassword("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        java.lang.String str12 = user0.getPassword();
        java.lang.String str13 = user0.toString();
        java.lang.Class<?> wildcardClass14 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]" + "'", str12, "User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]]" + "'", str13, "User [name=, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=]]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.getName();
        java.lang.String str2 = user0.toString();
        java.lang.String str3 = user0.toString();
        user0.setPassword("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getName();
        java.lang.String str9 = user0.toString();
        java.lang.String str10 = user0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=]" + "'", str9, "User [name=null, id=0, email=null, password=]");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
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
        user0.setName("User [name=User [name=null, id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!], id=0, email=null, password=]]], id=0, email=null, password=User [name=null, id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null]]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str2, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        login.User user0 = new login.User();
        java.lang.String str1 = user0.toString();
        user0.setName("User [name=null, id=0, email=null, password=null]");
        user0.setName("User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]");
        user0.setName("User [name=, id=0, email=null, password=null]");
        java.lang.String str8 = user0.getName();
        java.lang.String str9 = user0.getName();
        java.lang.String str10 = user0.toString();
        java.lang.String str11 = user0.toString();
        user0.setName("User [name=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=null], id=0, email=null, password=User [name=User [name=null, id=0, email=null, password=null], id=0, email=null, password=hi!]]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str8, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=, id=0, email=null, password=null]" + "'", str9, "User [name=, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=null]" + "'", str10, "User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=null]" + "'", str11, "User [name=User [name=, id=0, email=null, password=null], id=0, email=null, password=null]");
    }
}

