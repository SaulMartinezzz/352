/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vitrifiv;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class VITRIFIV {


    public static void main(String[] args) throws IOException {
        // Declaracion de variables 
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
        if(mult3 == 0){System.out.println("Tri");}
        if(mult5 == 0){System.out.println("fiv");}
        if(mult3 == 0 && mult5 == 0){System.out.println("TriFiv");}
    }
    
}
