package unit05;

/**
 * Demonstrates method overloading and the use of parameters in Java. This class
 * provides examples of a method with and without parameters, showing how Java
 * handles different method signatures within the same class. It also includes a
 * basic introduction message for display.
 *
 * Method overloading allows multiple methods in a class to have the same name
 * but different parameters, enabling flexibility in method calls.
 *
 * @author Andreas R. Schneider
 * 
 * @date 30 October 2024
 */
public class ArgumentParameter
{

    /**
     * Prints an introduction message. This method displays a welcome banner for
     * the example output.
     */
    public static void introduction()
    {
        System.out.println("===========================");
        System.out.println("= Welcome to the Example! =");
        System.out.println("===========================");
    }

    /**
     * Prints a simple message to the console, demonstrating a method without
     * parameters.
     */
    public static void argumentExample()
    {
        System.out.println("This is a method not employing parameters!");
    }

    /**
     * Prints a message to the console that includes the provided input.
     * Demonstrates the use of a method with a single String parameter.
     *
     * @param input the message to be printed to the console
     */
    public static void argumentExample(String input)
    {
        System.out.println(input);
    }

    /**
     * Runs the demonstration by calling methods with and without arguments.
     * Shows how Java distinguishes between overloaded methods based on
     * parameter lists.
     */
    public static void run()
    {

        // Call the no-argument example
        argumentExample();

        // Call the argument example with a specific String argument
        argumentExample("This is the argument");
    }
}
