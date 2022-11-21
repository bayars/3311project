package statsVisualiser.graph;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

import analysis.Analysis;
import fetchers.DataSet;
import fetchers.Point;

public class BarGraph extends Graph {

	public BarGraph(String country, int yearStart, int yearEnd, String analysis) {
		if (wrongAnalysisType(country, yearStart, yearEnd, analysis)) {
			return;
		}
		
		JPanel bar = new JPanel();
		CategoryPlot plot = new CategoryPlot();
		int i = 0;
		int j = 0;
		List<List<Point>> points = new ArrayList<List<Point>>();
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();

		List<DataSet> data = Analysis.getData(country, yearStart, yearEnd, analysis);
		List<String> captions = Analysis.captions(analysis);

		for (i = 0; i < data.size(); i++) {
			points.add(data.get(i).getPoints());
		}

		// plot the graphs
		int x = yearStart;
		for (i = 0; i < (yearEnd - yearStart) + 1; i++) {
			List<Double> y = new ArrayList<Double>();
			for (j = 0; j < points.size(); j++) {
				y.add(points.get(j).get(i).y);
				if (y.get(j) > -100 && y.get(j) < 100 && y.get(j) != 0) {
					dataset.setValue(y.get(j), captions.get(j), String.valueOf(x));
				}
			}
			x++;
		}

		BarRenderer barrenderer = new BarRenderer();

		plot.setDataset(0, dataset);
		plot.setRenderer(0, barrenderer);
		CategoryAxis domainAxis = new CategoryAxis("Year");
		plot.setDomainAxis(domainAxis);
		plot.setRangeAxis(new NumberAxis(""));

		plot.mapDatasetToRangeAxis(0, 0);// 1st dataset to 1st y-axis

		JFreeChart barChart = new JFreeChart(analysis,
				new Font("Serif", java.awt.Font.BOLD, 18), plot, true);

		ChartPanel chartPanel = new ChartPanel(barChart);
		chartPanel.setPreferredSize(new Dimension(400, 300));
		chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		chartPanel.setBackground(Color.white);
		bar.add(chartPanel);
		this.panel = bar;
	}
	
	public boolean isEmpty(String country, int yearStart, int yearEnd, String analysis) {
        List<DataSet> data = Analysis.getData(country, yearStart, yearEnd, analysis);
        int count = 0;
        int countY = 0;
        //System.out.println(data.get(0).length());

        for (int i = 0; i < data.size(); i++) {
            for (int j = 0; j < data.get(i).getPoints().size(); j++) {
                countY ++;
                if (Double.isNaN(data.get(i).getPoints().get(j).y) || data.get(i).getPoints().get(j).y == 0) {
                    count++;
                }
            }
        }
        if (count ==  countY) {
            return true;
        }
        return false;
    }
	
	public boolean wrongAnalysisType(String country, int yearStart, int yearEnd, String analysis) {
		if (analysis == "Average Forest Area" || analysis == "Average Government Expenditure on Education") {
			return true;
		}
		return false;
	}
}
