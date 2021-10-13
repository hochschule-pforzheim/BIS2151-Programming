/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial03;

/**
 *
 * @author mail
 */
public class Student
{
    private String name; 
    private String surname;
    private int mtrNr; 
       
    /**
     * Creates a new Student object and sets the fields
     * @param name The name of the new student 
     * @param surname The surname of the new student 
     * @param mtrNr The mtrNR of the new student 
     */
    public Student(String name, String surname, int mtrNr) {
        this.name = name; //this sets the new name for the student
        this.surname = surname; //this sets sets 
        this.mtrNr = mtrNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String sirname) {
        this.surname = sirname;
    }

    public int getMtrNr() {
        return mtrNr;
    }

    public void setMtrNr(int mtrNr) {
        this.mtrNr = mtrNr;
    }
    
    /**
     * Registers the student for an exam 
     * @param examName The name of the exam
     */
    public void registerForExam(String examName) {
        System.out.println("The student " + name + " " + surname + " has registered for " + examName);
    }
    
    public static void showFields() {
        System.out.println("Students have a name, a surename and a immatrikulation number.");
    }
}
