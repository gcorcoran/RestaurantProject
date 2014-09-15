/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Greg
 */
public class Cart {
    
    private List<Item> selectedItems;
    private double subtotal=0;
    
    public Cart(){
        this.selectedItems=new ArrayList<Item>();
        this.subtotal=0;
    }
    
    public void addToCart(Item item){
        selectedItems.add(item);
        Double temp = 2.0;
        subtotal+=temp;
    }

    public List<Item> getSelectedItems() {
        return selectedItems;
    }

    public void setSelectedItems(List<Item> selectedItems) {
        this.selectedItems = selectedItems;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        String quickPrint="";
        for(int i=0;i<selectedItems.size();i++){
            quickPrint+="<div class=\"itemPrint\">" + selectedItems.get(i).getName()
                     + " " + selectedItems.get(i).getPrice()+ "<br>";
        }
        quickPrint+="Total: " + this.subtotal;
        return quickPrint;
    }
    
    
    
}
