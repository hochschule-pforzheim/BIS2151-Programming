package unit07;

/**
 * The PforzheimStudent class extends the Student class, representing a specific
 * type of student from Pforzheim. This class demonstrates method overloading
 * and overriding.
 *
 * @author Andreas R. Schneider
 */
public class PforzheimStudent extends Student
{

    /**
     * Overrides the study method from the superclass Student. This method takes
     * an integer parameter representing hours.
     *
     * @param hours The number of hours the student will study.
     */
    @Override
    public void study(int hours)
    {
        System.out.println("Pforzheim Student studies longer for "
                + hours
                + " hours!");
    }

    /**
     * Overloaded version of the study method that accepts a double parameter.
     * This allows for more precise study times, in hours with decimals.
     *
     * @param hours The number of hours (with decimal precision) the student
     * will study.
     */
    public void study(double hours)
    {
        System.out.println("Pforzheim Student studies longer for "
                + hours
                + " hours!");
    }

    /**
     * Another version of the study method with no parameters. This version
     * simply returns true, indicating that the student has studied.
     *
     * @return true, representing that the student has completed some studying.
     */
    public boolean study()
    {
        return true;
    }

    /**
     * Constructor for the PforzheimStudent class. This constructor initializes
     * the PforzheimStudent instance and accepts a student ID.
     *
     * @param studentID The ID number of the student. Imagine this is validated,
     * e.g., only IDs above 300000 are accepted.
     */
    public PforzheimStudent(int studentID)
    {
        super();  // Calls the constructor of the superclass (Student) to initialise the base properties.
        // Additional logic for student ID validation could go here (e.g., check if ID is above 300000)
    }

}
