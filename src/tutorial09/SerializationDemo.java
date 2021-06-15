/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial09;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Jonathan Hinkel
 */
public class SerializationDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String [] args) {
        serializeBike(new Bike(1,"Mein Bike", new Price()));
        Bike myBike = deserializeBike("bike.ser"); 
        System.out.println(myBike.getDesc());
        ArrayList<Bike> myBikes = new ArrayList<Bike>(); 
        myBikes.add(new Bike(1, "2", new Price())); 
        myBikes.add(new Bike(2, "2", new Price())); 
        myBikes.add(new Bike(3, "2", new Price())); 
        serializeBikes(myBikes);
        myBikes = deserializeBikes("bikes.ser"); 
        System.out.println(myBikes.get(0).getId());
        System.out.println(myBikes.get(1).getId());
        System.out.println(myBikes.get(2).getId());
    }
    
    private static void serializeBike(Bike bike) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("bike.ser")); 
            out.writeObject(bike); 
        }
        catch(IOException exception) {
            System.out.println("There was an error during the serialization.");
            System.out.println(exception);
        }
    }
    
    private static void serializeBikes(ArrayList<Bike> bikes) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("bikes.ser")); 
            out.writeObject(bikes); 
        }
        catch(IOException exception) {
            System.out.println("There was an error during the serialization.");
            System.out.println(exception);
        }
    }
    
    private static Bike deserializeBike(String fileName) {
        Bike bike = null; 
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
            bike = (Bike) in.readObject();
        }
        catch(IOException | ClassNotFoundException exception) {
            System.out.println("There was an error during the deserialization.");
            System.out.println(exception);
        }
        return bike; 
    }
    
    private static ArrayList<Bike> deserializeBikes(String fileName) {
        ArrayList<Bike> bikes = null; 
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
            bikes = (ArrayList<Bike>) in.readObject();
        }
        catch(IOException | ClassNotFoundException exception) {
            System.out.println("There was an error during the deserialization.");
            System.out.println(exception);
        }
        return bikes; 
    }

    
}
