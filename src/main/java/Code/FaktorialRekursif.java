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
public class FaktorialRekursif {
    
    public static BigInteger faktorialRekursif(int n){
        if (n <= 1) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(n).multiply(faktorialRekursif(n - 1));
        }
    }
}
