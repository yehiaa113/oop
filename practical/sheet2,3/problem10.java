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
public class problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner s = new Scanner(System.in);
        System.out.println("enter a month number ");
    
    char ch=s.next().charAt(0);
    if(ch>='0'&&ch<='9'){
    System.out.println( " digit " );
}
    else if(ch>='a'&&ch<='z'){
    System.out.println( " letter " );
}
    else 
        System.out.println( " other " );

}
}
