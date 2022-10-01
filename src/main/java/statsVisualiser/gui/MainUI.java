/*************************************************
 * FALL 2022
 * EECS 3311 GUI SAMPLE CODE
 * ONLT AS A REFERENCE TO SEE THE USE OF THE jFree FRAMEWORK
 * THE CODE BELOW DOES NOT DEPICT THE DESIGN TO BE FOLLOWED 
 */

package statsVisualiser.gui;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.List;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.time.Year;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import fetchers.Data;
import fetchers.DataSet;
import fetchers.Point;

public class MainUI extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static MainUI instance;

	public static MainUI getInstance() {
		if (instance == null)
			instance = new MainUI();

		return instance;
	}
	
	String country;

	private MainUI() {
		// Set window title
		super("Country Statistics");

		// Set top bar
		JLabel chooseCountryLabel = new JLabel("Choose a country: ");
		Vector<String> countriesNames = new Vector<String>();
		countriesNames.add("USA");
		countriesNames.add("Canada");
		countriesNames.add("France");
		countriesNames.add("China");
		countriesNames.add("Brazil");
		countriesNames.sort(null);
		JComboBox<String> countriesList = new JComboBox<String>(countriesNames);
		
		
		//testing
		countriesList.addActionListener(null);
		country = (String) countriesList.getSelectedItem();

		JLabel from = new JLabel("From");
		JLabel to = new JLabel("To");
		Vector<String> years = new Vector<String>();
		for (int i = 2021; i >= 2010; i--) {
			years.add("" + i);
		}
		JComboBox<String> fromList = new JComboBox<String>(years);
		JComboBox<String> toList = new JComboBox<String>(years);

		JPanel north = new JPanel();
		north.add(chooseCountryLabel);
		north.add(countriesList);
		north.add(from);
		north.add(fromList);
		north.add(to);
		north.add(toList);

		// Set bottom bar
		JButton recalculate = new JButton("Recalculate");

		JLabel viewsLabel = new JLabel("Available Views: ");

		Vector<String> viewsNames = new Vector<String>();
		viewsNames.add("Pie Chart");
		viewsNames.add("Line Chart");
		viewsNames.add("Bar Chart");
		viewsNames.add("Scatter Chart");
		viewsNames.add("Report");
		JComboBox<String> viewsList = new JComboBox<String>(viewsNames);
		JButton addView = new JButton("+");
		JButton removeView = new JButton("-");

		JLabel methodLabel = new JLabel("        Choose analysis method: ");

		Vector<String> methodsNames = new Vector<String>();
		methodsNames.add("Mortality");
		methodsNames.add("Mortality vs Expenses");
		methodsNames.add("Mortality vs Expenses & Hospital Beds");
		methodsNames.add("Mortality vs GDP");
		methodsNames.add("Unemployment vs GDP");
		methodsNames.add("Unemployment");

		JComboBox<String> methodsList = new JComboBox<String>(methodsNames);

		JPanel south = new JPanel();
		south.add(viewsLabel);
		south.add(viewsList);
		south.add(addView);
		south.add(removeView);

		south.add(methodLabel);
		south.add(methodsList);
		south.add(recalculate);

		JPanel east = new JPanel();

		// Set charts region
		JPanel west = new JPanel();
		west.setLayout(new GridLayout(2, 0));
		createCharts(west);

		getContentPane().add(north, BorderLayout.NORTH);
		getContentPane().add(east, BorderLayout.EAST);
		getContentPane().add(south, BorderLayout.SOUTH);
		getContentPane().add(west, BorderLayout.WEST);
	}

	private void createCharts(JPanel west) {
		createLine(west);
		
		

	}

	


	

	//testing so far..

	private void createLine(JPanel west) {
		
		country = "CAN";
		int startYear = 2000;
		int endYear = 2021;
		DataSet ds = Data.fetchData(country, startYear, endYear, "EN.ATM.CO2E.PC");
		
		XYSeries series = new XYSeries("Population for USA");
		List<Point> points = ds.getPoints();
		System.out.println(points);
		for (double x = startYear, i = 0; x < endYear && i < endYear - startYear; x++, i++) {
			double y = points.get((int) i).y;
			if (y == 0) {
				break;
			}
			series.add(x, y);
		}
		
		XYSeriesCollection dataset = new XYSeriesCollection();
		dataset.addSeries(series);
		

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

		chart.setTitle(new TextTitle("Population for USA", new Font("Serif", java.awt.Font.BOLD, 18)));

		ChartPanel chartPanel = new ChartPanel(chart);
		chartPanel.setPreferredSize(new Dimension(400, 300));
		chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		chartPanel.setBackground(Color.white);
		west.add(chartPanel);

	}

	

	public static void main(String[] args) {

		JFrame frame = MainUI.getInstance();
		frame.setSize(900, 600);
		frame.pack();
		frame.setVisible(true);
	}
	// TODO Auto-generated method stub
	

}