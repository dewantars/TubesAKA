/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;
import java.math.BigInteger;
/**
 *
 * @author user
 */
public class PermutasiIteratif {
    public static BigInteger permutasi(int n, int r) {
        BigInteger result = BigInteger.ONE;
        for (int i = 0; i<r; i++){
            result = result.multiply(BigInteger.valueOf(n-i));
        }
        return result;
    }

}
