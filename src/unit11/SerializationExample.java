package unit11;

import java.io.*;

/**
 * Example for serialization
 *
 * @author Andreas Schneider
 */
public class SerializationExample
{

    public static void run()
    {
        // Object to be serialized
        Person person = new Person("John Doe", 30);

        // Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser")))
        {
            oos.writeObject(person);
            System.out.println("Object serialized successfully");
            oos.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser")))
        {
            Person deserializedPerson = (Person) ois.readObject();
            System.out.println("Object deserialized successfully: " + deserializedPerson);
            ois.close();
        } catch (IOException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
