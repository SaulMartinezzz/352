/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg2.maquinadispensadora;

import java.util.Scanner;

/**
 *
 * @author badhi
 */
public class MaquinaDispensadora {

    /**
     * @param args the command line arguments
     */
      static Scanner ent = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
       String [] producto = {"Chocolate", "Gomitas", "Papas", "Chicles", "Panques"}; 
       
       int [] precios = {10,8,15,5,25};
       
       int [] cantidad = {5,5,5,5,5};
       
       int [] clave = {1, 2, 3, 4, 5};
       
       int op;
       
       for (int i = 0; i < 100; i++) {
        System.out.println("     ");
        System.out.println("Clave       Producto         Precio         Cantidad");
        System.out.println(clave[0]+"           "+producto[0]+"           "+precios[0]+"             "+cantidad[0]);
        System.out.println(clave[1]+"           "+producto[1]+"             "+precios[1]+"              "+cantidad[1]);
        System.out.println(clave[2]+"           "+producto[2]+"               "+precios[2]+"             "+cantidad[2]);
        System.out.println(clave[3]+"           "+producto[3]+"             "+precios[3]+"              "+cantidad[3]);
        System.out.println(clave[4]+"           "+producto[4]+"             "+precios[4]+"             "+cantidad[4]);
            System.out.println("    ");
            System.out.println("1. Pedir");
            System.out.println("2. Mostrar");
            System.out.println("3. Rellenar");
            System.out.println("4. Apagar Maquina");
            System.out.println("Selecciona una opcion");
            op = ent.nextInt();
            switch (op) {
                case 1:
                    pedir(clave, producto, cantidad, precios);
                    break;
                case 2:
                    mostrar(producto, cantidad);
                    break;
                case 3:
                    rellenar(cantidad);
                    break;
                case 4:
                    System.exit(0);
                default:
                    throw new AssertionError();
            }

    }
    }
    
    public static void rellenar(int [] cantidad){
        int rellenar, pro;  
        
        System.out.println("Ingresa la clave del producto a rellenar");
            pro = ent.nextInt();
            switch (pro) {
                case 1:
                    System.out.println("Cantidad de piezas para agregar?");
                    rellenar = ent.nextInt();
                    cantidad[0]= cantidad[0]+rellenar;
                    break;
                case 2:
                    System.out.println("Cantidad de piezas para agregar?");
                    rellenar = ent.nextInt();
                    cantidad[1]= cantidad[1]+rellenar;
                    break;
                case 3:
                    System.out.println("Cantidad de piezas para agregar?");
                    rellenar = ent.nextInt();
                    cantidad[2]= cantidad[2]+rellenar;
                    break;
                case 4:
                    System.out.println("Cantidad de piezas para agregar?");
                    rellenar = ent.nextInt();
                    cantidad[3]= cantidad[3]+rellenar;
                    break;
                case 5:
                    System.out.println("Cantidad de piezas para agregar?");
                    rellenar = ent.nextInt();
                    cantidad[4]= cantidad[4]+rellenar;
                    break;
                default:
                    throw new AssertionError();
            }
    }
       
        public static void pedir(int [] clave, String [] producto, int [] cantidad, int [] precios ){
            int cla,pago,piezas;
            System.out.println("Ingresa la clave del producto que desea...");
            cla = ent.nextInt();
            switch (cla) {
                case 1:
                    System.out.println(producto[0]);
                    System.out.println("Selecciona la cantidad de piezas");
                    piezas = ent.nextInt();
                    if (piezas <= cantidad[0]) {
                        pago = piezas*precios[0];
                        System.out.println("---------------------");
                        System.out.println("Cantidad a pagar es: "+pago);
                        System.out.println("---------------------");
                        cantidad[0]= cantidad[0]-piezas;
                    }else{
                        System.out.println("Producto inalcanzable, vuelva a intentarlo");
                    }
                    break;
                    
                case 2:
                    System.out.println(producto[1]);
                    System.out.println("Selecciona la cantidad de piezas");
                    piezas = ent.nextInt();
                    if (piezas <= cantidad[1]) {
                        pago = piezas*precios[1];
                        System.out.println("---------------------");
                        System.out.println("Cantidad a pagar es: "+pago);
                        System.out.println("---------------------");
                        cantidad[1]= cantidad[1]-piezas;
                    }else{
                        System.out.println("Producto inalcanzable, vuelva a intentarlo");
                    }
                    break;
                    
                case 3:
                    System.out.println(producto[2]);
                    System.out.println("Selecciona la cantidad de piezas");
                    piezas = ent.nextInt();
                    if (piezas <= cantidad[2]) {
                        pago = piezas*precios[2];
                        System.out.println("---------------------");
                        System.out.println("Cantidad a pagar es: "+pago);
                        System.out.println("---------------------");
                        cantidad[2]= cantidad[2]-piezas;
                    }else{
                        System.out.println("Producto inalcanzable, vuelva a intentarlo");
                    }
                    break;
                    
                case 4:
                    System.out.println(producto[3]);
                    System.out.println("Selecciona la cantidad de piezas");
                    piezas = ent.nextInt();
                    if (piezas <= cantidad[3]) {
                        pago = piezas*precios[3];
                        System.out.println("---------------------");
                        System.out.println("Cantidad a pagar es: "+pago);
                        System.out.println("---------------------");
                        cantidad[3]= cantidad[3]-piezas;
                    }else{
                        System.out.println("Producto inalcanzable, vuelva a intentarlo");
                    }
                    break;
                    
                case 5:
                    System.out.println(producto[4]);
                    System.out.println("Selecciona la cantidad de piezas");
                    piezas = ent.nextInt();
                    if (piezas <= cantidad[4]) {
                        pago = piezas*precios[4];
                        System.out.println("---------------------");
                        System.out.println("Cantidad a pagar es: "+pago);
                        System.out.println("---------------------");
                        cantidad[4]= cantidad[4]-piezas;
                    }else{
                        System.out.println("Producto inalcanzable, vuelva a intentarlo");
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        }
       
   public static void mostrar(String[]producto, int[]cantidad){
        System.out.println("-------------------------");
        System.out.println("|Producto        Cantidad|");
        System.out.println("|"+producto[0]+"           "+cantidad[0]+"   |");
        System.out.println("|"+producto[1]+"             "+cantidad[1]+"   |");
        System.out.println("|"+producto[2]+"               "+cantidad[2]+"   |");
        System.out.println("|"+producto[3]+"             "+cantidad[3]+"   |");
        System.out.println("|"+producto[4]+"             "+cantidad[4]+"   |");
        System.out.println("-------------------------"); 
   }
   
}