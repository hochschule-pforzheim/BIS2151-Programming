/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial_2;

/**
 *
 * @author Jonathan Hinkel
 */
public class Student {
    private int matriculationNr; 
    private String name; 
    private String firstName; 
    private int semester; 
    
    public static int numberOfStudents; 
    public static void activateExamRegistration() {
        System.out.println("Students can now register for exams"); 
    }
            
         
    public Student(int matriculationNr, String name, String firstName, int semester) {
        this.matriculationNr = matriculationNr;
        this.name = name;
        this.firstName = firstName;
        this.semester = semester;
    }

    public int getMatriculationNr() {
        return matriculationNr;
    }

    public void setMatriculationNr(int matriculationNr) {
        this.matriculationNr = matriculationNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
    
    public static void registerForExam(int exam, String name) {
        System.out.println("The student is now registered for exam: " + exam);
        StudentManager.GenerateStudents();
    }
}
