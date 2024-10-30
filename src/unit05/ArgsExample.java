package unit05;

/**
 * Demonstrates the use of primitive and reference types in Java by showcasing
 * autoboxing and unboxing of a double value.
 *
 * Autoboxing is the automatic conversion of a primitive type to its
 * corresponding wrapper class (in this case, double to Double), while unboxing
 * is the reverse process.
 *
 * @author Andreas R. Schneider
 * 
 * @date 30 October 2024
 */
public class ArgsExample
{

    /**
     * Runs the example code that demonstrates the differences between primitive
     * and reference types using autoboxing and unboxing.
     *
     * @param args an array of command-line arguments (not used in this example)
     */
    public static void run(String[] args)
    {

        // Declare a primitive double variable with a value of 42
        double primitiveDouble = 42;

        // Print the primitive double value
        System.out.println(primitiveDouble);

        // Autoboxing: Convert the primitive double to a Double reference type
        Double referenceDouble = primitiveDouble;

        // Print the Double object, showing autoboxing
        System.out.println(referenceDouble);

        // Unboxing: Convert the Double reference type back to a primitive double
        double returnedDouble = referenceDouble;

        // Print the unboxed primitive double, showing the value remains the same
        System.out.println(returnedDouble);
    }
}
