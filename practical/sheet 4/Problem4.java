/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problem.pkg4;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Problem4 {
public static boolean isValidPassword(String password) {

    if (password.length() < 8) {
       System.out.println("<8");

        return false;
    }
    int digits =0;
    int uppercase=0;
    for(int i=0;i<password.length();i++){
        char ch = password.charAt(i);
        if(!Character.isLetterOrDigit(ch)){
            System.out.println("not dig or let");
            return false;
        }
        else{
            if(Character.isDigit(ch)){
                            System.out.println("dig");

                digits++;
            }
            else if (Character.isUpperCase(ch)){
                            System.out.println("let");

                uppercase++;
            }    
        }
    }
    return (digits>=2 && uppercase >=1);
}

    public static void main(String[] args) {
                Scanner S = new Scanner(System.in);
                System.out.println("enter a password");
                String password = S.nextLine();
                if(isValidPassword(password)){
                    System.out.println("vaild password");

                }
                else System.out.println("invaild password");

    }
    
    
}
