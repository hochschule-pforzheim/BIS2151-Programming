package unit09.lecture;

/**
 * A KarlsruheStudent class that extends the Student class. This class
 * represents a specific type of student in Karlsruhe with customised behaviour
 * for registering exams and visiting KIT (Karlsruhe Institute of Technology).
 *
 * <p>
 * This is an example of inheritance where KarlsruheStudent is a subclass of the
 * base class Student.
 * </p>
 *
 * @author Andreas R. Schneider
 */
public class KarlsruheStudent extends Student
{

    /**
     * Constructor for creating a KarlsruheStudent object.
     *
     * @param surname The surname of the student.
     * @param name The first name of the student.
     * @param studentID The unique student ID.
     */
    public KarlsruheStudent(String surname, String name, int studentID)
    {
        // Calls the constructor of the superclass (Student) to initialise the common properties.
        super(surname, name, studentID);
    }

    /**
     * Overrides the registerExam method from the Student class. This method
     * simulates the process of registering an exam specifically for Karlsruhe
     * students.
     */
    @Override
    public void registerExam()
    {
        System.out.println("Registering Karlsruhe exam...");
    }

    /**
     * Simulates a visit to the Karlsruhe Institute of Technology (KIT). This
     * method is unique to KarlsruheStudent and not part of the Student
     * superclass.
     */
    public void visitKIT()
    {
        System.out.println("Visiting the KIT in Karlsruhe.");
    }
}
