package unit06;

import java.util.*;

/**
 * The {@code University} class provides methods to demonstrate basic operations
 * with students and numerical data, including sorting a list of integers,
 * creating students, and demonstrating rounding functions.
 *
 * @author Andreas R. Schneider
 */
public class University
{

    // Static ArrayList to store Student objects
    static ArrayList<Student> students = new ArrayList<>();

    /**
     * The run method, entry point of the class. It demonstrates sorting an
     * ArrayList of integers by calling the {@link #sortArrayList()} method.
     */
    public static void run()
    {
        // createStudent();
        // roundingExample(100.00f);
        // roundingExample(99.99f);
        // roundingExample(0.1f);

        sortArrayList();
    }

    /**
     * Demonstrates sorting an {@code ArrayList} of integers in ascending order.
     * <p>
     * This method first prints the original list of numbers, then sorts them
     * using {@code Collections.sort()}, and finally prints the sorted list.</p>
     */
    public static void sortArrayList()
    {
        ArrayList<Integer> myNumbers = new ArrayList<>();

        // Add integers to the ArrayList
        myNumbers.add(1);
        myNumbers.add(7);
        myNumbers.add(2);
        myNumbers.add(90);
        myNumbers.add(-3);
        myNumbers.add(0);
        myNumbers.add(12);

        // Print unsorted ArrayList
        for (int i = 0; i < myNumbers.size(); i++)
        {
            System.out.print(myNumbers.get(i));
            System.out.print(" , ");
        }

        // Sort the ArrayList
        Collections.sort(myNumbers);
        System.out.println("");
        System.out.println("===============");

        // Print sorted ArrayList
        for (int i = 0; i < myNumbers.size(); i++)
        {
            System.out.print(myNumbers.get(i));
            System.out.print(" , ");
        }
    }

    /**
     * Prompts the user to enter details for a student (surname, prename, and
     * ID) and adds the created {@code Student} object to the {@code students}
     * ArrayList.
     *
     * <p>
     * If the input for student ID is not a valid integer, an exception is
     * caught, and the student ID remains set to a default value of -1.</p>
     */
    public static void createStudent()
    {
        System.out.println("Present the surname of the student:");

        // Create a new scanner to read the input
        Scanner sc = new Scanner(System.in);
        String surname = sc.nextLine();

        System.out.println("Present the prename of the student:");
        String prename = sc.nextLine();

        System.out.println("Enter student ID:");
        int studentID = -1;
        try
        {
            studentID = sc.nextInt();
        } catch (InputMismatchException ismex)
        {
            ismex.getMessage();
        }

        // Create and add the new Student object to the list
        Student newStudent = new Student(surname, prename, studentID);

        System.out.println("Adding the student to the ArrayList...");
        students.add(newStudent);
        System.out.println("Done.");
    }

    /**
     * Demonstrates the difference between truncating and rounding a
     * floating-point number by outputting both truncated and rounded results.
     *
     * <p>
     * This method truncates the input by casting it to an integer and rounds it
     * using {@code Math.round()}, printing both results.</p>
     *
     * @param input the floating-point number to demonstrate truncation and
     * rounding on
     */
    public static void roundingExample(float input)
    {
        int truncate = (int) input;
        System.out.println("Truncate Output: " + truncate);

        int rounding = Math.round(input);
        System.out.println("Rounding Output: " + rounding);

        System.out.println("============================");
    }
}
