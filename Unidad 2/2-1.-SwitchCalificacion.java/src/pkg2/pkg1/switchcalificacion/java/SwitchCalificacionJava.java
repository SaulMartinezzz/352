/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.pkg1.switchcalificacion.java;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author badhi
 */
public class SwitchCalificacionJava {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args)throws IOException{

                //definir variables
                Scanner entrada = new Scanner(System.in);
        int calificacion;
        
        //datos de entrada 
        System.out.println("introduzca la calificacion:");
        calificacion = entrada.nextInt();
        //proceso (operación matemática)
        //datos salida
        switch (calificacion){
            case 0:
            System.out.println ("MUY MAL");
            break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("INSUFICIENTE");
                break;
            case 6:
                System.out.println("SUFICIENTE");
                break;
            case 7:
            case 8:
                System.out.println("BIEN");
                break;   
            case 9:
                System.out.println("NOTABLE");
                break;
            case 10:
                System.out.println("SOBRESALIENTE");
                break;
            default:
                System.out.println("EEROR DE CAIFICACIÓN");
                break;
        }

    }

}