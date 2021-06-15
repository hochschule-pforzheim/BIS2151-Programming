/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial09;

import java.io.Serializable;

/**
 *
 * @author Jonathan Hinkel
 */
public class Bike implements Serializable{
    private int id; 
    private String desc; 
    private Price price; 
    
    public Bike(int id, String desc, Price price) {
        this.id = id;
        this.desc = desc;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }
}
