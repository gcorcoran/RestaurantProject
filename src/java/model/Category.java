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
public class Category {
    
    private String name;
    //private String description;
    private List<Item> items;

    public Category(){
    }
    
    public Category(String name){
        this.items = new ArrayList();
        this.name=name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getItems() {
        return items;
    }
    
    public void addItem(Item item){
        
        items.add(item);
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
    
    
    
}
