package unit09.lecture;

/**
 * The PforzheimStudent class represents a specific type of student at Pforzheim
 * University who is part of the student committee.
 *
 * <p>
 * This class extends the Student class and implements the StudentComitee
 * interface, showcasing inheritance and interface implementation in Java.
 * </p>
 *
 * @author Andreas R. Schneider
 */
public class PforzheimStudent extends Student implements StudentComitee
{

    /**
     * Constructor for creating a PforzheimStudent object.
     *
     * @param surname The surname of the student.
     * @param name The first name of the student.
     * @param studentID The unique student ID.
     */
    public PforzheimStudent(String surname, String name, int studentID)
    {
        // Calls the constructor of the superclass (Student) to initialise the common properties.
        super(surname, name, studentID);
    }

    /**
     * Overrides the study method from the Student class. This method simulates
     * the studying behaviour of a Pforzheim student.
     */
    @Override
    public void study()
    {
        System.out.println("This is a Pforzheim student studying...");
    }

    /**
     * Overrides the registerExam method from the Student class. This method
     * simulates the process of registering for a specific exam (BIS3071
     * Programming).
     */
    @Override
    public void registerExam()
    {
        System.out.println("Registering BIS3071 Programming...");
    }

    /**
     * Implements the holdElection method from the StudentComitee interface.
     * This method simulates the process of holding an election at Pforzheim
     * University.
     */
    @Override
    public void holdElectection()
    {
        System.out.println("Holding an election at Pforzheim University.");
    }

    /**
     * Implements the organiseMeeting method from the StudentComitee interface.
     * This method simulates the process of organising a meeting for the student
     * committee.
     */
    @Override
    public void organiseMeeting()
    {
        System.out.println("The student comitee is organising a meeting.");
    }
}
