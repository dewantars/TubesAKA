/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author Dewanta Rahma Satria
 */
public class FaktorialRekursif {
    
    public static int faktorialRekursif(int n){
        if (n<=1){
            return 1;
        }else{
            return n * faktorialRekursif(n-1);
        }
    }
}
