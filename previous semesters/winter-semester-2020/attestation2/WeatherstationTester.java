package attestation2;

/**
 * Tests the weatherstation by creating an instance of it.
 *
 * @author ainzone
 */
public class WeatherstationTester
{

    /**
     * Starting point of the attestation #2
     *
     * @param args
     */
    public static void main(String[] args)
    {
        Weatherstation ws = new Weatherstation();
        for (int i = 0; i < 500; i++)
        {
            System.out.println(ws.generateWeatherMessage());
        }
    }
}
