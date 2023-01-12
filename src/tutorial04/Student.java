/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial04;

import java.io.Serializable;

/**
 *
 * @author jasch
 */
public class Student implements Serializable {

    private StudentManager theStudentManager = StudentManager.getInstance();
    private int id;
    private String firstName;
    private String lastName;
    private static final long serialVersionUID = 10l;

    public Student(String firstName, String lastName) {
        if (theStudentManager.getStudents().isEmpty()) {
            this.id = 1;
        } else {
            this.id = theStudentManager.getStudents().get(theStudentManager.getStudents().size() - 1).getId() + 1;
        }
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + '}';
    }

}
