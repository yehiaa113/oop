/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication193;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication193 {

     public static double calculateDistance(double x1,double y1,double x2,double y2){
         return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
     }
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {               
        Scanner S = new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1 = S.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = S.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = S.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = S.nextDouble();
        double distance=calculateDistance(x1,y1,x2,y2);
        System.out.print("Distance: %.2f "+distance);
    }
    
}
