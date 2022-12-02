package statsVisualiser.graph;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.time.Year;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import analysis.Analysis;
import fetchers.DataSet;
import fetchers.PieDataSet;
import fetchers.Point;

public class ScatterGraph extends Graph {

	
	
	
	public ScatterGraph(String country, int yearStart, int yearEnd, String analysis) {
		if (wrongAnalysisType(country, yearStart, yearEnd, analysis)) {
			return;
		}

		// create new JPanel for Graph
		JPanel scatter = new JPanel();
		TimeSeriesCollection dataset = null;
		int i = 0;
		int j = 0;
		List<TimeSeries> series = new ArrayList<TimeSeries>();
		List<List<Point>> points = new ArrayList<List<Point>>();

		List<DataSet> data = Analysis.getData(country, yearStart, yearEnd, analysis);
		List<String> captions = Analysis.captions(analysis);

		for (String s : captions) {
			TimeSeries newseries = new TimeSeries(s);
			series.add(newseries);
			points.add(data.get(i).getPoints());
			i++;
		}

		// plot the graphs
		int x = yearStart;
		for (i = 0; i < (yearEnd - yearStart) + 1; i++) {
			List<Double> y = new ArrayList<Double>();
			for (j = 0; j < points.size(); j++) {
				y.add(points.get(j).get(i).y);
				if (y.get(j) > -100 && y.get(j) < 100 && y.get(j) != 0) {
					series.get(j).add(new Year(x), y.get(j));
				}
			}
			x++;
		}

		dataset = new TimeSeriesCollection();

		for (i = 0; i < series.size(); i++)

		{
			dataset.addSeries(series.get(i));
		}
		XYPlot plot = new XYPlot();
		XYItemRenderer itemrenderer1 = new XYLineAndShapeRenderer(false, true);

		plot.setDataset(0, dataset);
		plot.setRenderer(0, itemrenderer1);
		DateAxis domainAxis = new DateAxis("Year");
		plot.setDomainAxis(domainAxis);
		plot.setRangeAxis(new NumberAxis(""));

		plot.mapDatasetToRangeAxis(0, 0);// 1st dataset to 1st y-axis

		JFreeChart scatterChart = new JFreeChart(analysis, new Font("Serif", java.awt.Font.BOLD, 18), plot, true);

		ChartPanel chartPanel = new ChartPanel(scatterChart);
		chartPanel.setPreferredSize(new Dimension(400, 300));
		chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		chartPanel.setBackground(Color.white);
		scatter.add(chartPanel);
		this.panel = scatter;
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
		if (analysis.equals("Average Forest Area")  || analysis.equals("Average Government Expenditure on Education") ) {
			return true;
		}
		return false;
	}
	
	
}
