/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.determinaetapas.java;
import java.util.Scanner;
/**
 *
 * @author badhi
 */
public class DeterminaEtapasJava {
 static int edad=0;
   
    public static void main(String[] args) {
        pedirDatos();
        calculoEdad(edad);
        
    }
    public static void pedirDatos(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa la edad: ");
        edad = entrada.nextInt();
    }
    
    public static void calculoEdad(int edad){
        if (edad<5) {
            System.out.println("Infante");
        }else if (edad<18) {
            System.out.println("Niño");
        }else if (edad>=18) {
            System.out.println("Adulto");
        }else{
            System.out.println("No exite esa edad");
        }
    }
}
  