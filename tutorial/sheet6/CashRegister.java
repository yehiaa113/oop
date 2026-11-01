/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication66;

/**
 *
 * @author STUDENT
 */
public class CashRegister {
    private int itemCount;
    private double totalPrice;
    public void addItem(double price){
        totalPrice+=price;
        itemCount++;
    }

    public void clear(){
        totalPrice=0;
        itemCount=0;
    }
    
    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    void clear(int itemCount, double totalPrice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
