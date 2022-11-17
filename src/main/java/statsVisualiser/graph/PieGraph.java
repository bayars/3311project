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
import fetchers.DataSet;
import fetchers.PieDataSet;

public class PieGraph extends graph {
	public PieGraph(String country, int yearStart, int yearEnd, String analysis) {
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
        List<DataSet> data = Analysis.getData(country, yearStart, yearEnd, analysis);
        int count = 0;
        int countY = 0;
        System.out.println(data.get(0).length());

        for (int i = 0; i < data.size(); i++) {
            for (int j = 0; j < data.get(i).getPoints().size(); j++) {
                countY ++;
                if (data.get(i).getPoints().get(j).y == 0) {
                    count++;
                }
            }
        }
        if (count ==  countY) {
            return true;
        }
        return false;
    }
}
