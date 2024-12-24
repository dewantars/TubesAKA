/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
import javax.swing.table.DefaultTableModel;

public class Tabel_Grafik {

    public static long[][] ukurWaktu(int[] inputSizes) {
        long[][] times = new long[2][inputSizes.length]; 
        // Index 0 untuk Iteratif, Index 1 untuk Rekursif

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

    public static JPanel buatGrafik(int[] inputSizes, long[][] times) {
        //membuat grafik dari data times
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (int i = 0; i < inputSizes.length; i++) {
            dataset.addValue(times[0][i], "Permutasi Iteratif", String.valueOf(inputSizes[i]));
            dataset.addValue(times[1][i], "Permutasi Rekursif", String.valueOf(inputSizes[i]));
        }

        JFreeChart lineChart = ChartFactory.createLineChart(
                "Perbandingan Running Time Algoritma",
                "Ukuran Input (r)",
                "Waktu Eksekusi (ns)",
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false);

        return new ChartPanel(lineChart);
    }

    public static JPanel buatTabel(int[] inputSizes, long[][] times) {
        // membuat tabel dari data times
        String[] columnNames = {"Ukuran Input (r)", "Waktu Iteratif (ns)", "Waktu Rekursif (ns)"};
        Object[][] tableData = new Object[inputSizes.length][3];

        for (int i = 0; i < inputSizes.length; i++) {
            tableData[i][0] = inputSizes[i];
            tableData[i][1] = times[0][i];
            tableData[i][2] = times[1][i];
        }

        DefaultTableModel tableModel = new DefaultTableModel(tableData, columnNames);
        JTable table = new JTable(tableModel);
        table.setFillsViewportHeight(true);

        JScrollPane scrollPane = new JScrollPane(table);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(scrollPane);

        return panel;
    }

    public static void main(String[] args) {
        int[] inputSizes = {85, 255, 349, 400};
        long[][] times = ukurWaktu(inputSizes);

        // Buat JFrame utama
        JFrame frame = new JFrame("Perbandingan Running Time: Grafik dan Tabel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 700);

        // Buat panel untuk grafik dan tabel
        JPanel grafikPanel = buatGrafik(inputSizes, times);
        JPanel tabelPanel = buatTabel(inputSizes, times);

        // Tambahkan grafik dan tabel ke dalam split pane
        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, grafikPanel, tabelPanel);
        splitPane.setDividerLocation(350); // Atur tinggi awal untuk grafik
        splitPane.setResizeWeight(0.5);

        frame.add(splitPane);
        frame.setVisible(true);
    }
}
