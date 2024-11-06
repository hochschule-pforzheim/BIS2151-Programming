package unit06;

/**
 * The {@code Student} class represents a student with attributes for surname, prename, and student ID.
 * This class provides methods to access and modify these attributes.
 * 
 * <p>Each student has a surname (last name) and prename (first name). The student ID is a unique 
 * identifier for each student. This class includes a constructor for creating a student with or 
 * without a specified student ID.</p>
 * 
 * @author Andreas R. Schneider
 */
public class Student {
    String surname, prename;
    int studentID;

    /**
     * Constructs a {@code Student} object with the specified surname, prename, and student ID.
     * 
     * @param surname the last name of the student
     * @param prename the first name of the student
     * @param studentID the unique identifier for the student
     */
    public Student(String surname, String prename, int studentID) {
        this.surname = surname;
        this.prename = prename;
        this.studentID = studentID;
    }

    /**
     * Constructs a {@code Student} object with the specified surname and prename.
     * The student ID is not specified.
     * 
     * @param surname the last name of the student
     * @param prename the first name of the student
     */
    public Student(String surname, String prename) {
        this.surname = surname;
        this.prename = prename;
    }

    /**
     * Returns the surname of the student.
     * 
     * @return the surname of the student
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the surname of the student.
     * 
     * @param surname the last name to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Returns the prename of the student.
     * 
     * @return the prename of the student
     */
    public String getPrename() {
        return prename;
    }

    /**
     * Sets the prename of the student.
     * 
     * @param prename the first name to set
     */
    public void setPrename(String prename) {
        this.prename = prename;
    }

    /**
     * Returns the student ID.
     * 
     * @return the student ID
     */
    public int getStudentID() {
        return studentID;
    }

    /**
     * Sets the student ID.
     * 
     * @param studentID the unique identifier to set
     */
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
}