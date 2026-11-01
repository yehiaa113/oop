/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication67;

/**
 *
 * @author STUDENT
 */
public class Rectangel {
    private double length;
    private double width;
    public void Rectangel(double area){
        width =1;
        length=1;
    }
    public Rectangel(){
        length=width=1;
    }
    public Rectangel(int width,int lenght){
        this.width = width;
        this.length=length;
    }
    public double getArea(){
        return width*length;
    }
     public double getpremiter(){
        return (width+length)*2;
    }
     public double getwidth(){
        return width;
    }
     public double getlength(){
        return length;
    }
    
    
}
