/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg1.conteo;

import java.util.Scanner;

/**
 *
 * @author badhi
 */
public class Conteo {

    /**
     * @param args the command line arguments
     */
    static int [] sexo = new int [2];
    static int [] trabajo = new int [2];
    static Scanner ent = new Scanner(System.in);
    static int mujer, hombre, ts, tn, ht, mt, nsex, ntraba, nsueldo, sinsueldo, consueldo, pht, pmt, prom, proh, sph, spm, total; 
   
    public static void main(String[] args) {
       menu(sexo, trabajo);
    }
    
    public static void menu(int [] sexo, int [] trabajo){
         
         sexo [0] = 1;
         sexo [1] = 2;
         mujer = 0; hombre = 0; ts = 0; tn = 0; nsueldo = 0; sinsueldo = 0; consueldo = 0; ht = 0; mt = 0;
         pht = 0; pmt = 0; prom = 0; proh = 0; 
         trabajo [0] = 1;
         trabajo [1] = 2;
         
        for (int i = 1; i <= 5; i++) {
            System.out.println("Dame tu sexo: 1 o 2");
            nsex = ent.nextInt();
                if (nsex == sexo[1]) {
                    mujer ++;
                }
                if (nsex == sexo [0]) {
                    hombre++;
                }
            System.out.println("Usted trabaja: Si = 1 o No = 2");
            ntraba = ent.nextInt();
                if (ntraba == trabajo [0]) {
                    ts++;
                }
                if (ntraba == trabajo [1]) {
                    tn++;
                }
            System.out.println("Cual es tu sueldo?");
            System.out.println("Ingresa la cantidad de sueldo... si no trabaja ingrese 0");
                nsueldo = ent.nextInt();
                if (nsueldo == 0) {
                    sinsueldo++;
            }else{
                   consueldo++;
                }
            
            if (nsex == sexo [0] && ntraba == trabajo [0]) {
                ht++;
                proh = proh+nsueldo; 
            }
            if (nsex == sexo [1] && ntraba == trabajo [0]) {
                mt++;
                prom = prom+nsueldo;
            }
        total = total + nsueldo;
        }
        pht = (ht*100)/hombre;
        pht = 100 - pht;
        pmt = (mt*100)/mujer;
        pmt = 100 - pmt;
        
        sph = proh / ht;
        spm = prom / mt;
        
        
        System.out.println("-----------------------------------------------");
        System.out.println("El porcentaje de hombres que no trabajan: "+pht+"%");
        System.out.println("El porcentaje de mujeres que no trabajan: "+pmt+"%");
        System.out.println("Sueldo promedio de los hombres: $"+sph);
        System.out.println("Sueldo promedio de las mujeres: $"+spm);
    }
     
}