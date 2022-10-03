package fetchers;

import analysis.Analysis;

public class Test {
	public static void main(String[] args) {
		DataSet ds1 = Analysis.annualPercentChange(Data.fetchData("CAN", 2010, 2019, "EN.ATM.CO2E.PC"));	}

}
