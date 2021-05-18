/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuorial08.logic;

/**
 *
 * @author Jonathan Hinkel
 */
public class Bike {
    
    private static int counter = 0; 
    
    private int bikeID; 
    private String description; 
    private double price; 

    public Bike(String description, double price) {
        this.bikeID = counter; 
        counter++; 
        this.description = description;
        this.price = price;
    }

    public int getBikeID() {
        return bikeID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
