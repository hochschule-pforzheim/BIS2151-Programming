package unit07;

/**
 * Example Class for Inheritance
 *
 * @author Andreas Schneider
 */
public class Surgeon extends Doctor
{

    void treatPatient()
    {
        System.out.println("Performing surgery ...");
    }

    void makeIncision()
    {
        System.out.println("Making incision (Yikes!)...");
    }
}
