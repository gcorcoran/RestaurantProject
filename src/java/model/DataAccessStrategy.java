/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.List;

/**
 *
 * @author Greg
 */
public interface DataAccessStrategy {
    
    public List<Category> getCategories();
    
    public Item getItemByID(String ID);
}
