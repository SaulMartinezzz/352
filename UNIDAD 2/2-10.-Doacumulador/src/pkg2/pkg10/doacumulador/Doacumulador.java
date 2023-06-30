/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.pkg10.doacumulador;

import java.util.Scanner;

/**
 *
 * @author badhi
 */
public class Doacumulador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner  entrada= new Scanner(System.in);
      int num,suma;
      suma=0;
      do{
          System.out.println("Introduzca el numero: ");
          num= entrada.nextInt();
          suma= suma + num;
      }while(num!=0);
      
        System.out.println("La suma de todo es: "+ suma);
    }
    
}
