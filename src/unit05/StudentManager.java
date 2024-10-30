package unit05;

import java.util.ArrayList;

/**
 * Manages a list of Student objects and demonstrates operations on an
 * ArrayList. This class includes methods to create and modify students in an
 * ArrayList and an example of creating and managing integers in a separate
 * ArrayList.
 *
 * @author Andreas R. Schneider
 *
 * @date 30 October 2024
 */
public class StudentManager
{

    /**
     * Runs the example code for managing a list of students. This method
     * creates two Student objects, adds them to an ArrayList, retrieves and
     * modifies data within the list, and then calls another method to
     * demonstrate integer management.
     *
     */
    public static void run()
    {

        // Create two Student objects with different details
        Student firstStudent = new Student("Doe", "Jane", 300000);
        Student secondStudent = new Student("Doe", "Joe", 300001);

        // Create an ArrayList to store Student objects
        ArrayList<Student> students = new ArrayList<>();

        // Add the two Student objects to the ArrayList
        students.add(firstStudent);
        students.add(secondStudent);

        // Retrieve and print the student ID of the first student in the ArrayList
        System.out.println(students.get(0).getStudentID());

        // Retrieve the first Student object, store it in a variable, then get and print its ID
        Student returnedStudent = students.get(0);
        int returnedStudentID = returnedStudent.getStudentID();
        System.out.println(returnedStudentID);

        // Update the student ID of the first student in the ArrayList to 400000
        students.get(0).setStudentID(400000);

        // Print out the updated student ID of the first student
        System.out.println(students.get(0).getStudentID());

        // Run the manageIntegers method to demonstrate integer handling in an ArrayList
        System.out.println("=== Running manageIntegers() ===");
        manageIntegers();
    }

    /**
     * Manages an ArrayList of integers by adding numbers from 1 to 50. This
     * method demonstrates how to automatically populate an ArrayList using a
     * for-loop and then print the contents and size of the ArrayList.
     */
    public static void manageIntegers()
    {

        // Create an ArrayList to store Integer objects
        ArrayList<Integer> numbers = new ArrayList<>();

        // Use a for-loop to add integers from 1 to 50 to the ArrayList
        for (int i = 0; i < 50; i = i + 1)
        {
            numbers.add(i + 1); // Add each integer to the ArrayList
        }

        // Print the contents of the ArrayList
        System.out.println(numbers);

        // Print the total number of elements in the ArrayList
        System.out.println("The ArrayList encompasses: " + numbers.size());
    }
}
