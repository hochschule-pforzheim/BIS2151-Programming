/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SettingsExample;

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
public class Serialization {
    public static void SaveList(Settings settings) {
        try {
            new ObjectOutputStream(new FileOutputStream("settings.ser")).writeObject(settings); 
        } catch (IOException ex) {
            System.out.println("Something went wrong during the serialization.");
            System.out.println(ex);
        }
        
    }
    
    public static Settings LoadList() {
        try {
            Settings settings = (Settings) new ObjectInputStream(new FileInputStream("settings.ser")).readObject(); 
            return settings; 
        } catch (Exception ex) {
            System.out.println("Something went wrong during the deserialization.");
            System.out.println(ex);
            return null;
        }
    }
}
