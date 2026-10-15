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
public class problem4 {
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

        int days = input.nextInt();

        int weeks = days / 7;
        int remainingDays = days % 7;

        System.out.println(weeks + " weeks and " + remainingDays + " days"); 
    
   }   
}
