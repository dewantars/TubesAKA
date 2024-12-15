/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author user
 */
public class FaktorialIteratif {
    public static int faktorialIteratif(int n) {
        int result = 1;
        while (n > 1) {
            result = result * n;
            n -= 1;
        }
        return result;
    }

}
