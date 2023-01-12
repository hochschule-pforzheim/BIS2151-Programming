/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jasch
 */
public class StudentManager implements Serializable {
    
    private static StudentManager theStudentManager;
    private static ArrayList<Student> students = new ArrayList<>();
    private static final long serialVersionUID = 11l;
    
    private StudentManager() {
        
    }
    
    public static StudentManager getInstance() {
        if (theStudentManager == null) {
            theStudentManager = new StudentManager();
        }
        return theStudentManager;
    }
    
    public void saveList() {
        try {
            new ObjectOutputStream(new FileOutputStream("students.data")).writeObject(students);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, "The file wasn't found!", ex);
        } catch (IOException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, "Input/Output Error!", ex);
        }
    }
    
    public void readList() {
        try {
            students = (ArrayList<Student>) new ObjectInputStream(new FileInputStream("students25.data")).readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, "The file wasn't found!", ex);
        } catch (IOException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, "Input/Output Error!", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, "The Class wasn't found!", ex);
        }
    }
    
    public void addStudent(Student s) {
        students.add(s);
    }
    
    public void printList() {
        for(Student s : students) {
            System.out.println(s);
        }
    }

    public static ArrayList<Student> getStudents() {
        return students;
    }
    
    
}
