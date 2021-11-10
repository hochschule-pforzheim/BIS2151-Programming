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
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        
        list.add(new Student("Jonathan Hinkel", 319123));
        list.add(new Student("John Grammaticus", 8721387));
        Student newStudent = new Student("Max Mustermann", 123123); 
        list.add(newStudent);
        String nameToRemove = "Jonathan Hinkel";
        
        Student toRemove = null; 
        for(Student s : list) {
            if(s.name.equals(nameToRemove)) toRemove = s; 
        }
        list.remove(toRemove); 
        
        
        
        for(Student student : list) {
            System.out.println(student);
        }
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
    }
}
