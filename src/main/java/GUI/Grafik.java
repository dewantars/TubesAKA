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

    public static void main(String[] args) {
        // Data ukuran input
        int[] inputSizes = {85, 255, 349, 400}; 
        long[] IteratifTimes = new long[inputSizes.length];
        long[] RekursifTimes = new long[inputSizes.length];

        // Mengukur waktu eksekusi untuk kedua algoritma
        for (int i = 0; i < inputSizes.length; i++) {
            int size = inputSizes[i];

            // Ukur waktu untuk algoritma iteratif
            long startTime = System.nanoTime();
            PermutasiIteratif.permutasi(400, size);
            long endTime = System.nanoTime();
            IteratifTimes[i] = (endTime - startTime);

            // Ukur waktu untuk algoritma rekursif
            startTime = System.nanoTime();
            PermutasiRekursif.permutasi(400, size);
            endTime = System.nanoTime();
            RekursifTimes[i] = (endTime - startTime);
        }

        // Membuat dataset untuk grafik
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < inputSizes.length; i++) {
            dataset.addValue(IteratifTimes[i], "Permutasi Iteratif", String.valueOf(inputSizes[i]));
            dataset.addValue(RekursifTimes[i], "Permutasi Rekursif", String.valueOf(inputSizes[i]));
        }

        // Membuat grafik
        JFreeChart lineChart = ChartFactory.createLineChart(
                "Perbandingan Algoritma: Running Time",
                "Ukuran Input (r)",
                "Waktu Eksekusi (ns)",
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false);

        // Menampilkan grafik
        ChartPanel chartPanel = new ChartPanel(lineChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        JFrame frame = new JFrame("Grafik Perbandingan Running Time");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(chartPanel);
        frame.pack();
        frame.setVisible(true);
    }
}
