package unit05;

/**
 * Example on Wrapper Classes
 *
 * @author Andreas Schneider
 */
public class WrapperExample
{

    public static void run()
    {
        // Using primitive data type
        int primitiveInt = 42;

        // Converting primitive int to Integer object using wrapper class
        Integer wrapperInt = primitiveInt;

        // Converting Integer object to primitive int
        int backToInt = wrapperInt;

        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapper Integer: " + wrapperInt);
        System.out.println("Converted back to primitive int: " + backToInt);
    }
}
