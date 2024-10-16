package unit02;

/**
 * This is the Student class, which holds information about students such as
 * their student ID, name, date of birth, and current semester. Possible
 * solution for the constructor task
 *
 * @author Andreas Schneider
 */
public class Student
{

    // Private field for student ID (matriculation number)
    private int studentID;

    // Public fields for the student's surname, prename (first name), and date of birth
    public String surname;
    public String prename;
    public String dateOfBirth;

    // Private field for the current semester the student is in
    private int actualSemester;

    // Public field for the student's state, which could represent their enrolment status
    public char state;

    // Getter method for studentID (allows other classes to access this private field)
    public int getStudentID()
    {
        return studentID;
    }

    // Setter method for studentID (allows other classes to set this private field)
    public void setStudentID(int studentID)
    {
        this.studentID = studentID;
    }

    // Getter method for actualSemester (returns the current semester of the student)
    public int getActualSemester()
    {
        return actualSemester;
    }

    // Setter method for actualSemester (sets the student's current semester)
    public void setActualSemester(int actualSemester)
    {
        this.actualSemester = actualSemester;
    }

    // Default constructor (no parameters). This is called when we create a Student
    // object without providing any initial values.
    public Student()
    {
        // This is the default constructor.
    }

    // Constructor that initializes a Student with a surname and prename
    public Student(String surname, String prename)
    {
        this.surname = surname;     // Assigning the surname parameter to the field
        this.prename = prename;     // Assigning the prename parameter to the field
    }

    // Constructor that initializes a Student with a studentID, surname, and prename
    public Student(int studentID, String surname, String prename)
    {
        this.studentID = studentID; // Assigning the studentID parameter to the field
        this.surname = surname;     // Assigning the surname parameter to the field
        this.prename = prename;     // Assigning the prename parameter to the field
    }
}
