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
        if (instance == null) {
            StudentManager newInstance = new StudentManager();
            instance = newInstance;
            return newInstance;
        } else {
            return instance;
        }
    }

    private StudentManager() {
    }
    ;
    
    public ArrayList<Student> list = new ArrayList<Student>();

    public ArrayList<Student> getList() {
        return list;
    }

    public void generateStudents() {
        Student s1 = new Student("Jascha", 323460);
        Student s2 = new Student("Jonatahn", 321241);
        Student s3 = new Student("Max", 325923);

        // Set the Semester, because it is not mentioned in the Constructor
        s1.setSemester(3);
        s2.setSemester(7);
        s3.setSemester(5);

        list.add(s1);
        list.add(s2);
        list.add(s3);
    }
}
