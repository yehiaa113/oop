/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication117;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class sheet3prob8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a  number ");
    int num = s.nextInt();
            int reverse=0;
            while (num>0){
                int digit = num%10;
                reverse = reverse * 10 + digit;
            num=num/10;
            }
                    System.out.println("the reverse is " + reverse);

    }
    
}
