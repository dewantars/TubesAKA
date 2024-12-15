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
    public static int getFactorialForLoop(int n) {
        int result = 1;
        if (n > 1) {
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            return result;
        }
        else {
            System.out.println("n has to be positive");
            return result;
        }
    }

}
