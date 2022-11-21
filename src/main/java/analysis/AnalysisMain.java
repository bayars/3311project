package analysis;

	import java.util.ArrayList;
	import java.util.List;

	import fetchers.Data;
	import fetchers.DataSet;
public class AnalysisMain {

	
	
	



	public static void main(String[] args) {
			
			List<DataSet> datasetList = new ArrayList<DataSet>(); 
			AnnualPercentChange method = new AnnualPercentChange();
			
			datasetList.add(Data.fetchData("CAN",2021 , 1999, "EN.ATM.CO2E.PC"));
			 
			 DataSet ds = method.getAnalyzedData(datasetList);
		}

	}

	
	
	
	

