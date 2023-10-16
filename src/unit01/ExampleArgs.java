package unit01;

/**
 * Example class for args.
 *
 * @author Andreas R. Schneider
 */
public class ExampleArgs
{

    public static void main(String[] args)
    {
        // Check if there are enough command line arguments (name and age)
        if (args.length < 2)
        {
            System.out.println("Usage: java Main <name> <age>");
            return;
        }

        // Get name and age from command line arguments
        String name = args[0];
        int age = 0;

        // Parse age from the second command line argument
        try
        {
            age = Integer.parseInt(args[1]);
        } catch (NumberFormatException e)
        {
            System.out.println("Invalid age. Please enter a valid number.");
            return;
        }

        // Display a message with the user's name and age
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }
}
