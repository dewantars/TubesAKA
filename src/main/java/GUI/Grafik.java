/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GUI;

import Code.PermutasiIteratif;
import Code.PermutasiRekursif;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.*;

public class Grafik {
    
    public static long[][] ukurWaktu(int[] inputSizes) {
        long[][] times = new long[2][inputSizes.length]; // Index 0 untuk Iteratif, Index 1 untuk Rekursif

        for (int i = 0; i < inputSizes.length; i++) {
            int size = inputSizes[i];

            // Ukur waktu untuk algoritma iteratif
            long startTime = System.nanoTime();
            PermutasiIteratif.permutasi(400, size);
            long endTime = System.nanoTime();
            times[0][i] = endTime - startTime;

            // Ukur waktu untuk algoritma rekursif
            startTime = System.nanoTime();
            PermutasiRekursif.permutasi(400, size);
            endTime = System.nanoTime();
            times[1][i] = endTime - startTime;
        }

        return times;
    }
    public static void tampilkanGrafik(int[] inputSizes, long[][] times) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (int i = 0; i < inputSizes.length; i++) {
            dataset.addValue(times[0][i], "Permutasi Iteratif", String.valueOf(inputSizes[i]));
            dataset.addValue(times[1][i], "Permutasi Rekursif", String.valueOf(inputSizes[i]));
        }

        JFreeChart lineChart = ChartFactory.createLineChart(
                "Perbandingan Algoritma: Running Time",
                "Ukuran Input (r)",
                "Waktu Eksekusi (ns)",
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false);

        ChartPanel chartPanel = new ChartPanel(lineChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        JFrame frame = new JFrame("Grafik Perbandingan Running Time");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(chartPanel);
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        int[] inputSizes = {1, 10, 20, 50, 85, 255, 349, 400};
        long[][] times = ukurWaktu(inputSizes);

        // Tampilkan grafik
        tampilkanGrafik(inputSizes, times);
    }
}
