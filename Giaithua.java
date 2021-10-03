/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaithua;

import java.util.Scanner;

public class Giaithua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        System.out.println(giaiThua(n));
        
        ip.close();
    }
    public static long giaiThua(int n){
        if (n == 0 || n == 1){
        return 1;        
    } else {
            return n * giaiThua(n - 1);
        }
    
    
    
    
}
    
}
