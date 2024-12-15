/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Code;

import java.util.Scanner;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Masukkan jumlah orang: ");
            int orang = scan.nextInt();
            System.out.println("Masukkan jumlah barang yang diperebutkan");
            int barang = scan.nextInt();
            if (orang <= 0 || barang <= 0) {
                throw new IllegalArgumentException("Bilangan harus lebih besar dari 0.");
            }

            BigInteger hasil = FaktorialIteratif.faktorialIteratif(orang).divide(FaktorialIteratif.faktorialIteratif(orang - barang));
            BigInteger hasil2 = FaktorialRekursif.faktorialRekursif(orang).divide(FaktorialRekursif.faktorialRekursif(orang - barang));

            System.out.println("Hasil iteratif: " + hasil);
            System.out.println("Hasil Rekursif: " + hasil2);
        } catch (IllegalArgumentException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Input tidak valid. Harap masukkan bilangan integer positif.");
        } finally {
            scan.close();
        }
    }
}