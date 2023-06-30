/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.pkg7.forfactorial;

import java.util.Scanner;

/**
 *
 * @author badhi
 */
public class Forfactorial {
    /**
     * @param args the command line arguments
     */
  
    
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner entrada= new Scanner(System.in);
        double factorial;
        int num;
        System.out.println("INTRODUCE EL NUMERO:");
        num = entrada.nextInt();
        factorial = 1;
        for(int i=num; i > 0; i--){
        factorial=factorial*i;
        
    }
     System.out.println("el factorial de "+ factorial);
    }
    
}
   

      