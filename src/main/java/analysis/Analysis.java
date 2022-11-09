package analysis;

import java.util.ArrayList;
import java.util.List;

import fetchers.Data;
import fetchers.DataSet;
import fetchers.PieDataSet;

public class Analysis {

	public static List<DataSet> getData(String country, int yearStart, int yearEnd, String analysis) {
		List<DataSet> data = new ArrayList<DataSet>();

		if (analysis == "a1") {

			AnalysisMethod method1 = new AnnualPercentChange();
			AnalysisMethod method2 = new AnnualPercentChange();
			AnalysisMethod method3 = new AnnualPercentChange();

			List<DataSet> dataSets1 = new ArrayList<DataSet>();
			List<DataSet> dataSets2 = new ArrayList<DataSet>();
			List<DataSet> dataSets3 = new ArrayList<DataSet>();

			dataSets1.add(Data.fetchData(country, yearStart - 1, yearEnd, "EN.ATM.CO2E.PC"));
			dataSets2.add(Data.fetchData(country, yearStart - 1, yearEnd, "EG.USE.PCAP.KG.OE"));
			dataSets3.add(Data.fetchData(country, yearStart - 1, yearEnd, "EN.ATM.PM25.MC.M3"));

			DataSet ds1 = method1.getAnalyzedData(dataSets1);
			DataSet ds2 = method2.getAnalyzedData(dataSets2);
			DataSet ds3 = method3.getAnalyzedData(dataSets3);

			data.add(ds1);
			data.add(ds2);
			data.add(ds3);

		} else if (analysis == "a2") {

			AnalysisMethod method1 = new AnnualPercentChange();
			AnalysisMethod method2 = new AnnualPercentChange();

			List<DataSet> dataSets1 = new ArrayList<DataSet>();
			List<DataSet> dataSets2 = new ArrayList<DataSet>();

			dataSets1.add(Data.fetchData(country, yearStart - 1, yearEnd, "EN.ATM.PM25.MC.M3"));
			dataSets2.add(Data.fetchData(country, yearStart - 1, yearEnd, "AG.LND.FRST.ZS"));

			DataSet ds1 = method1.getAnalyzedData(dataSets1);
			DataSet ds2 = method2.getAnalyzedData(dataSets2);

			data.add(ds1);
			data.add(ds2);

		} else if (analysis == "a3") {

			AnalysisMethod method1 = new Ratio();

			List<DataSet> dataSets = new ArrayList<DataSet>();

			dataSets.add(Data.fetchData(country, yearStart, yearEnd, "EN.ATM.CO2E.PC"));
			dataSets.add(Data.fetchData(country, yearStart, yearEnd, "NY.GDP.PCAP.CD"));

			DataSet ds = method1.getAnalyzedData(dataSets);

			data.add(ds);

		} else if (analysis == "a6") {

			AnalysisMethod method1 = new Ratio2();

			List<DataSet> dataSets = new ArrayList<DataSet>();

			dataSets.add(Data.fetchData(country, yearStart, yearEnd, "SH.XPD.CHEX.PC.CD"));
			dataSets.add(Data.fetchData(country, yearStart, yearEnd, "SP.POP.TOTL"));
			dataSets.add(Data.fetchData(country, yearStart, yearEnd, "SH.MED.BEDS.ZS"));

			DataSet ds = method1.getAnalyzedData(dataSets);

			data.add(ds);

		} else if (analysis == "a7") {

			DataSet ds1 = Data.fetchData(country, yearStart, yearEnd, "SH.ACS.MONY.Q1.ZS");
			data.add(ds1);
			DataSet ds2 = Data.fetchData(country, yearStart, yearEnd, "SP.DYN.IMRT.IN");
			data.add(ds2);

		} else if (analysis == "a8") {

			AnalysisMethod method1 = new AnnualPercentChange();
			AnalysisMethod method2 = new AnnualPercentChange();

			List<DataSet> dataSets1 = new ArrayList<DataSet>();
			List<DataSet> dataSets2 = new ArrayList<DataSet>();

			dataSets1.add(Data.fetchData(country, yearStart - 1, yearEnd, "SE.XPD.TOTL.GD.ZS"));
			dataSets2.add(Data.fetchData(country, yearStart - 1, yearEnd, "SH.XPD.CHEX.GD.ZS"));

			DataSet ds1 = method1.getAnalyzedData(dataSets1);
			DataSet ds2 = method2.getAnalyzedData(dataSets2);

			data.add(ds1);
			data.add(ds2);

		}
		return data;
	}

	public static PieDataSet getPieData(String country, int yearStart, int yearEnd, String analysis) {
		PieDataSet Piedata = new PieDataSet();
		if (analysis == "a4") {
			Piedata = Average.getAverage(Data.fetchData(country, yearStart, yearEnd, "AG.LND.FRST.ZS"));
		} else if (analysis == "a5") {
			Piedata = Average.getAverage(Data.fetchData(country, yearStart, yearEnd, "SE.XPD.TOTL.GD.ZS"));
		}
		return Piedata;
	}

	public static List<String> captions(String analysis) {
		List<String> captions = new ArrayList<String>();
		if (analysis == "a1") {
			captions.add("CO2 emissions (metric tons per capita)");
			captions.add("Energy use (as kg of oil equivalent per capita)");
			captions.add("PM2.5 air pollution, mean annual exposure \n (as micrograms per cubic meter)");
		} else if (analysis == "a2") {
			captions.add("PM2.5 air pollution, mean annual \n exposure (as micrograms per cubic meter)");
			captions.add("Forest area (as % of land area)");
		} else if (analysis == "a3") {
			captions.add("CO2 emissions (as metric tons per capita) \n/ GDP per capita (as current US$)");
		} else if (analysis == "a4") {
			captions.add("Forest area");
			captions.add("Land for other uses");
			captions.add("Forest area (% of land area)");
		} else if (analysis == "a5") {
			captions.add("Education");
			captions.add("Other");
			captions.add("Government expenditure on education (as % of GDP)");
		} else if (analysis == "a6") {
			captions.add("Current health expenditure (per 1,000 people) \n / Hospital beds (per 1,000 people)");
		} else if (analysis == "a7") {
			captions.add(
					"Problems in accessing health care (getting money for treatment) (% of women): Q1 (lowest wealth)");
			captions.add("Mortality rate, infant (per 1,000 live births)");
		} else if (analysis == "a8") {
			captions.add("Government expenditure on education, total (% of GDP)");
			captions.add("Current health expenditure (% of GDP)");
		}
		return captions;
	}

}