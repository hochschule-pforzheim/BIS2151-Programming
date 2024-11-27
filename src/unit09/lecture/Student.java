package unit09.lecture;

/**
 * The Student class is an abstract representation of a student. It provides
 * common properties and methods for all types of students, as well as an
 * abstract method for specific behaviour that must be implemented by
 * subclasses.
 *
 * <p>
 * This class demonstrates the use of abstraction in Java, where the
 * `registerExam` method is declared abstract to ensure that subclasses provide
 * their own specific implementation.
 * </p>
 *
 * @author Andreas R. Schneider
 */
public abstract class Student
{

    String surname;
    String name;
    int studentID;

    /**
     * Constructor for creating a Student object. This constructor is used by
     * subclasses to initialise the common properties of a student.
     *
     * @param surname The surname of the student.
     * @param name The first name of the student.
     * @param studentID The unique student ID.
     */
    public Student(String surname, String name, int studentID)
    {
        this.surname = surname;
        this.name = name;
        this.studentID = studentID;
    }

    /**
     * Retrieves the surname of the student.
     *
     * @return The surname of the student.
     */
    public String getSurname()
    {
        return surname;
    }

    /**
     * Updates the surname of the student.
     *
     * @param surname The new surname of the student.
     */
    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    /**
     * Retrieves the first name of the student.
     *
     * @return The first name of the student.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Updates the first name of the student.
     *
     * @param name The new first name of the student.
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Retrieves the unique student ID.
     *
     * @return The student ID.
     */
    public int getStudentID()
    {
        return studentID;
    }

    /**
     * Returns a string representation of the student object. This includes the
     * student's surname, first name, and ID.
     *
     * @return A string representing the student.
     */
    @Override
    public String toString()
    {
        return "Student{" + "surname=" + surname + ", name=" + name + ", studentID=" + studentID + '}';
    }

    /**
     * Simulates the process of studying for a generic student. Subclasses can
     * override this method to provide specific behaviour if needed.
     */
    public void study()
    {
        System.out.println("This is a normal student studying...");
    }

    /**
     * Abstract method for registering an exam. Subclasses are required to
     * implement this method to define specific exam registration behaviour.
     */
    public abstract void registerExam();
}
