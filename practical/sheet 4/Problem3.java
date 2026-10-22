/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problem.pkg3;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Problem3 {

    public static double computeArea(double radius) {
       return Math.PI * radius * radius;
  }
     public static double computeArea(double length, double width) {
return length * width;
}
  public static double computeArea(double base, double height, boolean isTriangle) {
      return 0.5 * base * height;
  }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Circle area = " + computeArea(5.0));
       System.out.println("Rectangle area = " + computeArea(4.0, 6.0));
       System.out.println("Triangle area = " + computeArea(4.0, 6.0, true ));
       
      
    }
    
}
