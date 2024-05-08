package building;

/**
 * The Manager class represents a manager who oversees office-related
 * operations. It initializes an Office object and provides a method to run
 * operations. This class is responsible for printing information about the
 * office.
 *
 * @author Andreas Schneider
 */
public class Manager
{

    /**
     * The Office object managed by this manager.
     */
    Office myOffice = new Office("SWP", "Stadt Pforzheim");

    /**
     * Runs operations related to managing the office. Prints information about
     * the office, including its height and renter.
     */
    public void run()
    {
        System.out.println("Height is: " + myOffice.getHeight());
        System.out.println("Renter is: " + myOffice.getRenter());
    }
}
