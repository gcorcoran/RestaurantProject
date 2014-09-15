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
public class DataAccessService {
    
    DataAccessStrategy DataSource;
    
    public DataAccessService(){
        this.DataSource = new FakeDatabaseStrategy();
    }
    
    public List<Category> getCategories(){
        return this.DataSource.getCategories();
    }

    public DataAccessStrategy getDataSource() {
        return DataSource;
    }

    public void setDataSource(DataAccessStrategy DataSource) {
        this.DataSource = DataSource;
    }
    
    
}
