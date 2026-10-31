/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment.pkg4.oop;

import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Assignment4OOP {
    
    public static double getDouble(Scanner s, String prompt) {
        System.out.print(prompt);
        return s.nextDouble();
    }
    public static double celsiusToFahrenheit(double c) {
        return c * 9.0 / 5.0 + 32;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = getDouble(scanner, "Enter temperature in Celsius: ");
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.printf("Fahrenheit: %.2f\n", fahrenheit);
        
    }
}

    