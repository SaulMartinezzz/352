/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.pkg6.fortablas;

/**
 *
 * @author badhi
 */
public class Fortablas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, j ;
        for(i=1; i<=10; i++){
            System.out.println("tabla del " + i);
            System.out.println("-------------------");
            
            for(j=1; j<=10; j++){
                System.out.println(i + "X" + j + "=" + j*i);
            }
        }
    }
    
}
