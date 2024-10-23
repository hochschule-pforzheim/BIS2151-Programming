package unit04;

/**
 * The {@code ThirdClass} demonstrates a simple class with a method that prints
 * a greeting message to the console. This is a basic example of creating a
 * static method in Java.
 *
 * @author Andreas R. Schneider
 */
public class ThirdClass
{

    /**
     * The {@code sayHello} method prints a greeting message to the console.
     * This is a static method, meaning it can be called without creating an
     * instance of the {@code ThirdClass}.
     *
     * Example usage:
     * <pre>
     * ThirdClass.sayHello(); // This will print "Hello from Class 'ThirdClass'"
     * </pre>
     */
    public static void sayHello()
    {
        // Print a message to the console
        System.out.println("Hello from Class 'ThirdClass'");
    }
}
