package unit05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import university.Student;

/**
 * Possible Solution for the Unit 05 Exercise
 *
 * @author Andreas Schneider
 */
public class ExerciseSolution
{

    public static void run()
    {
        // Task 1: Copying an Array
        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] destinationArray = new int[sourceArray.length];
        System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length);
        System.out.println("Task 1: Copied Array: " + Arrays.toString(destinationArray));

        // Task 2: Creating an ArrayList using "Student"
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(300000, "Smith", "Alice"));
        studentList.add(new Student(300001, "Doe", "John"));
        studentList.add(new Student(300002, "Jackson", "Tom"));
        System.out.println("\nTask 2: Student List: " + studentList);

        // Task 3: Printing the content of the ArrayList
        System.out.println("\nTask 3: Sorted Student List: " + studentList);

        // Task 4: Exception Handling with console input
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("\nTask 4: Enter the first integer: ");
            int num1 = Integer.parseInt(sc.nextLine());

            System.out.print("Enter the second integer: ");
            int num2 = Integer.parseInt(sc.nextLine());

            System.out.println("Sum of the integers: " + (num1 + num2));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            sc.close();
        }
    }
}
