/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package q4;

  import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Q4 {
    public static String maskEmail(String email) {
        email = email.trim();
        int atIndex = email.indexOf('@');
        if (atIndex == -1) {
            return "Invalid Email";
        }

        String username = email.substring(0, atIndex);
        String domain = email.substring(atIndex + 1).toLowerCase();

        if (username.length() <= 2) {
            return username + "@" + domain;
        }

        String firstTwo = username.substring(0, 2);
        String maskedPart = "";
        for(int i=0;i< username.length()-2;i++){
            maskedPart+="*";
        }

        return firstTwo + maskedPart + "@" + domain;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an email address: ");
        String inputEmail = scanner.nextLine();
        String result = maskEmail(inputEmail);
        System.out.println("Output: " + result);
        
    }
}

