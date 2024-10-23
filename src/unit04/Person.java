package unit04;

/**
 * The {@code Person} class represents a basic model of a person with a first
 * name (prename) and a last name (surname). This class includes constructors,
 * getters, and setters for these attributes.
 *
 * This is part of the lecture's example to demonstrate object creation,
 * encapsulation, and the use of getter and setter methods in Java.
 *
 * @date 23 October 2024
 * 
 * @author Andreas R. Schneider
 * 
 */
public class Person
{

    /**
     * The first name (prename) of the person.
     */
    public String prename;

    /**
     * The last name (surname) of the person.
     */
    public String surname;

    /**
     * Default constructor: This constructor creates a {@code Person} object
     * without setting any attributes.
     * <p>
     * It allows the creation of an empty person object, with the attributes set
     * to {@code null} by default.
     * </p>
     */
    public Person()
    {
        // This is the default constructor, which doesn't initialise the prename or surname
    }

    /**
     * Parameterised constructor: This constructor creates a {@code Person}
     * object with the specified first name and last name.
     *
     * @param prename the first name of the person
     * @param surname the last name of the person
     */
    public Person(String prename, String surname)
    {
        // Assigns the passed parameters to the object's fields
        this.prename = prename;
        this.surname = surname;
    }

    /**
     * Returns the first name (prename) of the person.
     *
     * @return the prename of the person
     */
    public String getPrename()
    {
        return prename;
    }

    /**
     * Sets the first name (prename) of the person.
     *
     * @param prename the first name to set for the person
     */
    public void setPrename(String prename)
    {
        this.prename = prename;
    }

    /**
     * Returns the last name (surname) of the person.
     *
     * @return the surname of the person
     */
    public String getSurname()
    {
        return surname;
    }

    /**
     * Sets the last name (surname) of the person.
     *
     * @param surname the last name to set for the person
     */
    public void setSurname(String surname)
    {
        this.surname = surname;
    }
}
