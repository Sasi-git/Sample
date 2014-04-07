package seleniumeasy.com;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class JFree_Chart_Test 
{

	public void pieChartReport()

	{

		// Creating a simple pie chart with 
		 DefaultPieDataset pieDataset = new DefaultPieDataset();
		 pieDataset.setValue("Pre-Requisite(10%)", new Integer(10));
		 pieDataset.setValue("Batch 1(65%)", new Integer(65));
		 pieDataset.setValue("Batch 2(25%)", new Integer(25));

		 JFreeChart piechart = ChartFactory.createPieChart("Release 5 Execution", pieDataset, true, true, false);
		 
		 PiePlot plot = (PiePlot) piechart.getPlot();
		 plot.setSectionPaint("Pre-Requisite(10%)", Color.green);
		 plot.setSectionPaint("Batch 1(65%)", Color.red);
		 plot.setSectionPaint("Batch 2(25%)", Color.yellow);

		 try 
		 {

			ChartUtilities.saveChartAsJPEG(new File("E:\\SASI\\Release5.jpg"), piechart, 1500, 1000);
		 } catch (IOException e) 
		 {

			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

 public static void main(String[] args) 
 {

	 JFree_Chart_Test get = new JFree_Chart_Test();
	 get.pieChartReport();
	 

 }
}
