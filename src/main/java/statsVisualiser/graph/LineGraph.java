package statsVisualiser.graph;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import analysis.Analysis;
import fetchers.DataSet;
import fetchers.Point;

public class LineGraph extends Graph {

	

	
	
	public LineGraph(String country, int yearStart, int yearEnd, String analysis) {
		if (wrongAnalysisType(country, yearStart, yearEnd, analysis)) {
			return;
		}
		

		// create new JPanel for Graph
				JPanel line = new JPanel();
				int i = 0;
				int j = 0;
				XYSeriesCollection dataset;
				List<XYSeries> series = new ArrayList<XYSeries>();
				List<List<Point>> points = new ArrayList<List<Point>>();

				List<DataSet> data = Analysis.getData(country, yearStart, yearEnd, analysis);
				System.out.println("data size: " + data.size());
				List<String> captions = Analysis.captions(analysis);

				// System.out.println(data.size());
				for (String s : captions) {
					// System.out.println(s);
					XYSeries newseries = new XYSeries(s);
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
							series.get(j).add(x, y.get(j));
						}
					}
					// System.out.println(y);
					x++;
				}

				dataset = new XYSeriesCollection();

				for (i = 0; i < series.size(); i++) {
					dataset.addSeries(series.get(i));
				}

				// Formatting
				JFreeChart chart = ChartFactory.createXYLineChart("", "Year", "", dataset, PlotOrientation.VERTICAL, true, true,
						false);

				XYPlot plot = chart.getXYPlot();

				XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
				renderer.setSeriesPaint(0, Color.RED);
				renderer.setSeriesStroke(0, new BasicStroke(2.0f));

				plot.setRenderer(renderer);
				plot.setBackgroundPaint(Color.white);

				plot.setRangeGridlinesVisible(true);
				plot.setRangeGridlinePaint(Color.BLACK);

				plot.setDomainGridlinesVisible(true);
				plot.setDomainGridlinePaint(Color.BLACK);

				chart.getLegend().setFrame(BlockBorder.NONE);

				chart.setTitle(new TextTitle(String.format("%s", analysis), new Font("Serif", java.awt.Font.BOLD, 18)));

				ChartPanel chartPanel = new ChartPanel(chart);
				chartPanel.setPreferredSize(new Dimension(400, 300));
				chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
				chartPanel.setBackground(Color.white);
				line.add(chartPanel);
				this.panel = line;
		
		
		
	}
	
	public boolean isEmpty(String country, int yearStart, int yearEnd, String analysis) {
        List<DataSet> data = Analysis.getData(country, yearStart, yearEnd, analysis);
        int count = 0;
        int countY = 0;
       // System.out.println("length: " + data.get(0).length());

        for (int i = 0; i < data.size(); i++) {
            for (int j = 0; j < data.get(i).getPoints().size(); j++) {
                countY ++;
               // System.out.println("countY: " + countY);
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
		if (analysis == "a4" || analysis == "a5") {
			return true;
		}
		return false;
	}

}
