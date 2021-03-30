/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foobar;

/**
 *
 * @author Jonathan Hinkel
 */
public class FooBar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Student s = new Student(); 
        //s.setName("John"); 
        //System.out.println(s.getName()); 
        //s.registerForExam("BIS2515"); 
        //conversion("adsasd"); 
        
        for(int i = 12; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                System.out.print("*"); 
            }
            System.out.println(); 
        }
        
    }

    public static void conversion(String str) {
        try {
              // the String to int conversion happens here
            int number = Integer.parseInt(str.trim());
              // print out the value after the conversion
            System.out.println("int i = " + number);
        } catch (NumberFormatException nfe) {
            System.out.println("Exception: " + nfe.getMessage());
        }
        catch (NullPointerException nfe) {
           System.out.println("NullPointerException: " + nfe.getMessage());
        }
    }
    
    /**
     * Combines two strings and tries to convert them into integers
     * @param str1 First String
     * @param str2 Second String
     */
    public static void conversion(String str1, String str2) {
        try {
            String combined = str1 + str2;
              // the String to int conversion happens here
            int number = Integer.parseInt(combined.trim());
              // print out the value after the conversion
            System.out.println("int i = " + number);
        } catch (NumberFormatException nfe) {
            System.out.println("Exception: " + nfe.getMessage());
        }
        catch (NullPointerException nfe) {
           System.out.println("NullPointerException: " + nfe.getMessage());
        }
    }
    
    
    public static void SwitchExample(String str) {
        switch(str) {
            case "1": 
               System.out.println("EINS");
               break; 
            case "Cancel": 
               System.out.println("ZWEI");
               System.exit(0);
               break; 
            default: 
                System.out.println("DEFAULT"); 
                break; 
        }
    }
}
