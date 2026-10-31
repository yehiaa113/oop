/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package q2;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Q2 {

    public static double coneVolume(double dValue, double hValue) {
        double radius = dValue / 2.0;
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * hValue;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter diameter: ");
        double diameter = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        double volume = coneVolume(diameter, height);
        System.out.printf("Volume: %.2f\n", volume);
        
    }
}

    

