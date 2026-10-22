/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication192;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication192 {

     public static int getint(Scanner S, String prompt){
             System.out.print(prompt);
             int number = S.nextInt();
             return number;
         }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                int age = getint(input , "enter ur age ");
                 System.out.print("recorded age " +age);

    
    
    
    
    
    }
    
}
