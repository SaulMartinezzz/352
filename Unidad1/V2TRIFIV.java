package v2trifiv.java;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class V2TRIFIVJava {

  
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
        if (mult3 == 0 && mult5 == 0){System.out.println("TRIFIV");}
        else if (mult3 == 0){System.out.println("TRI");}
        else if (mult5 == 0){System.out.println("FIV");}
        
        
    }
    
}
