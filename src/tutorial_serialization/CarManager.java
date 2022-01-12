/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial_serialization;

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
public class CarManager {
    public static ArrayList<Cars> list = new ArrayList<Cars>();
    
    public static void SaveList() {
        try {
            new ObjectOutputStream(new FileOutputStream("Cars.ser")).writeObject(list); 
        } catch (IOException ex) {
            System.out.println("Something went wrong during the serialization.");
            System.out.println(ex);
        }
        
    }
    
    public static void LoadList() {
        try {
            list = (ArrayList<Cars>) new ObjectInputStream(new FileInputStream("Cars.ser")).readObject(); 
        } catch (Exception ex) {
            System.out.println("Something went wrong during the deserialization.");
            System.out.println(ex);
        }
    }
}
