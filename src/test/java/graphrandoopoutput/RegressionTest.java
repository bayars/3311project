package graphrandoopoutput;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import fetchersrandoopoutput.RegressionTest0;
import fetchersrandoopoutput.RegressionTest1;
import fetchersrandoopoutput.RegressionTest2;
import fetchersrandoopoutput.RegressionTest3;
import fetchersrandoopoutput.RegressionTest4;
import fetchersrandoopoutput.RegressionTest5;
import fetchersrandoopoutput.RegressionTest6;
import fetchersrandoopoutput.RegressionTest7;
import fetchersrandoopoutput.RegressionTest8;

@RunWith(Suite.class)
@Suite.SuiteClasses({ RegressionTest0.class, RegressionTest1.class, RegressionTest2.class, RegressionTest3.class, RegressionTest4.class,
	RegressionTest5.class,  RegressionTest6.class, RegressionTest7.class , RegressionTest8.class })
public class RegressionTest {
}

