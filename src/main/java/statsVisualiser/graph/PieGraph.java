package statsVisualiser.graph;

import java.awt.Color;
import java.awt.Dimension;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.DefaultCategoryDataset;

import analysis.Analysis;
import fetchers.Data;
import fetchers.DataSet;
import fetchers.PieDataSet;

public class PieGraph extends Graph {
	public PieGraph(String country, int yearStart, int yearEnd, String analysis) {
		if (wrongAnalysisType(country, yearStart, yearEnd, analysis)) {
			return;
		}
		JPanel pie = new JPanel();
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		PieDataSet pds = Analysis.getPieData(country, yearStart, yearEnd, analysis);
		// System.out.println(pds + "\n");

		List<String> captions = Analysis.captions(analysis);
		// System.out.println(captions.get(index));

		dataset.addValue(pds.getSections().get(0), captions.get(0), captions.get(2));
		dataset.addValue(pds.getSections().get(1), captions.get(1), captions.get(2));

		JFreeChart pieChart = ChartFactory.createMultiplePieChart(analysis, dataset, TableOrder.BY_COLUMN, true, true,
				false);

		ChartPanel chartPanel = new ChartPanel(pieChart);
		chartPanel.setPreferredSize(new Dimension(400, 300));
		chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		chartPanel.setBackground(Color.white);
		pie.add(chartPanel);
		this.panel = pie;

	}
	
	public boolean isEmpty(String country, int yearStart, int yearEnd, String analysis) {
		DataSet data = null;
		if (analysis == "a4") {
			data = Data.fetchData(country, yearStart, yearEnd, "AG.LND.FRST.ZS");
		}else if (analysis == "a5") {
			data = Data.fetchData(country, yearStart, yearEnd, "SE.XPD.TOTL.GD.ZS");
		}
        for (int j = 0; j < data.p.size(); j++) {
         
            if (data.p.get(j).y == 0) {
            	return true;
            }
        }
        return false;
    }
	
	public boolean wrongAnalysisType(String country, int yearStart, int yearEnd, String analysis) {
		if (analysis != "a4" && analysis != "a5") {
			return true;
		}
		return false;
	}
}
