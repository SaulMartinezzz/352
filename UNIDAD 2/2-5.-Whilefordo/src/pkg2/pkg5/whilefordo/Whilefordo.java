/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.pkg5.whilefordo;

/**
 *
 * @author badhi
 */
public class Whilefordo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("nueros del 1 al 100 con WHILE");
        int i=1;
        while (i<=100){
            System.out.println(i);
            i++;
        }
    int j=i;
    do{
        System.out.println(j);
        j++;
        
    }while (j<=100);
    
    System.out.println("numeros del 1 al 100 con FOR");
        for(int k=1; k<100; k++){
            System.out.println(k);
            
        }
    }
}
