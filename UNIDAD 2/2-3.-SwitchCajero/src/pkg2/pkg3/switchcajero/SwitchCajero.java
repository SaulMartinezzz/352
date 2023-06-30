/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.pkg3.switchcajero;

import java.util.Scanner;

/**
 *
 * @author badhi
 */
public class SwitchCajero {

  
        public static  int opcion,opcion2;
        public static double ingresodato,retiro,saldo;
        public static Scanner entrada = new Scanner(System.in);
    
  public static void main(String[] args) {
Bucle();
    }
 public static void LecturaOpcion() {
     
System.out.println("Depositar con 1");
System.out.println("Retirar con 2");
opcion = entrada.nextInt();
    }
 public static void Opciones()  {
    
System.out.println("Tu saldo es de " + saldo);
    
 switch (opcion){
     case 1:  
     System.out.println("Ingresa monto del deposito: ");
    ingresodato = entrada.nextDouble();
    saldo =(saldo + ingresodato); 
    System.out.println("Tu saldo es de: " + saldo);
     break;
  case 2:
   
        System.out.println("Ingresa monto del retiro: ");
      ingresodato = entrada.nextDouble();
  case 3:    
    if(ingresodato<=saldo){
        saldo =(saldo - ingresodato);
            System.out.println("Tu saldo es de: " + saldo);
    }
    else
    {
     System.out.println("No tiene saldo");   
    }
  
 }
 }
 public static void Bucle(){
 
     int c=1; 

     while(c==1){
         System.out.println("¿Quieres movimiento en tu cuenta?");
     
          System.out.println("Coloca 1 para SI-----Coloca 2 para NO");
            opcion2=entrada.nextInt();
   if(opcion2 == 1)  
     {
         LecturaOpcion();
         Opciones();
     }
   else{
     System.out.println("Hata luego");  
     c++;
   }
     }
 }
}
