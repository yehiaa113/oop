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
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a month number ");
int month =s.nextInt();
switch(month)
{
    case 12:
        case 1:
    case 2:
System.out.println("winter ");
    break;
     case 3:
        case 4:
    case 5:
System.out.println("spring ");
    break;
     case 6:
        case 7:
    case 8:
System.out.println("summer ");
    break;
     case 9:
     case 10:
    case 11:
System.out.println("fall ");
    break;
    
    
    
    
     
    }
    
}
}