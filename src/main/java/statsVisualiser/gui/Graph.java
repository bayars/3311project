package statsVisualiser.gui;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.time.Year;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import analysis.Analysis;
import fetchers.Data;
import fetchers.DataSet;
import fetchers.Point;

public class Graph extends JFrame  {
	
	
	/*
	 * A1.	Displayed as 3-series graphs, the annual percentage change of 
			EN.ATM.CO2E.PC - CO2 emissions (as metric tons per capita)  
			EG.USE.PCAP.KG.OE - Energy use (as kg of oil equivalent per capita)  
			EN.ATM.PM25.MC.M3 - PM2.5 air pollution, mean annual exposure (as micrograms per cubic meter) (3-series graph).
			
FIX THIS*	The change rate for the first selected year would be with respect to the previous year. 
			For example, if you select as a range 2018 – 2021 the annual change rate for 2018 would 
			be between 2017 and 2018. 
			
	   A2.	Displayed as 2-series graphs, the annual percentage change of 
            EN.ATM.PM25.MC.M3 - PM2.5 air pollution, mean annual exposure (as micrograms per cubic meter) 
            AG.LND.FRST.ZS - Forest area (as % of land area)
            
       A3.	Displayed as a 1-series graphs, the ratio 
			CO2 emissions (as metric tons per capita) 
			GDP per capita (as current US$)

	   A4.	Displayed as a 1-series pie chart graph, the average 
			Forest area (as % of land area) for the selected years. The rest percentage would be land for all other uses

	   A5.	Displayed as a 1-series pie chart graph, the average 
			Government expenditure on education (as % of GDP) for the selected years. The rest percentage would be expenditures for all other purposes.

	   A6.	Displayed as a 1-series graphs, the ratio (pay attention on the computations needed here)
			Current health expenditure (per 1,000 people).
			Hospital beds (per 1,000 people) 

	   A7.	Displayed as 2-series graphs 
			Problems in accessing health care (getting money for treatment) (% of women): Q1 (lowest wealth)
			Mortality rate, infant (per 1,000 live births)

	   A8.	Displayed as 2-series graphs the annual percentage change 
			Government expenditure on education, total (% of GDP) 
			Current health expenditure (% of GDP). 

	 */
	
	public static JPanel createBlankLine() {
		JPanel blank = new JPanel();
		XYSeries series = new XYSeries("");
		
		
		
		XYSeriesCollection dataset = new XYSeriesCollection();
		dataset.addSeries(series);
		JFreeChart chart = ChartFactory.createXYLineChart("", "", "", dataset,
				PlotOrientation.VERTICAL, true, true, false);

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
	
	public static JPanel createLine(String country, int yearStart, int yearEnd, String analysis) {
		
		//create new JPanel for Graph
		JPanel line = new JPanel();
		
		XYSeriesCollection dataset = null;
		
		//if  analysis 1:
		if (analysis == "a1") {	
			//create 3 datasets corresponding to annual percent change of 1, 2, and 3
			DataSet ds1 = Analysis.annualPercentChange(Data.fetchData(country, yearStart, yearEnd, "EN.ATM.CO2E.PC"));
			DataSet ds2 = Analysis.annualPercentChange(Data.fetchData(country, yearStart, yearEnd, "EG.USE.PCAP.KG.OE"));
			DataSet ds3 = Analysis.annualPercentChange(Data.fetchData(country, yearStart, yearEnd, "EN.ATM.PM25.MC.M3"));
			
			XYSeries series1 = new XYSeries("CO2 emissions (as metric tons per capita)");
			XYSeries series2 = new XYSeries("Energy use (as kg of oil equivalent per capita)");
			XYSeries series3 = new XYSeries("PM2.5 air pollution, mean annual exposure (as micrograms per cubic meter)");
			
			List<Point> points1 = ds1.getPoints();
			List<Point> points2 = ds2.getPoints();
			List<Point> points3 = ds3.getPoints();
			
			//plot the graphs
			int x = yearStart;
			for (int i = 0; i < yearEnd - yearStart; i++) {
				double y1 = points1.get(i).y;
				double y2 = points2.get(i).y;
				double y3 = points3.get(i).y;
				if (y1 > -100 && y1 < 100 && y1 != 0) {
					series1.add(x, y1);
				}
				if (y2 > -100 && y2 < 100 && y2 != 0) {
					series2.add(x, y2);
				}
				if (y3 > -100 && y3 < 100 && y3 != 0) {
					series3.add(x, y3);
				}
				
				x++;
			}
			dataset = new XYSeriesCollection();
			dataset.addSeries(series1);
			dataset.addSeries(series2);
			dataset.addSeries(series3);
			
		}else if (analysis == "a2") {
			DataSet ds1 = Analysis.annualPercentChange(Data.fetchData(country, yearStart, yearEnd, "EN.ATM.PM25.MC.M3"));
			DataSet ds2 = Analysis.annualPercentChange(Data.fetchData(country, yearStart, yearEnd, "AG.LND.FRST.ZS"));
			
			
			XYSeries series1 = new XYSeries("PM2.5 air pollution, mean annual exposure (as micrograms per cubic meter)");
			XYSeries series2 = new XYSeries("Forest area (as % of land area)");
			
			List<Point> points1 = ds1.getPoints();
			List<Point> points2 = ds2.getPoints();
			
			//plot the graphs
			int x = yearStart;
			for (int i = 0; i < yearEnd - yearStart; i++) {
				double y1 = points1.get(i).y;
				double y2 = points2.get(i).y;
				if (y1 > -100 && y1 < 100 && y1 != 0) {
					series1.add(x, y1);
				}
				if (y2 > -100 && y2 < 100 && y2 != 0) {
					series2.add(x, y2);
				}
				x++;
			}
			dataset = new XYSeriesCollection();
			dataset.addSeries(series1);
			dataset.addSeries(series2);
		}
		
		
		//Formatting 
		JFreeChart chart = ChartFactory.createXYLineChart("Population for USA", "Year", "", dataset,
				PlotOrientation.VERTICAL, true, true, false);

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
	
	private static JPanel createScatter(String country, int yearStart, int yearEnd, String analysis) {
		
		JPanel line = new JPanel();
		DataSet ds = Data.fetchData(country, yearStart, yearEnd, analysis);
		
		
		TimeSeries series = new TimeSeries("");
		
		List<Point> points = ds.getPoints();
		System.out.println(points);
		for (double x = yearStart, i = 0; x < yearEnd && i < yearEnd - yearStart; x++, i++) {
			double y = points.get((int) i).y;
			if (y == 0) {
				break;
			}
			series.add(new Year((int) x), y);
		}
		
		TimeSeriesCollection dataset = new TimeSeriesCollection();
		dataset.addSeries(series);
		

		XYPlot plot = new XYPlot();
		XYItemRenderer itemrenderer1 = new XYLineAndShapeRenderer(false, true);

		plot.setDataset(0, dataset);
		plot.setRenderer(0, itemrenderer1);
		DateAxis domainAxis = new DateAxis("Year");
		plot.setDomainAxis(domainAxis);
		plot.setRangeAxis(new NumberAxis(""));



		plot.mapDatasetToRangeAxis(0, 0);// 1st dataset to 1st y-axis


		JFreeChart scatterChart = new JFreeChart("Population for USA",
				new Font("Serif", java.awt.Font.BOLD, 18), plot, true);

		ChartPanel chartPanel = new ChartPanel(scatterChart);
		chartPanel.setPreferredSize(new Dimension(400, 300));
		chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		chartPanel.setBackground(Color.white);
		line.add(chartPanel);
		return line;
	}
	
public static void main(String[] args) {
	JFrame f = new JFrame();
	f.setSize(900, 900);
	f.pack();
	f.setVisible(true);
	
	String analysisMode = "a1";
	//JPanel g = Graph.createScatter("CAN", 2010, 2019, "EN.ATM.CO2E.PC");
	JPanel g1 = Graph.createLine("CAN", 2010, 2019, analysisMode);
	//f.getContentPane().add(g);
	f.getContentPane().add(g1);
	f.resize(500, 500);
	
}

	
}
