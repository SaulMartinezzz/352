/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.v2trifiv.java;

/**
 *
 * @author badhi
 */
public class V2TRIFIVJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        int mult3;
        int mult5;
        BufferedReader bufEntrada = new BufferedReader (new InputStreamReader(System.in));
        //Entrada de datos 
        System.out.println("Dame el numero");
        numero = Integer.parseInt(bufEntrada.readLine());
        //Procesamiento de datos 
        mult3 = numero % 3;
        mult5 = numero % 5;
        //Salida de datos 
        if (mult3 == 0 && mult5 == 0){System.out.println("TRIFIV");}
        else if (mult3 == 0){System.out.println("TRI");}
        else if (mult5 == 0){System.out.println("FIV");}
        
        
    }
    
}