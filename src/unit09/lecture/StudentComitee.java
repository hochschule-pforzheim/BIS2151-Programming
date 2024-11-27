package unit09.lecture;

/**
 * The StudentComitee interface defines the responsibilities and actions of a
 * student committee. Any class implementing this interface is required to
 * provide its own implementation for the methods declared here.
 *
 * <p>
 * Interfaces in Java are used to define a contract for classes. This means any
 * class that implements this interface must implement all its methods. By
 * default, all methods in an interface are implicitly public and abstract.
 * </p>
 *
 * @author Andreas R. Schneider
 */
public interface StudentComitee
{

    /**
     * Simulates the process of holding an election in the student committee.
     * Any implementing class must define how an election is conducted.
     */
    public abstract void holdElectection();

    /**
     * Simulates the process of organising a meeting in the student committee.
     * Any implementing class must define how the meeting is organised.
     *
     * <p>
     * This method is implicitly public and abstract, as it is declared in an
     * interface. Adding the keywords explicitly (like public or abstract) is
     * optional but may improve readability.
     * </p>
     */
    void organiseMeeting();
}
