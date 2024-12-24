/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;
import Code.PermutasiIteratif;
import Code.PermutasiRekursif;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author user
 */
public class Tabel {
    public static long[][] ukurWaktu(int[] inputSizes) {
        long[][] times = new long[2][inputSizes.length]; // Index 0: Iteratif, Index 1: Rekursif

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
    public static void tampilkanTabel(int[] inputSizes, long[][] times) {
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
        JFrame frame = new JFrame("Tabel Perbandingan Running Time");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(scrollPane);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        int[] inputSizes = {85, 255, 349, 400};
        long[][] times = ukurWaktu(inputSizes);

        // Tampilkan tabel
        tampilkanTabel(inputSizes, times);
    }
}
