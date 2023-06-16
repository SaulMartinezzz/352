/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11.banderas.java;

/**
 *
 * @author badhi
 */
public class BanderasJava {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        int edadJuan=22;
        int edadPedro=20;
        boolean bandera1;
        bandera1=(edadJuan>edadPedro);
        System.out.println("Resultado de bandera: "+bandera1);
        int edadLupe=35;
        boolean bandera2;
        boolean bandera3;
        bandera2=(edadLupe<edadPedro);
        bandera3=(bandera1&& bandera2);
        System.out.println("El resultado de bandera3 es : "+ bandera3);
       
    }
    
}
