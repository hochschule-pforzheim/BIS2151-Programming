/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial03;

import java.util.ArrayList;
import tutorial02.Student;

/**
 *
 * @author Jascha Pfäfflin
 */
public class Studentenliste {
    
    private static Student[] studentenliste = new Student[20];
    
    private static ArrayList<Student> arrayListStudent = new ArrayList<>();
    
    private static int counter = 0;
    
    
    
    public void addStudent(Student s) {
        studentenliste[counter] = s;
        counter++;
    }
    
    public void addStudentList(Student s) {
        arrayListStudent.add(s);
    }
    
    public void readStudents() {
        for (int i = 0; i < arrayListStudent.size(); i++) {
            System.out.println(arrayListStudent.get(i));
        }
    }
    
    public void deleteStudents(int index) {
        arrayListStudent.remove(index);
    }
    
    public Student getStudent(int index) {
        return arrayListStudent.get(index);
    }
}

