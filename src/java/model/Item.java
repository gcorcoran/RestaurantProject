/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Greg
 */
public class Item {
    
    private String name;
    private String description;
    private String price;
    private String ID;

    public Item(String name, String description, String price, String ID){
        this.name = name;
        this.description = description;
        this.price = price;
        this.ID = ID;
    }

    Item() {
    }
    
    Item(Item item){
        this.name = item.name;
        this.description = item.description;
        this.price = item.price;
        this.ID = item.ID;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    
    
    @Override
    public String toString() {
        return name + ", description=" + description + ", price=" + price + '}';
    }
    
    
    
}
