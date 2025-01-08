package serialization;

import java.io.Serializable;

/**
 * The `Student` class represents a student with a surname, prename, and student
 * ID. It implements the `Serializable` interface, which allows objects of this
 * class to be serialised and deserialised. Serialisation is necessary to save
 * or transmit objects as a stream of bytes, and it requires that all objects in
 * the class hierarchy also implement the `Serializable` interface.
 *
 * <p>
 * This class provides getter and setter methods for its fields and overrides
 * the `toString` method to provide a readable string representation of the
 * object.</p>
 *
 * @author Andreas R. Schneider
 */
public class Student implements Serializable
{

    // Private fields to store student data
    private String surname, prename; // The surname and prename (first name) of the student
    private int studentID;           // The unique ID of the student

    /**
     * Parameterised constructor to create a new `Student` object with specific
     * attributes.
     *
     * @param surname The surname (last name) of the student.
     * @param prename The prename (first name) of the student.
     * @param studentID The unique ID of the student.
     */
    public Student(String surname, String prename, int studentID)
    {
        this.surname = surname;
        this.prename = prename;
        this.studentID = studentID;
    }

    /**
     * Default constructor to create a `Student` object with no initial values.
     * Useful when you want to create an object and set its attributes later.
     */
    public Student()
    {
    }

    /**
     * Gets the surname of the student.
     *
     * @return The surname (last name) of the student.
     */
    public String getSurname()
    {
        return surname;
    }

    /**
     * Sets the surname of the student.
     *
     * @param surname The new surname (last name) to set.
     */
    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    /**
     * Gets the prename of the student.
     *
     * @return The prename (first name) of the student.
     */
    public String getPrename()
    {
        return prename;
    }

    /**
     * Sets the prename of the student.
     *
     * @param prename The new prename (first name) to set.
     */
    public void setPrename(String prename)
    {
        this.prename = prename;
    }

    /**
     * Gets the unique student ID.
     *
     * @return The student ID as an integer.
     */
    public int getStudentID()
    {
        return studentID;
    }

    /**
     * Provides a string representation of the `Student` object. This is useful
     * for printing the details of the student in a readable format.
     *
     * @return A string containing the surname, prename, and student ID of the
     * student.
     */
    @Override
    public String toString()
    {
        return "Student{"
                + "surname=" + surname
                + ", prename=" + prename
                + ", studentID=" + studentID
                + '}';
    }
}
