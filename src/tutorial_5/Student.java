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
    
    
    public Student(String name, int matNr) {
        this.name = name;
        this.matNr = matNr;
    }
    
    public String toString() {
        return this.name + " " + this.matNr; 
    }
    
    public ArrayList<String> getExams() {
        return exams; 
    }
}
