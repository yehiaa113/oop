/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oopassignment1;

import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Oopassignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        double radius = input.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;

        System.out.printf("Area = %.2f%n", area);
        System.out.printf("Circumference = %.2f%n", circumference);

    
    
    
    }
    
    
    
    
    
    
    
}
