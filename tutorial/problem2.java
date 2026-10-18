/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication56;

import java.util.Scanner;

/**
 *
 * @author STUDENT
 */
public class JavaApplication56 {

     public static String extractDomain(String email){
        email=email.trim();
         int at = email.indexOf('@');
         if(at==-1){
             return"invaild email";
         }
         return email.substring(at + 1).toLowerCase();
     }

    public static void main(String[] args) {
         Scanner s =new Scanner(System.in);
         System.out.println("enter your email ");
         String email = s.next();
         String domain = extractDomain(email);
                  System.out.println("Domain "+domain);

         
    }
    
}

