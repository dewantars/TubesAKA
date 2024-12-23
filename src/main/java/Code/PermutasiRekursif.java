/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

import java.math.BigInteger;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author Dewanta Rahma Satria
 */
public class PermutasiRekursif {
    
    public static BigInteger permutasi(int n, int r, List<Integer> list){
        if (r == 0) {
            return BigInteger.ONE;
        } else {
            Collections.sort(list);
            return BigInteger.valueOf(n).multiply(permutasi(n-1, r-1,list));
        }
    }
}
