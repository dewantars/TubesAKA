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
public class FaktorialIteratif {
    public static BigInteger faktorialIteratif(int n) {
        BigInteger result = BigInteger.ONE;
        while (n > 1) {
            result = result.multiply(BigInteger.valueOf(n));
            n -= 1;
        }
        return result;
    }

}
