/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial05;

/**
 *
 * @author Jascha Pfäfflin
 */
public class Student {

    private int studentID;
    private String name;
    private int semester;
    private static int counter = 0;

    public Student(String name, int semester) {
        this.studentID = ++counter;
        this.name = name;
        this.semester = semester;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
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

    @Override
    public String toString() {
        return "Student{" + "studentID=" + studentID + ", name=" + name + ", semester=" + semester + '}';
    }

    
}
