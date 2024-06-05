package unit10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Persistency Manager of Tacos
 *
 * @author Andreas Schneider
 */
public class TacoPersistency
{

    public static String serializeTaco(Taco inputTaco)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("tacos.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(inputTaco);
            oos.close();
            fos.close();
            return "Serialization successful!";
        } catch (FileNotFoundException ex)
        {
            Logger.getLogger(TacoPersistency.class.getName()).log(Level.SEVERE, null, ex);
            return "Serialization failed!";
        } catch (IOException ex)
        {
            Logger.getLogger(TacoPersistency.class.getName()).log(Level.SEVERE, null, ex);
            return "Serialization failed!";
        }
    }

    public static Taco deSerializeTaco()
    {
        try
        {
            FileInputStream fis = new FileInputStream("tacos.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Taco fileTaco = (Taco) ois.readObject();

            ois.close();
            fis.close();
            return fileTaco;
        } catch (Exception ex)
        {
            Logger.getLogger(TacoPersistency.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
