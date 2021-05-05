/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial05;

import java.util.ArrayList;


/**
 *
 * @author Jonathan Hinkel
 */
public class Examples {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("String 1"); //index 0
        list.add("String 2"); //index 1
        list.add("String 3"); //index 2
        list.add("String 4"); //index 3
        list.add("String 5"); //index 4
        
        System.out.println(list);
        
        for(String element : list) {
            System.out.println(element); 
        }
        
        System.out.println("--------------------------------");
        
        list.remove(1);
        System.out.println(list);
        
        System.out.println("--------------------------------");
        
        for(int i = 0; i < list.size(); i++) {
            if(i == 1) list.remove(i);
            System.out.println(list.get(i));
        }
        
        
        System.out.println("--------------------------------");

        switch(getUserInput()) {
            case "Continue": 
                System.out.println("The programm will continue.");
                break; 
            case "Cancel": 
                System.out.println("The programm will be closed."); 
                break;
            default: 
                System.out.println("Ok");
        }       
    }
    
    
    /**
     * Gets input from the user
     * @return USers input 
     */
    public static String getUserInput() {
        return "Cancel";
    }

}
