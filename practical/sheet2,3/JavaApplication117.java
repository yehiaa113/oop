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
public class JavaApplication117 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("enter a integer number");
int n =s.nextInt();
if(n%3==0&&n%5==0){
    System.out.println("Divisible by 3 and 5" );
}
else if(n%3==0){
    System.out.println("Divisible by 3 " );
}
else if(n%5==0){
    System.out.println("Divisible 5" );
}
else if(n%5!=0&&n%3!=0){
    System.out.println("Divisible 5" );


}
    }
}
    

