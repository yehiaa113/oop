/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication55;

import java.util.Scanner;
/**
 *
 * @author STUDENT
 */
public class JavaApplication55 {

    /**
     * @param args the command line arguments
     */
    public static double cylindervolume(double dvalue,double hvalue) {
    double radius=dvalue/2.0;
    return Math.PI*Math.pow(radius,2)*hvalue;
     }
        public static void main(String[] args) {
         System.out.println("the volume = ");
         Scanner s =new Scanner(System.in);
         double dvalue=s.nextDouble();
         double hvalue=s.nextDouble();
         
            System.out.println(cylindervolume(dvalue,hvalue));
 
}
}
