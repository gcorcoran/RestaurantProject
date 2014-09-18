/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Greg
 */
public class FakeDatabaseStrategy implements DataAccessStrategy{
    
    private List<Map<String, String>> fakedb = new ArrayList();
    
    public FakeDatabaseStrategy(){
        Map temp = new HashMap();
        temp.put("Category", "Appetizers");
        temp.put("name", "Mozzarella Sticks");
        temp.put("description", "Life is better with fried cheese.");
        temp.put("price", "4.99");
        temp.put("ID","0");
        fakedb.add(temp);
        Map temp1 = new HashMap();
        //temp.clear();
        temp1.put("Category", "Appetizers");
        temp1.put("name", "Spicy Ahi Tuna Crisps");
        temp1.put("description", "Start your night out with a kick!");
        temp1.put("price", "5.99");
        temp1.put("ID","1");
        fakedb.add(temp1);
        Map temp2 = new HashMap();
        //temp.clear();
        temp2.put("Category", "Appetizers");
        temp2.put("name", "Veggie Nori Rolls");
        temp2.put("description", "With a side of wasabi sauce for the brave.");
        temp2.put("price", "5.99");
        temp2.put("ID","2");
        fakedb.add(temp2);
        Map temp3 = new HashMap();
        //temp.clear();
        temp3.put("Category", "Drinks");
        temp3.put("name", "Miller High Life");
        temp3.put("description", "The champagne of beers.");
        temp3.put("price", "2.99");
        temp3.put("ID","3");
        fakedb.add(temp3);
        Map temp4 = new HashMap();
        //temp.clear();
        temp4.put("Category", "Drinks");
        temp4.put("name", "Fixed Gear");
        temp4.put("description", "The great beer from Lakefront Brewery.");
        temp4.put("price", "3.99");
        temp4.put("ID","4");
        fakedb.add(temp4);
        Map temp5 = new HashMap();
        //temp.clear();
        temp5.put("Category", "Drinks");
        temp5.put("name", "Asahi Super Dry");
        temp5.put("description", "Japanese rice lager. Easy to drink & easy to enjoy.");
        temp5.put("price", "4.99");
        temp5.put("ID","5");
        fakedb.add(temp5);
        Map temp6 = new HashMap();
        //temp.clear();
        temp6.put("Category", "Drinks");
        temp6.put("name", "Chocolate Martini");
        temp6.put("description", "You should order this. Why? Because it's delicious!");
        temp6.put("price", "7.99");
        temp6.put("ID","6");
        fakedb.add(temp6);
        Map temp7 = new HashMap();
        //temp.clear();
        temp7.put("Category", "Main Courses");
        temp7.put("name", "Black & Blue Burger");
        temp7.put("description", "3/4 pounds of ground beef. Blue cheese. Oh yeah.");
        temp7.put("price", "7.99");
        temp7.put("ID","7");
        fakedb.add(temp7);
        Map temp8 = new HashMap();
        //temp.clear();
        temp8.put("Category", "Main Courses");
        temp8.put("name", "Chicken Alfredo");
        temp8.put("description", "The italian classic.");
        temp8.put("price", "11.99");
        temp8.put("ID","8");
        fakedb.add(temp8);
        Map temp9 = new HashMap();
        //temp.clear();
        temp9.put("Category", "Main Courses");
        temp9.put("name", "Cedar Plank Salmon");
        temp9.put("description", "Our salmon is better than yours. Come at me bro.");
        temp9.put("price", "14.99");
        temp9.put("ID","9");
        fakedb.add(temp9);
        Map temp10 = new HashMap();
        //temp.clear();
        temp10.put("Category", "Main Courses");
        temp10.put("name", "Lobster Mac & Cheese");
        temp10.put("description", "You know what's better than heaven? Lobster Mac & Cheese. You're welcome.");
        temp10.put("price", "15.99");
        temp10.put("ID","10");
        fakedb.add(temp10);
        
    }

    @Override
    public List<Category> getCategories() {
        Item test = new Item(fakedb.get(0).get("name"),fakedb.get(0).get("description"),fakedb.get(0).get("price"),fakedb.get(0).get("ID"));
        Category temp1 = new Category("Appetizers");
        temp1.addItem(test);
        temp1.addItem(new Item(fakedb.get(1).get("name"),fakedb.get(1).get("description"),fakedb.get(1).get("price"),fakedb.get(1).get("ID")));
        temp1.addItem(new Item(fakedb.get(2).get("name"),fakedb.get(2).get("description"),fakedb.get(2).get("price"),fakedb.get(2).get("ID")));
        
        Category temp2 = new Category("Drinks");
        temp2.addItem(new Item(fakedb.get(3).get("name"),fakedb.get(3).get("description"),fakedb.get(3).get("price"),fakedb.get(3).get("ID")));
        temp2.addItem(new Item(fakedb.get(4).get("name"),fakedb.get(4).get("description"),fakedb.get(4).get("price"),fakedb.get(4).get("ID")));
        temp2.addItem(new Item(fakedb.get(5).get("name"),fakedb.get(5).get("description"),fakedb.get(5).get("price"),fakedb.get(5).get("ID")));
        temp2.addItem(new Item(fakedb.get(6).get("name"),fakedb.get(6).get("description"),fakedb.get(6).get("price"),fakedb.get(6).get("ID")));
        
        Category temp3 = new Category("Main Courses");
        temp3.addItem(new Item(fakedb.get(7).get("name"),fakedb.get(7).get("description"),fakedb.get(7).get("price"),fakedb.get(7).get("ID")));
        temp3.addItem(new Item(fakedb.get(8).get("name"),fakedb.get(8).get("description"),fakedb.get(8).get("price"),fakedb.get(8).get("ID")));
        temp3.addItem(new Item(fakedb.get(9).get("name"),fakedb.get(9).get("description"),fakedb.get(9).get("price"),fakedb.get(9).get("ID")));
        temp3.addItem(new Item(fakedb.get(10).get("name"),fakedb.get(10).get("description"),fakedb.get(10).get("price"),fakedb.get(10).get("ID")));
        
        List<Category> categories = new ArrayList();
        categories.add(temp1);
        categories.add(temp2);
        categories.add(temp3);
        
        return categories;
    }
    
    public Item getItemByID(String ID){
        int categoryLocation = 0;
        int itemLocation = 0;
        List<Category> categories = this.getCategories();
        for(int i = 0; i < categories.size();i++){
            for(int j = 0; j < categories.get(i).getItemListLength(); j++){
                List<Item> temp = categories.get(i).getItems();
                String check = temp.get(j).getID();
                if(check.equals(ID)){
                    categoryLocation = i;
                    itemLocation = j;
                }
        }
        
        
        }
        Item item = new Item(categories.get(categoryLocation).getItem(itemLocation));
        return item;
    }

    public static void main(String[] args) {
        FakeDatabaseStrategy db = new FakeDatabaseStrategy();
        db.getCategories();
        
    }
}
