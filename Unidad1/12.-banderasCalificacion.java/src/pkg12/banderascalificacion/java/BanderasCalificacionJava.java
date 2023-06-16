/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12.banderascalificacion.java;

/**
 *
 * @author badhi
 */
public class BanderasCalificacionJava {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
      int calificacionaprobatoria=7; 
      int calificacion1=7;
      int calificacion2=8;
      int calificacion3=5;
      int calificacion4=4;
      int calificacion5=5;
      boolean bandera1;
      bandera1=(calificacion1>=calificacionaprobatoria);
      boolean bandera2;
      bandera2=(calificacion2>=calificacionaprobatoria);
      boolean bandera3;
      bandera3=(calificacion3>=calificacionaprobatoria);
      boolean bandera4;
      bandera4=(calificacion4>=calificacionaprobatoria);
      boolean bandera5;
      bandera5=(calificacion5>=calificacionaprobatoria);
      System.out.println("Resultado de calificacion: " +bandera1+bandera2+bandera3+bandera4+bandera5);
    }
}