/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.pkg9.whilemedia;

import java.util.Scanner;

/**
 *
 * @author badhi
 */
public class Whilemedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        int num, suma, elementos;
        float media;
        
        System.out.println("Introdusca un numero :");
        num =entrada.nextInt();
        
        suma= 0;
        elementos=0;
        
        while(num>=0){
            suma+= num;
            elementos++;
            
            System.out.println("Introduce otro numero: ");
            num=entrada.nextInt();
           
               
            }
           media =(float)suma/elementos;
                System.out.println("La media es de: " + media);
        }
    }
