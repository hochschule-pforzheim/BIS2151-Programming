/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial_5;

import java.util.ArrayList;

/**
 *
 * @author Jonathan Hinkel
 */
public class StudentManager {
    //singleton
    private static StudentManager instance = null;
    
    public static StudentManager getInstance() {
        if(instance == null) {
            StudentManager newInstance = new StudentManager();
            instance = newInstance; 
            return newInstance;
        } else {
            return instance; 
        }
    }
    
    private StudentManager() {};
    
    public ArrayList<Student> list  = new ArrayList<Student>(); 
}
