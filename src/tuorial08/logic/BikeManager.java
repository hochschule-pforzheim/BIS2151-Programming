/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuorial08.logic;

import java.util.ArrayList;

/**
 *
 * @author Jonathan Hinkel
 */
public class BikeManager {
    
    private final static ArrayList<Bike> BIKES = new ArrayList<Bike>(); 
    
    public static ArrayList<Bike> getBikes() {
        return BIKES; 
    }
    
    public static void addBike(Bike bike) {
        BIKES.add(bike); 
    }
    
    public static void deleteBike(int id) {
        Bike bike = getBike(id);
        if(bike != null) BIKES.remove(bike); 
        else System.out.println("Can't remove nonexistant bike!");
    }
    
    public static Bike getBike(int id) {
        for(Bike bike: BIKES) {
            if(bike.getBikeID() == id) return bike; 
        }
        System.out.println("No bike found!");
        return null; 
    }
    
    public static void updateBike(int id, String desc, double price) {
        Bike bike = getBike(id);
        if(bike != null) {
            int index = BIKES.indexOf(bike); 
            BIKES.get(index).setDescription(desc); 
            BIKES.get(index).setPrice(price);
        }
    }
    
}
