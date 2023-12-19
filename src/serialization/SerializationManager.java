package serialization;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import university.Student;

/**
 * Example Serialization Manager
 *
 * @version 1.0
 * @author Andreas Schneider
 */
public class SerializationManager
{

    /**
     * Persists (serialization) of a Student object to a local file.
     *
     * @param student
     */
    public static void serializeStudent(Student student)
    {
        try {
            FileOutputStream fos = new FileOutputStream("students.ser");
            System.out.println("File students.ser hast been created.");

            ObjectOutputStream oos = new ObjectOutputStream(fos);
            System.out.println("Object Output Stream enabled.");

            oos.writeObject(student);
            System.out.println("Object " + student.toString() + " has been written.");

            oos.close();
            fos.close();
            System.out.println("Output stream closed.");
        } catch (IOException ex) {
            // Create a local file as a backup
            System.out.println(ex.getMessage());
        } finally {
            // possible enchancement using a local file instead of e.g., a database
        }
    }

    /**
     * Demo Persistation method signature.
     *
     * @param student
     */
    public static void persistStudent(Student student)
    {
        // imagine a database connection
        // Create a local file as a backup
        // possible enchancement using a local file instead of e.g., a database
    }

    /**
     * Deserializes a students.ser file into a single object of type Student.
     *
     * @return Returns an entire Student object
     */
    public static Student deserializeStudent()
    {
        try {
            // Creating a File Input Stream
            FileInputStream fis = new FileInputStream("students.ser");
            System.out.println("File Input Stream enabled.");

            // Creating an Object Input Stream
            ObjectInputStream ois = new ObjectInputStream(fis);
            System.out.println("Object Input Stream enabled.");

            // Reading a Student from file
            Student readStudent = (Student) ois.readObject();
            System.out.println("Object " + readStudent.toString() + " read.");

            System.out.println("Returning Student object...");
            ois.close();
            fis.close();
            return readStudent;
        } catch (IOException ex) {
            // If an IOException occurs, return null
            return null;

        } catch (ClassNotFoundException ex) {
            // If the class has not been found, throw an exception and log.
            Logger.getLogger(SerializationManager.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            return new Student();
        }
    }

}
