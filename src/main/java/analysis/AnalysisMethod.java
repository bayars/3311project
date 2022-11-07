package analysis;

import java.util.List;

import fetchers.DataSet;

public interface AnalysisMethod {
	
	public DataSet getAnalyzedData(List<DataSet> dataSets);

}
