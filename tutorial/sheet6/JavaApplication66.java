/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication66;

import java.util.Scanner;

public class JavaApplication66 {

   
    public static void main(String[] args) {
            Scanner S = new Scanner(System.in); 

        CashRegister c = new CashRegister();
                System.out.println("item 1 ");
        double item1=S.nextDouble();
        c.addItem(item1);
                System.out.println("item 21 ");
        double item2=S.nextDouble();
        c.addItem(item2);
      
        System.out.println(c.getItemCount()+" "+c.getTotalPrice());
        c.clear();
        System.out.println(c.getItemCount()+" "+c.getTotalPrice());
    }
    
}
