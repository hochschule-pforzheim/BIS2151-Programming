package serialization;

import java.util.*;
import java.io.*;

/**
 * @version 1.0
 * @author Ainz
 */
public class SerializationDemo
{

    /**
     * Writes a file with the provided ArrayList containing object of the type
     * 'Participant'
     *
     * @param pList
     * @param fileName
     */
    public void serialize(ArrayList<Participant> pList, String fileName)
    {
        try
        {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
            out.writeObject(pList);
        } catch (IOException ex)
        {
            ex.getMessage();
            System.out.println("A problem occured during the serialization process.");
        }
    }

    /**
     * Reads the object from the file and returns it.
     *
     * @param fileName
     * @return The read object
     */
    public ArrayList<Participant> deserialize(String fileName)
    {
        ArrayList<Participant> pList = null;
        try
        {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
            pList = (ArrayList<Participant>) in.readObject();
        } catch (IOException | ClassNotFoundException ex)
        {
            ex.getMessage();
            System.out.println("A problem occured during the deserialization process.");
        }
        return pList;
    }
}
