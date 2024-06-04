package unit11;

import java.io.*;
import unit10.Duck;

/**
 * Example class for a Pond. Pond objects can be serialized.
 *
 * @author Andreas Schneider
 */
public class Pond implements Serializable
{

    // Class Pond has one instance variable, a Duck
    private Duck duck = new Duck();

    public static void run()
    {
        Pond myPond = new Pond();
        try
        {
            FileOutputStream fs = new FileOutputStream("Pond.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            // When you serialize myPond (a Pond object), its Duck instance variable automatically gets serialized.
            os.writeObject(myPond);
            os.close();
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
