/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10.tipoclima.java;
import java.util.Scanner;
/**
 *
 * @author badhi
 */
public class TipoClimaJava {
static int clima = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         pedir();
       comprobar(clima);
    }
    public static void pedir(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa la tempertura en centigrados: ");
        clima = entrada.nextInt();
    }
    public static void comprobar(int clima){
        if (clima<=10) {
            System.out.println("El clima es Frio");
        }else if (clima>10 && clima<=20) {
            System.out.println("El clima es Nublado");
        }else if (clima>20 && clima<=30) {
            System.out.println("El clima es Caluroso");
        }else if (clima>30) {
            System.out.println("El clima es Tropical");
        }
    }
    
}