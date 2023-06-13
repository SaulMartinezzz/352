/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9.desecdiasemana.java;

/**
 *
 * @author badhi
 */
import java.util.Scanner;
public class DesecDiasemanaJava {
static double pago, monto, iva ;
    static String dia;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        pedirDatos();
        compra(pago, monto, iva, dia);
    }
    
    public static void pedirDatos(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dame la cantidad de la compra:");
        monto = entrada.nextInt();
        System.out.println("Dame el dia de la compra:");
        dia = entrada.next();
        
    }
    
    public static void compra(double pago, double monto, 
       double iva, String dia){
       double res;
        String dias = dia.toLowerCase();
        if ("Martes".equals(dias) ) {
            pago = (monto-(monto * 0.20));
             iva = pago * 0.16;
             res = pago + iva;
             System.out.println(dias+" Es un dia de descuento.");
             System.out.println(" La cantidad  a pagar es = "+res);
        }else{
            System.out.println("No hay descuento.");
            System.out.println("La cantidad a pagar es: "+monto);
        }
             
    }
}  
  
