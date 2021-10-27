/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial_2;

import java.util.Date;

/**
 *
 * @author Jonathan Hinkel
 */
public class StudentManager {
    public static void main(String[] args) {
        Student.activateExamRegistration();
        GenerateStudents(); 
    }
    
    public static void GenerateStudents() {
        Student myStudent = new Student(123456, "Jonathan", "Hinkel", 7);
        System.out.println(myStudent.getName());
        myStudent.setSemester(8); 
    }
}
