/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial03;

import tutorial02.Student;

/**
 *
 * @author Jascha Pfäfflin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s = new Student("Jascha", "Pfäfflin", "BWMI");
        Student s2 = new Student("Linus", "Rode", "BDEM");
        Student s3 = new Student("Sandra", "Nguyen", "BDEM");
        
        Studentenliste liste = new Studentenliste();
        
        liste.addStudentList(s);
        liste.addStudentList(s2);
        liste.addStudentList(s3);
        
        liste.readStudents();
        
        liste.deleteStudents(2);
        
        liste.readStudents();
        
        Student student = liste.getStudent(0);
        
        s.setVorname("Jonathan");
        
        liste.readStudents();
    }

}
