/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package items;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Amer Osama
 */
     public class Items {
     private int id;
     private String name,menu;
     private Float cost;
   
    
     
      
     public Items(int id  ,String name,String menu,Float cost)
    {
    this.id=id;
    this.name=name;
    this.menu=menu;
    this.cost=cost;
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the quantity
     */
    public Float getCost() {
        return cost;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the menu
     */
    public String getMenu() {
        return menu;
    }

     }