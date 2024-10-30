package unit05;

/**
 * Represents a student with basic personal details such as surname, 
 * prename (first name), and a unique student ID.
 * 
 * This class provides methods to retrieve and modify the student's 
 * name and ID information.
 * 
 * @author Andreas R. Schneider
 * 
 * @date 30 October 2024
 */
public class Student {

    // Fields / Attributes
    private String surname; // Student's surname (last name)
    private String prename; // Student's prename (first name)
    private int studentID;  // Unique identifier for the student

    /**
     * Constructs a new Student with the specified surname, prename, and student ID.
     * 
     * @param surname the student's surname (last name)
     * @param prename the student's prename (first name)
     * @param studentID the unique ID assigned to the student
     */
    public Student(String surname, String prename, int studentID) {
        this.surname = surname;
        this.prename = prename;
        this.studentID = studentID;
    }

    /**
     * Retrieves the student's surname.
     * 
     * @return the student's surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Retrieves the student's prename.
     * 
     * @return the student's prename
     */
    public String getPrename() {
        return prename;
    }

    /**
     * Updates the student's prename.
     * 
     * @param prename the new prename for the student
     */
    public void setPrename(String prename) {
        this.prename = prename;
    }

    /**
     * Retrieves the student's unique ID.
     * 
     * @return the student's student ID
     */
    public int getStudentID() {
        return studentID;
    }

    /**
     * Updates the student's ID. This should only be used if there is a need 
     * to correct or assign a new ID.
     * 
     * @param studentID the new student ID
     */
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

}