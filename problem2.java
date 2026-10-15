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
public class problem2 {
    
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         double TAX_RATE = 0.14;
        double price = input.nextDouble();
        int quantity = input.nextInt();

        double subtotal = price * quantity;
        double tax = subtotal * TAX_RATE;
        double total = subtotal + tax;

        System.out.printf("Subtotal = %.2f%n", subtotal);
        System.out.printf("Tax = %.2f%n", tax);
        System.out.printf("Total = %.2f%n", total);
}
}