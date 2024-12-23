/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GUI;

import java.math.BigInteger;
import Code.PermutasiIteratif;
import Code.PermutasiRekursif;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.util.Arrays;

public class Grafik {

    public static void main(String[] args) {
        // Data ukuran input dan waktu eksekusi
        int[] inputSizes = {1, 5, 10, 15, 20};
        long[] executionTimes = new long[inputSizes.length];
        long[] executionTimes2 = new long[inputSizes.length];

        // Mengukur waktu eksekusi untuk setiap ukuran input
        for (int i = 0; i < inputSizes.length; i++) {
            int size = inputSizes[i];
            long startTime = System.nanoTime();
            
            BigInteger result = PermutasiRekursif.permutasi(30, size);
            
            long endTime = System.nanoTime();
            executionTimes[i] = (endTime - startTime) ; 
            
            startTime = System.nanoTime();
        }

        // Membuat dataset
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < inputSizes.length; i++) {
            dataset.addValue(executionTimes[i], "Execution Time", String.valueOf(inputSizes[i]));
        }

        // Membuat grafik
        JFreeChart lineChart = ChartFactory.createLineChart(
                "Running Time vs Input Size",
                "Input Size",
                "Time (ns)",
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false);

        // Menampilkan grafik
        ChartPanel chartPanel = new ChartPanel(lineChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(chartPanel);
        frame.pack();
        frame.setVisible(true);
    }
}

