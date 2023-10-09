package hspf.unit01;

import java.util.Scanner;

/**
 * Example class for a scanner.
 *
 * @author Andreas R. Schneider
 */
public class ExampleScanner
{

    public static void main(String[] args)
    {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        // Read the user's name as a string
        String name = scanner.nextLine();

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        // Read the user's age as an integer
        int age = scanner.nextInt();

        // Display a message with the user's name and age
        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        // Close the Scanner object to prevent resource leak
        scanner.close();
    }
}
