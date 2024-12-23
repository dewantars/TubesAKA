/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

import java.math.BigInteger;
/**
 *
 * @author Dewanta Rahma Satria
 */
public class PermutasiRekursif {
    
    public static BigInteger permutasi(int n, int r){
        if (r == 0) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(n).multiply(permutasi(n-1, r-1));
        }
    }
}
