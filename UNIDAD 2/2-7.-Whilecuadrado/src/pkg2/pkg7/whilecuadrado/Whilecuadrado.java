/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.pkg7.whilecuadrado;

import java.util.Scanner;

/**
 *
 * @author badhi
 */
public class Whilecuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int num, cuadrado;
        System.out.println("Introduzca el numero :");
        num= entrada.nextInt();
        while(num >=0){
            cuadrado = num * num;
            System.out.println("Elcuadrado de  "+ num + "Es igual a " + cuadrado );
            System.out.println("");
            System.out.println("Introduzca otro numero :");
            num=entrada.nextInt();
        }
    }
    
}
