package serialization;

import java.io.*;
import java.util.ArrayList;

/**
 * This class demonstrates the process of serialising and deserialising objects
 * in Java. Serialisation is the process of converting an object's state into a
 * byte stream, so it can be saved to a file or sent over a network.
 * Deserialisation reverses this process, reconstructing the object from the
 * byte stream.
 *
 * In this example, we work with a collection of `Student` objects. These
 * objects are serialised to a file named "students.ser" and then read back
 * (deserialised) to populate an ArrayList.
 *
 * <p>
 * <b>Key Features:</b></p>
 * - Writing objects to a file (serialisation). - Reading objects back from a
 * file (deserialisation). - Handling exceptions such as file not found and
 * end-of-file during the process.
 *
 * This class also demonstrates how to handle common exceptions and manage file
 * streams in Java.
 *
 * @date 2025-01-08
 * @author Andreas R. Schneider
 */
public class Serialization
{

    /**
     * A static collection used to store deserialised `Student` objects.
     */
    private static ArrayList<Student> studentCollection = new ArrayList<>();

    /**
     * The run method creates and serialises three `Student` objects, writes
     * them to a file, and then deserialises them back to populate an ArrayList.
     *
     * <p>
     * Steps in this method:</p>
     * 1. Create three `Student` objects. 2. Write these objects to a file using
     * ObjectOutputStream. 3. Deserialise the objects back into memory and store
     * them in an ArrayList. 4. Print the deserialised list of `Student`
     * objects.
     *
     */
    public static void run()
    {
        Student myFirstStudent = new Student("First", "Jane", 300000);
        Student mySecondStudent = new Student("Second", "Jane", 300001);
        Student myThirdStudent = new Student("Third", "Mate", 300002);

        try
        {
            // Create file and object streams for writing objects
            System.out.println("Creating FileOutputStream");
            FileOutputStream fos = new FileOutputStream("students.ser");
            System.out.println("Creating ObjectOutputStream");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // Write the `Student` objects to the file
            System.out.println("Writing first student");
            oos.writeObject(myFirstStudent);
            System.out.println("Writing second student");
            oos.writeObject(mySecondStudent);
            System.out.println("Writing third student");
            oos.writeObject(myThirdStudent);

            // Close the streams after use
            System.out.println("Closing the streams...");
            oos.close();
            fos.close();

        } catch (FileNotFoundException fnfe)
        {
            // This block handles the case where the file cannot be found or created
            System.out.println(fnfe.getLocalizedMessage());
        } catch (IOException ex)
        {
            // This block handles general input/output exceptions
            System.out.println(ex.getLocalizedMessage());
        }

        // Call the method to deserialise the objects and populate the collection
        populateCollection();
        System.out.println(studentCollection.toString());
    }

    /**
     * This method reads objects from the "students.ser" file and adds them to
     * the `studentCollection` ArrayList. This demonstrates the process of
     * deserialisation.
     *
     * <p>
     * Steps in this method:</p>
     * 1. Open the file using FileInputStream and ObjectInputStream. 2. Read
     * objects from the file in a loop until the end of the file is reached. 3.
     * Handle the EOFException to know when to stop reading. 4. Add the
     * deserialised `Student` objects to the ArrayList. 5. Handle exceptions
     * such as file not found or class not found.
     *
     * <p>
     * <b>Note:</b> The end-of-file condition is detected by catching an
     * EOFException, which is thrown when the end of the file is reached during
     * deserialisation.</p>
     */
    public static void populateCollection()
    {
        try
        {
            // Open the file and prepare to read objects
            FileInputStream fis = new FileInputStream("students.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            // Continuously read objects until the end of the file is reached
            while (true)
            {
                try
                {
                    // Cast the read object to `Student` and add it to the collection
                    Student student = (Student) ois.readObject();
                    studentCollection.add(student);
                } 
                catch (EOFException e)
                {
                    // End of file reached, exit the loop
                    break;
                }
            }

            // Close the input stream
            ois.close();

        } 
        catch (Exception ex)
        {
            // Handle any exception that might occur, such as ClassNotFoundException
            System.out.println(ex.getLocalizedMessage());
        }
    }
}
