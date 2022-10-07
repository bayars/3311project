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
import fetchers.Data;
import fetchers.DataSet;
import fetchers.PieDataSet;
import fetchers.Point;

public class Graph extends JFrame  {
	
	
	/*
	 * A1.	Displayed as 3-series graphs, the annual percentage change of 
			EN.ATM.CO2E.PC - CO2 emissions (as metric tons per capita)  
			EG.USE.PCAP.KG.OE - Energy use (as kg of oil equivalent per capita)  
			EN.ATM.PM25.MC.M3 - PM2.5 air pollution, mean annual exposure (as micrograms per cubic meter) (3-series graph).
			
			The change rate for the first selected year would be with respect to the previous year. 
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
*NO DATA	Problems in accessing health care (getting money for treatment) (% of women): Q1 (lowest wealth)
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

		JFreeChart scatterChart = new JFreeChart("",
				new Font("Serif", java.awt.Font.BOLD, 18), plot, true);

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
		JFreeChart pieChart = ChartFactory.createMultiplePieChart("", dataset,
				TableOrder.BY_COLUMN, true, true, false);

		ChartPanel chartPanel = new ChartPanel(pieChart);
		chartPanel.setPreferredSize(new Dimension(400, 300));
		chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		chartPanel.setBackground(Color.white);
		pie.add(chartPanel);
		return pie;
	}
	
	
	public static JPanel createPie(String country, int yearStart, int yearEnd, String analysis) {
		
		JPanel pie = new JPanel();
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		
		if (analysis == "a4") {	
			PieDataSet pds = Analysis.average(Data.fetchData(country, yearStart, yearEnd, "AG.LND.FRST.ZS"));
			dataset.addValue(pds.getSections().get(0), "Forest area", "Forest area (% of land area)");
			dataset.addValue(pds.getSections().get(1), "Land for other uses", "Forest area (% of land area)");
		
		}else if(analysis == "a5") {	
			PieDataSet pds = Analysis.average(Data.fetchData(country, yearStart, yearEnd, "SE.XPD.TOTL.GD.ZS"));
			dataset.addValue(pds.getSections().get(0), "Education", "Government expenditure on education (as % of GDP)");
			dataset.addValue(pds.getSections().get(1), "Other", "Government expenditure on education (as % of GDP)");
		}
		
		JFreeChart pieChart = ChartFactory.createMultiplePieChart(analysis, dataset,
				TableOrder.BY_COLUMN, true, true, false);

		ChartPanel chartPanel = new ChartPanel(pieChart);
		chartPanel.setPreferredSize(new Dimension(400, 300));
		chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		chartPanel.setBackground(Color.white);
		pie.add(chartPanel);
		return pie;
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
		
		//if  analysis 2:
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
			
			
		//if  analysis 3:
		}else if (analysis == "a3") {
			DataSet ds = Analysis.ratio(Data.fetchData(country, yearStart, yearEnd, "EN.ATM.CO2E.PC"), 
					Data.fetchData(country, yearStart, yearEnd, "NY.GDP.PCAP.CD"));
			
			XYSeries series = new XYSeries("CO2 emissions (as metric tons per capita) / GDP per capita (as current US$)");
			
			List<Point> points = ds.getPoints();
			
			int x = yearStart;
			for (int i = 0; i < yearEnd - yearStart; i++) {
				double y = points.get(i).y;
				System.out.println(x + ", " + y);
				series.add(x, y);
				x++;
			}
			dataset = new XYSeriesCollection();
			dataset.addSeries(series);
		
		
		//if  analysis 6: (WTF IS THIS)
		}else if (analysis == "a6") {
		
			
		//if  analysis 7: (DS1 has no data)
		}else if (analysis == "a7") {
			DataSet ds1 = Data.fetchData(country, yearStart, yearEnd, "SH.ACS.MONY.Q1.ZS");
			DataSet ds2 = Data.fetchData(country, yearStart, yearEnd, "SP.DYN.IMRT.IN");
			
			XYSeries series1 = new XYSeries("Problems in accessing health care (getting money for treatment) (% of women): Q1 (lowest wealth)");
			XYSeries series2 = new XYSeries("Mortality rate, infant (per 1,000 live births)");
			
			List<Point> points1 = ds1.getPoints();
			List<Point> points2 = ds2.getPoints();
			
			//plot the graphs
			int x = yearStart;
			for (int i = 0; i < yearEnd - yearStart; i++) {
				double y1 = points1.get(i).y;
				double y2 = points2.get(i).y;
				series1.add(x, y1);
				series2.add(x, y2);
				x++;
			}
			dataset = new XYSeriesCollection();
			dataset.addSeries(series1);
			dataset.addSeries(series2);
			
		//if  analysis 8:
		}else if (analysis == "a8") {
			DataSet ds1 = Analysis.annualPercentChange(Data.fetchData(country, yearStart, yearEnd, "SE.XPD.TOTL.GD.ZS"));
			DataSet ds2 = Analysis.annualPercentChange(Data.fetchData(country, yearStart, yearEnd, "SH.XPD.CHEX.GD.ZS"));
			
			
			XYSeries series1 = new XYSeries("Government expenditure on education, total (% of GDP) ");
			XYSeries series2 = new XYSeries("Current health expenditure (% of GDP)");
			
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
		JFreeChart chart = ChartFactory.createXYLineChart("", "Year", "", dataset,
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
	
	public static JPanel createBar(String country, int yearStart, int yearEnd, String analysis) {
		
		JPanel bar = new JPanel();
		CategoryPlot plot = new CategoryPlot();
		
		//if  analysis 1:
		if (analysis == "a1") {	
			
			DefaultCategoryDataset dataset = new DefaultCategoryDataset();
			DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();
			DefaultCategoryDataset dataset3 = new DefaultCategoryDataset();


			//create 3 datasets corresponding to annual percent change of 1, 2, and 3
			DataSet ds1 = Analysis.annualPercentChange(Data.fetchData(country, yearStart, yearEnd, "EN.ATM.CO2E.PC"));
			DataSet ds2 = Analysis.annualPercentChange(Data.fetchData(country, yearStart, yearEnd, "EG.USE.PCAP.KG.OE"));
			DataSet ds3 = Analysis.annualPercentChange(Data.fetchData(country, yearStart, yearEnd, "EN.ATM.PM25.MC.M3"));
			
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
					dataset.setValue(y1, "CO2 emissions (as metric tons per capita)", String.valueOf(x));
				}
				if (y2 > -100 && y2 < 100 && y2 != 0) {
					dataset2.setValue(y2, "Energy use (as kg of oil equivalent per capita)", String.valueOf(x));
				}
				if (y3 > -100 && y3 < 100 && y3 != 0) {
					dataset3.setValue(y3, "PM2.5 air pollution, mean annual exposure (as micrograms per cubic meter)", String.valueOf(x));
				}
				
				x++;
			}
		
			BarRenderer barrenderer1 = new BarRenderer();
			BarRenderer barrenderer2 = new BarRenderer();
			BarRenderer barrenderer3 = new BarRenderer();
			

			plot.setDataset(0, dataset);
			plot.setRenderer(0, barrenderer1);
			CategoryAxis domainAxis = new CategoryAxis("Year");
			plot.setDomainAxis(domainAxis);
			plot.setRangeAxis(new NumberAxis(""));

			plot.setDataset(1, dataset2);
			plot.setRenderer(1, barrenderer2);
			plot.setRangeAxis(1, new NumberAxis(""));
			
			plot.setDataset(1, dataset3);
			plot.setRenderer(1, barrenderer3);
			plot.setRangeAxis(1, new NumberAxis(""));

			plot.mapDatasetToRangeAxis(0, 0);// 1st dataset to 1st y-axis
			plot.mapDatasetToRangeAxis(1, 1); // 2nd dataset to 2nd y-axis
		
		//if  analysis 2:
		}else if (analysis == "a2") {
			
			DefaultCategoryDataset dataset = new DefaultCategoryDataset();
			DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();
			
			
			DataSet ds1 = Analysis.annualPercentChange(Data.fetchData(country, yearStart, yearEnd, "EN.ATM.PM25.MC.M3"));
			DataSet ds2 = Analysis.annualPercentChange(Data.fetchData(country, yearStart, yearEnd, "AG.LND.FRST.ZS"));
			
			
			List<Point> points1 = ds1.getPoints();
			List<Point> points2 = ds2.getPoints();
			
			//plot the graphs
			int x = yearStart;
			for (int i = 0; i < yearEnd - yearStart; i++) {
				double y1 = points1.get(i).y;
				double y2 = points2.get(i).y;
				if (y1 > -100 && y1 < 100 && y1 != 0) {
					dataset.setValue(y1, "PM2.5 air pollution, mean annual exposure (as micrograms per cubic meter)", String.valueOf(x));				}
				if (y2 > -100 && y2 < 100 && y2 != 0) {
					dataset2.setValue(y2, "Forest area (as % of land area)", String.valueOf(x));				}
				x++;
			}

			BarRenderer barrenderer1 = new BarRenderer();
			BarRenderer barrenderer2 = new BarRenderer();
			
			

			plot.setDataset(0, dataset);
			plot.setRenderer(0, barrenderer1);
			CategoryAxis domainAxis = new CategoryAxis("Year");
			plot.setDomainAxis(domainAxis);
			plot.setRangeAxis(new NumberAxis(""));

			plot.setDataset(1, dataset2);
			plot.setRenderer(1, barrenderer2);
			plot.setRangeAxis(1, new NumberAxis(""));
		

			plot.mapDatasetToRangeAxis(0, 0);// 1st dataset to 1st y-axis
			plot.mapDatasetToRangeAxis(1, 1); // 2nd dataset to 2nd y-axis
			
			
			
		//if  analysis 3:
		}else if (analysis == "a3") {
			
			DefaultCategoryDataset dataset = new DefaultCategoryDataset();
			
			DataSet ds = Analysis.ratio(Data.fetchData(country, yearStart, yearEnd, "EN.ATM.CO2E.PC"), 
					Data.fetchData(country, yearStart, yearEnd, "NY.GDP.PCAP.CD"));
			
			XYSeries series = new XYSeries("CO2 emissions (as metric tons per capita) / GDP per capita (as current US$)");
			
			List<Point> points = ds.getPoints();
			
			int x = yearStart;
			for (int i = 0; i < yearEnd - yearStart; i++) {
				double y = points.get(i).y;
				dataset.setValue(y, "CO2 emissions (as metric tons per capita) / GDP per capita (as current US$)", String.valueOf(x));				

				x++;
			}
	
			BarRenderer barrenderer1 = new BarRenderer();
	
			plot.setDataset(0, dataset);
			plot.setRenderer(0, barrenderer1);
			CategoryAxis domainAxis = new CategoryAxis("Year");
			plot.setDomainAxis(domainAxis);
			plot.setRangeAxis(new NumberAxis(""));

	

			plot.mapDatasetToRangeAxis(0, 0);// 1st dataset to 1st y-axis
			
		
		//if  analysis 6: (WTF IS THIS)
		}else if (analysis == "a6") {
		
			
		//if  analysis 7: (DS1 has no data)
		}else if (analysis == "a7") {
			
			DefaultCategoryDataset dataset = new DefaultCategoryDataset();
			DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();
			
			
			DataSet ds1 = Data.fetchData(country, yearStart, yearEnd, "SH.ACS.MONY.Q1.ZS");
			DataSet ds2 = Data.fetchData(country, yearStart, yearEnd, "SP.DYN.IMRT.IN");
			
			List<Point> points1 = ds1.getPoints();
			List<Point> points2 = ds2.getPoints();
			
			//plot the graphs
			int x = yearStart;
			for (int i = 0; i < yearEnd - yearStart; i++) {
				double y1 = points1.get(i).y;
				double y2 = points2.get(i).y;
				dataset.setValue(y1, "Problems in accessing health care (getting money for treatment) (% of women): Q1 (lowest wealth)", String.valueOf(x));	
				dataset2.setValue(y2, "Mortality rate, infant (per 1,000 live births)", String.valueOf(x));					
				x++;
			}
		
			BarRenderer barrenderer1 = new BarRenderer();
			BarRenderer barrenderer2 = new BarRenderer();
			
			

			plot.setDataset(0, dataset);
			plot.setRenderer(0, barrenderer1);
			CategoryAxis domainAxis = new CategoryAxis("Year");
			plot.setDomainAxis(domainAxis);
			plot.setRangeAxis(new NumberAxis(""));

			plot.setDataset(1, dataset2);
			plot.setRenderer(1, barrenderer2);
			plot.setRangeAxis(1, new NumberAxis(""));
		

			plot.mapDatasetToRangeAxis(0, 0);// 1st dataset to 1st y-axis
			plot.mapDatasetToRangeAxis(1, 1); // 2nd dataset to 2nd y-axis
			
		//if  analysis 8:
		}else if (analysis == "a8") {
			
			DefaultCategoryDataset dataset = new DefaultCategoryDataset();
			DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();
			
			DataSet ds1 = Analysis.annualPercentChange(Data.fetchData(country, yearStart, yearEnd, "SE.XPD.TOTL.GD.ZS"));
			DataSet ds2 = Analysis.annualPercentChange(Data.fetchData(country, yearStart, yearEnd, "SH.XPD.CHEX.GD.ZS"));
			
			
			XYSeries series1 = new XYSeries("Government expenditure on education, total (% of GDP) ");
			XYSeries series2 = new XYSeries("Current health expenditure (% of GDP)");
			
			List<Point> points1 = ds1.getPoints();
			List<Point> points2 = ds2.getPoints();
			
			//plot the graphs
			int x = yearStart;
			for (int i = 0; i < yearEnd - yearStart; i++) {
				double y1 = points1.get(i).y;
				double y2 = points2.get(i).y;
				if (y1 > -100 && y1 < 100 && y1 != 0) {
					dataset.setValue(y1, "Government expenditure on education, total (% of GDP)", String.valueOf(x));	
				}
				if (y2 > -100 && y2 < 100 && y2 != 0) {
					dataset.setValue(y2, "Current health expenditure (% of GDP)", String.valueOf(x));	
				}
				x++;
			}
			
			BarRenderer barrenderer1 = new BarRenderer();
			BarRenderer barrenderer2 = new BarRenderer();
			
			

			plot.setDataset(0, dataset);
			plot.setRenderer(0, barrenderer1);
			CategoryAxis domainAxis = new CategoryAxis("Year");
			plot.setDomainAxis(domainAxis);
			plot.setRangeAxis(new NumberAxis(""));

			plot.setDataset(1, dataset2);
			plot.setRenderer(1, barrenderer2);
			plot.setRangeAxis(1, new NumberAxis(""));
		

			plot.mapDatasetToRangeAxis(0, 0);// 1st dataset to 1st y-axis
			plot.mapDatasetToRangeAxis(1, 1); // 2nd dataset to 2nd y-axis
		}
		
		
		
		//Formatting 
		JFreeChart barChart = new JFreeChart("", new Font("Serif", java.awt.Font.BOLD, 18), plot, true);

		

		ChartPanel chartPanel = new ChartPanel(barChart);
		chartPanel.setPreferredSize(new Dimension(400, 300));
		chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		chartPanel.setBackground(Color.white);
		bar.add(chartPanel);
		return bar;
		
		
	}

	
	
	public static JPanel createScatter(String country, int yearStart, int yearEnd, String analysis) {
		

		//create new JPanel for Graph
		JPanel scatter = new JPanel();
		
		TimeSeriesCollection dataset = null;
		
		//if  analysis 1:
		if (analysis == "a1") {	
			//create 3 datasets corresponding to annual percent change of 1, 2, and 3
			DataSet ds1 = Analysis.annualPercentChange(Data.fetchData(country, yearStart, yearEnd, "EN.ATM.CO2E.PC"));
			DataSet ds2 = Analysis.annualPercentChange(Data.fetchData(country, yearStart, yearEnd, "EG.USE.PCAP.KG.OE"));
			DataSet ds3 = Analysis.annualPercentChange(Data.fetchData(country, yearStart, yearEnd, "EN.ATM.PM25.MC.M3"));
			
			TimeSeries series1 = new TimeSeries("CO2 emissions (as metric tons per capita)");
			TimeSeries series2 = new TimeSeries("Energy use (as kg of oil equivalent per capita)");
			TimeSeries series3 = new TimeSeries("PM2.5 air pollution, mean annual exposure (as micrograms per cubic meter)");
			
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
					series1.add(new Year(x), y1);
				}
				if (y2 > -100 && y2 < 100 && y2 != 0) {
					series2.add(new Year(x), y2);
				}
				if (y3 > -100 && y3 < 100 && y3 != 0) {
					series3.add(new Year(x), y3);
				}
				
				x++;
			}
			dataset = new TimeSeriesCollection();
			dataset.addSeries(series1);
			dataset.addSeries(series2);
			dataset.addSeries(series3);
		
		//if  analysis 2:
		}else if (analysis == "a2") {
			DataSet ds1 = Analysis.annualPercentChange(Data.fetchData(country, yearStart, yearEnd, "EN.ATM.PM25.MC.M3"));
			DataSet ds2 = Analysis.annualPercentChange(Data.fetchData(country, yearStart, yearEnd, "AG.LND.FRST.ZS"));
			
			
			TimeSeries series1 = new TimeSeries("PM2.5 air pollution, mean annual exposure (as micrograms per cubic meter)");
			TimeSeries series2 = new TimeSeries("Forest area (as % of land area)");
			
			List<Point> points1 = ds1.getPoints();
			List<Point> points2 = ds2.getPoints();
			
			//plot the graphs
			int x = yearStart;
			for (int i = 0; i < yearEnd - yearStart; i++) {
				double y1 = points1.get(i).y;
				double y2 = points2.get(i).y;
				if (y1 > -100 && y1 < 100 && y1 != 0) {
					series1.add(new Year(x), y1);
				}
				if (y2 > -100 && y2 < 100 && y2 != 0) {
					series2.add(new Year(x), y2);
				}
				x++;
			}
			dataset = new TimeSeriesCollection();
			dataset.addSeries(series1);
			dataset.addSeries(series2);
			
			
		//if  analysis 3:
		}else if (analysis == "a3") {
			DataSet ds = Analysis.ratio(Data.fetchData(country, yearStart, yearEnd, "EN.ATM.CO2E.PC"), 
					Data.fetchData(country, yearStart, yearEnd, "NY.GDP.PCAP.CD"));
			
			TimeSeries series = new TimeSeries("CO2 emissions (as metric tons per capita) / GDP per capita (as current US$)");
			
			List<Point> points = ds.getPoints();
			
			int x = yearStart;
			for (int i = 0; i < yearEnd - yearStart; i++) {
				double y = points.get(i).y;
				System.out.println(x + ", " + y);
				series.add(new Year(x), y);
				x++;
			}
			dataset = new TimeSeriesCollection();
			dataset.addSeries(series);
		
		
		//if  analysis 6: (WTF IS THIS)
		}else if (analysis == "a6") {
		
			
		//if  analysis 7: (DS1 has no data)
		}else if (analysis == "a7") {
			DataSet ds1 = Data.fetchData(country, yearStart, yearEnd, "SH.ACS.MONY.Q1.ZS");
			DataSet ds2 = Data.fetchData(country, yearStart, yearEnd, "SP.DYN.IMRT.IN");
			
			TimeSeries series1 = new TimeSeries("Problems in accessing health care (getting money for treatment) (% of women): Q1 (lowest wealth)");
			TimeSeries series2 = new TimeSeries("Mortality rate, infant (per 1,000 live births)");
			
			List<Point> points1 = ds1.getPoints();
			List<Point> points2 = ds2.getPoints();
			
			//plot the graphs
			int x = yearStart;
			for (int i = 0; i < yearEnd - yearStart; i++) {
				double y1 = points1.get(i).y;
				double y2 = points2.get(i).y;
				series1.add(new Year(x), y1);
				series2.add(new Year(x), y2);
				x++;
			}
			dataset = new TimeSeriesCollection();
			dataset.addSeries(series1);
			dataset.addSeries(series2);
			
		//if  analysis 8:
		}else if (analysis == "a8") {
			DataSet ds1 = Analysis.annualPercentChange(Data.fetchData(country, yearStart, yearEnd, "SE.XPD.TOTL.GD.ZS"));
			DataSet ds2 = Analysis.annualPercentChange(Data.fetchData(country, yearStart, yearEnd, "SH.XPD.CHEX.GD.ZS"));
			
			
			TimeSeries series1 = new TimeSeries("Government expenditure on education, total (% of GDP) ");
			TimeSeries series2 = new TimeSeries("Current health expenditure (% of GDP)");
			
			List<Point> points1 = ds1.getPoints();
			List<Point> points2 = ds2.getPoints();
			
			//plot the graphs
			int x = yearStart;
			for (int i = 0; i < yearEnd - yearStart; i++) {
				double y1 = points1.get(i).y;
				double y2 = points2.get(i).y;
				if (y1 > -100 && y1 < 100 && y1 != 0) {
					series1.add(new Year(x), y1);
				}
				if (y2 > -100 && y2 < 100 && y2 != 0) {
					series2.add(new Year(x), y2);
				}
				x++;
			}
			dataset = new TimeSeriesCollection();
			dataset.addSeries(series1);
			dataset.addSeries(series2);
		}
		

		XYPlot plot = new XYPlot();
		XYItemRenderer itemrenderer1 = new XYLineAndShapeRenderer(false, true);

		plot.setDataset(0, dataset);
		plot.setRenderer(0, itemrenderer1);
		DateAxis domainAxis = new DateAxis("Year");
		plot.setDomainAxis(domainAxis);
		plot.setRangeAxis(new NumberAxis(""));



		plot.mapDatasetToRangeAxis(0, 0);// 1st dataset to 1st y-axis


		JFreeChart scatterChart = new JFreeChart(analysis,
				new Font("Serif", java.awt.Font.BOLD, 18), plot, true);

		ChartPanel chartPanel = new ChartPanel(scatterChart);
		chartPanel.setPreferredSize(new Dimension(400, 300));
		chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		chartPanel.setBackground(Color.white);
		scatter.add(chartPanel);
		return scatter;
	}
	
public static void main(String[] args) {
	JFrame f = new JFrame();
	f.setSize(900, 900);
	f.pack();
	f.setVisible(true);
	
	String analysisMode = "a7";
	//JPanel g = Graph.createScatter("CAN", 2010, 2019, "EN.ATM.CO2E.PC");
	JPanel g1 = Graph.createBar("USA", 2011, 2017, analysisMode);
	//f.getContentPane().add(g);
	f.getContentPane().add(g1);
	f.resize(500, 500);
	
}

	
}
