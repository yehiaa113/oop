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
public class problem3 {
        public static void main(String[] args) {
Scanner input = new Scanner(System.in);

        int score1 = input.nextInt();
        int score2 = input.nextInt();
        int score3 = input.nextInt();

        double average = (score1 + score2 + score3) / 3.0;

        System.out.println(Math.round(average));
        System.out.printf("%.2f%n", average);
        }
}
