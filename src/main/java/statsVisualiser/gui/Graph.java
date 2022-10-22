package statsVisualiser.gui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;


import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

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

public class Graph extends JFrame {

	private static final long serialVersionUID = 1L;

	/*
	 * A1. Displayed as 3-series graphs, the annual percentage change of
	 * EN.ATM.CO2E.PC - CO2 emissions (as metric tons per capita) EG.USE.PCAP.KG.OE
	 * - Energy use (as kg of oil equivalent per capita) EN.ATM.PM25.MC.M3 - PM2.5
	 * air pollution, mean annual exposure (as micrograms per cubic meter) (3-series
	 * graph).
	 * 
	 * The change rate for the first selected year would be with respect to the
	 * previous year. For example, if you select as a range 2018 – 2021 the annual
	 * change rate for 2018 would be between 2017 and 2018.
	 * 
	 * A2. Displayed as 2-series graphs, the annual percentage change of
	 * EN.ATM.PM25.MC.M3 - PM2.5 air pollution, mean annual exposure (as micrograms
	 * per cubic meter) AG.LND.FRST.ZS - Forest area (as % of land area)
	 * 
	 * A3. Displayed as a 1-series graphs, the ratio CO2 emissions (as metric tons
	 * per capita) GDP per capita (as current US$)
	 * 
	 * A4. Displayed as a 1-series pie chart graph, the average Forest area (as % of
	 * land area) for the selected years. The rest percentage would be land for all
	 * other uses
	 * 
	 * A5. Displayed as a 1-series pie chart graph, the average Government
	 * expenditure on education (as % of GDP) for the selected years. The rest
	 * percentage would be expenditures for all other purposes.
	 * 
	 * A6. Displayed as a 1-series graphs, the ratio (pay attention on the
	 * computations needed here) Current health expenditure (per 1,000 people).
	 * Hospital beds (per 1,000 people)
	 * 
	 * A7. Displayed as 2-series graphs NO DATA Problems in accessing health care
	 * (getting money for treatment) (% of women): Q1 (lowest wealth) Mortality
	 * rate, infant (per 1,000 live births)
	 * 
	 * A8. Displayed as 2-series graphs the annual percentage change Government
	 * expenditure on education, total (% of GDP) Current health expenditure (% of
	 * GDP).
	 * 
	 */

	public static JPanel createBlankLine() {
		JPanel blank = new JPanel();
		XYSeries series = new XYSeries("");

		XYSeriesCollection dataset = new XYSeriesCollection();
		dataset.addSeries(series);
		JFreeChart chart = ChartFactory.createXYLineChart("", "", "", dataset, PlotOrientation.VERTICAL, true, true,
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

		ChartPanel chartPanel = new ChartPanel(chart);
		chartPanel.setPreferredSize(new Dimension(400, 300));
		chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		chartPanel.setBackground(Color.white);

		blank.add(chartPanel);
		return blank;
	}

	public static JPanel createBlankScatter() {
		JPanel scatter = new JPanel();

		TimeSeriesCollection dataset = new TimeSeriesCollection();

		XYPlot plot = new XYPlot();

		plot.setDataset(0, dataset);

		DateAxis domainAxis = new DateAxis("");
		plot.setDomainAxis(domainAxis);
		plot.setRangeAxis(new NumberAxis(""));

		plot.mapDatasetToRangeAxis(0, 0);// 1st dataset to 1st y-axis
		plot.mapDatasetToRangeAxis(1, 1); // 2nd dataset to 2nd y-axis

		JFreeChart scatterChart = new JFreeChart("", new Font("Serif", java.awt.Font.BOLD, 18), plot, true);

		ChartPanel chartPanel = new ChartPanel(scatterChart);
		chartPanel.setPreferredSize(new Dimension(400, 300));
		chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		chartPanel.setBackground(Color.white);
		scatter.add(chartPanel);
		return scatter;

	}

	public static JPanel createBlankPie() {
		JPanel pie = new JPanel();
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.addValue(100, "", "");
		JFreeChart pieChart = ChartFactory.createMultiplePieChart("", dataset, TableOrder.BY_COLUMN, true, true, false);

		ChartPanel chartPanel = new ChartPanel(pieChart);
		chartPanel.setPreferredSize(new Dimension(400, 300));
		chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		chartPanel.setBackground(Color.white);
		pie.add(chartPanel);
		return pie;
	}

	// -------------------------Pie--------------------------------------------------------------------------------

	public static JPanel createPie(String country, int yearStart, int yearEnd, String analysis) {

		JPanel pie = new JPanel();
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		PieDataSet pds = Analysis.getPieData(country, yearStart, yearEnd, analysis);
		//System.out.println(pds + "\n");

		List<String> captions = Analysis.captions(analysis);
		//System.out.println(captions.get(index));

		dataset.addValue(pds.getSections().get(0), captions.get(0), captions.get(2));
		dataset.addValue(pds.getSections().get(1), captions.get(1), captions.get(2));

		JFreeChart pieChart = ChartFactory.createMultiplePieChart(analysis, dataset, TableOrder.BY_COLUMN, true, true,
				false);

		ChartPanel chartPanel = new ChartPanel(pieChart);
		chartPanel.setPreferredSize(new Dimension(400, 300));
		chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		chartPanel.setBackground(Color.white);
		pie.add(chartPanel);
		return pie;
	}

	// -------------------------Line--------------------------------------------------------------------------------
	public static JPanel createLine(String country, int yearStart, int yearEnd, String analysis) {

		// create new JPanel for Graph
		JPanel line = new JPanel();
		int i = 0;
		int j = 0;
		XYSeriesCollection dataset;
		List<XYSeries> series = new ArrayList<XYSeries>();
		List<List<Point>> points = new ArrayList<List<Point>>();
		
		List<DataSet> data = Analysis.getData(country, yearStart, yearEnd, analysis);
		List<String> captions = Analysis.captions(analysis);
		
		//System.out.println(data.size());
		for (String s : captions) {
			System.out.println(s);
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
			System.out.println(y);
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
		return line;
	}

	// -------------------------Bar--------------------------------------------------------------------------------
	public static JPanel createBar(String country, int yearStart, int yearEnd, String analysis) {

		JPanel bar = new JPanel();
		CategoryPlot plot = new CategoryPlot();
		int i = 0;
		int j = 0;
		List<List<Point>> points = new ArrayList<List<Point>>();
		List<DefaultCategoryDataset> dataset = new ArrayList<DefaultCategoryDataset>();
		List<BarRenderer> barrenderer = new ArrayList<BarRenderer>();
		
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
					dataset.get(j).setValue(y.get(j), captions.get(j), String.valueOf(x));
				}
			}

			x++;
		}

		CategoryAxis domainAxis = new CategoryAxis("Year");
		plot.setDomainAxis(domainAxis);

		for (i = 0; i < points.size(); i++) {

			plot.setDataset(1, dataset.get(i));
			plot.setRenderer(1, barrenderer.get(i));
			plot.setRangeAxis(1, new NumberAxis(""));
		}

		plot.mapDatasetToRangeAxis(0, 0);// 1st dataset to 1st y-axis
		plot.mapDatasetToRangeAxis(1, 1); // 2nd dataset to 2nd y-axis

		// Formatting
		JFreeChart barChart = new JFreeChart("", new Font("Serif", java.awt.Font.BOLD, 18), plot, true);

		ChartPanel chartPanel = new ChartPanel(barChart);
		chartPanel.setPreferredSize(new Dimension(400, 300));
		chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		chartPanel.setBackground(Color.white);
		bar.add(chartPanel);
		return bar;

	}

	// -------------------------Scatter--------------------------------------------------------------------------------

	public static JPanel createScatter(String country, int yearStart, int yearEnd, String analysis) {

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
		return scatter;
	}

//	public static void main(String[] args) {
//		// dont change
//		JFrame f = new JFrame();
//		f.setSize(900, 900);
//		f.pack();
//		f.setVisible(true);
//
//		// check all analysis modes
//		String analysisMode = "a5";
//
//		// check all graph types
//		JPanel g1 = Graph.createPie("CHN", 2008, 2008, analysisMode);
//
//		// dont change
//		f.getContentPane().add(g1);
//		f.resize(500, 500);
//
//	}

}
