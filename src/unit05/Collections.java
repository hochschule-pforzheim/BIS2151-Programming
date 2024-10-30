package unit05;

import java.util.ArrayList;

/**
 * Demonstrates the use of arrays and ArrayLists in Java. This class includes
 * examples of modifying an array, checking if an ArrayList is empty, and adding
 * elements to an ArrayList.
 *
 * @author Andreas R. Schneider
 *
 * @date 30 October 2024
 */
public class Collections
{

    /**
     * Runs the demonstration code for arrays and ArrayLists.
     */
    public static void run()
    {

        // Create a character array containing the letters in "HELLO"
        char[] hello =
        {
            'H', 'E', 'L', 'L', 'O'
        };

        // Print out the contents of the array as a string
        System.out.println(hello);

        // Print out the array's technical name and memory location (not the contents)
        System.out.println(hello.toString());

        // Modify the last character in the array to '0' (changing "HELLO" to "HELL0")
        hello[4] = '0';

        // Print the modified array
        System.out.println(hello);

        // Create an ArrayList to store strings
        ArrayList<String> words = new ArrayList<>();

        // Print the size of the ArrayList (should be 0 as it's empty initially)
        System.out.println(words.size());

        // Check if the ArrayList is empty
        // If it is empty, do not attempt to retrieve the first element
        if (!words.isEmpty())
        {
            // Get the first element if the ArrayList is not empty
            words.get(0);
        } else
        {
            // Print a message indicating the ArrayList is empty
            System.out.println("ArrayList is empty!");
        }

        // Add the word "Hello" to the ArrayList
        words.add("Hello");

        // Print the size of the ArrayList after adding an element (should be 1 now)
        System.out.println(words.size());

        // Retrieve the first element of the ArrayList, which is "Hello"
        words.get(0);
    }
}
