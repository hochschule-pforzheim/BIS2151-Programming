package unit07;

/**
 * Example Class for Inheritance
 *
 * @author Andreas Schneider
 */
public class FamilyDoctor extends Doctor
{

    boolean makesHouseCalls;

    void giveAdvice()
    {
        System.out.println("Giving homespun advice...");
    }
}
