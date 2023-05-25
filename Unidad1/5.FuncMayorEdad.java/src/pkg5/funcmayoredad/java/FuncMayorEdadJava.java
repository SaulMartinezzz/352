
package pkg5.funcmayoredad.java;

/**
 *
 * @author badhi
 */
import java.util.Scanner;
public class FuncMayorEdadJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int numero;
       System.out.println("Dame tu edad");
       numero=entrada.nextInt();
       System.out.println(retornaEdad(numero));
    }
       public static String retornaEdad(int numero){
        
        if (numero >=18){
             System.out.println("eres mayor de edad");
        }else if (numero<=18){
             System.out.println("eres menor de edad");
        }
 
       return " ESTE ES TU CASO";
    }
}
