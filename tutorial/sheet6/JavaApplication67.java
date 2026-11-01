/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication67;

import java.util.Scanner;

public class JavaApplication67 {

    public static void main(String[] args) {
        Rectangel r1 = new Rectangel();
         System.out.println("result of the firist opject ");
         System.out.println("the length " + r1.getlength());
         System.out.println("the width " + r1.getwidth());
         System.out.println("the perimter " + r1.getpremiter());
         System.out.println("the area " + r1.getArea());

                 Rectangel r2 = new Rectangel(10,5);
          System.out.println("result of the firist opject ");
         System.out.println("the length " + r2.getlength());
         System.out.println("the width " + r2.getwidth());
         System.out.println("the perimter " + r2.getpremiter());
         System.out.println("the area " + r2.getArea());

        
    }
    
}
