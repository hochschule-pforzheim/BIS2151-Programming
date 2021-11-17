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
public class Student {
    public String name; 
    public int matNr;
    public ArrayList<String> exams; 
    public status state; 
    public int semester;
    
    public enum status {
        immatriculated, 
        exmatriculated, 
        holiday
    }
    
    public Student(String name, int matNr) {
        this.name = name;
        this.matNr = matNr;
        amountOfStudents++;
    }  
    
    public static int amountOfStudents; 
    
    
    public String toString() {
        switch(this.semester) {
            case 1:
                System.out.println("This Student has just started their studies.");
                break; 
            case 7: 
                System.out.println("This Student is almost finished");
                break; 
            default: 
                System.out.println("This Student is in middle of his/her studies.");
        }
        return this.name + " " + this.matNr; 
    }
    
    public ArrayList<String> getExams() {
        return exams; 
    }
    
    public void SetState(status state) {
        this.state = state;
    }
    
    public status GetState() {
        return this.state; 
    }

}
