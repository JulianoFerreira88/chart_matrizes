package com.components.charts;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class PieChart extends JPanel {

    private JFreeChart chart;

    public PieChart() {
        super(new CardLayout());
        DefaultPieDataset data = new DefaultPieDataset();
        data.setValue("Janeiro", 25.0);
        data.setValue("Fevereiro", 12.5);
        data.setValue("Março", 67.5);
        chart = ChartFactory.createPieChart("", data);
        chart.setBackgroundPaint(Color.darkGray);
        PiePlot p = (PiePlot) chart.getPlot();
        p.setBackgroundPaint(Color.darkGray);

        this.add(new ChartPanel(chart));
    }

    public void setChartSeriesLegendVisible() {

    }

    private PiePlot getPiePlot() {
        return (PiePlot) chart.getPlot();
    }

}
