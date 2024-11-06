package unit06;

/**
 * The {@code ExplicitConversion} class demonstrates explicit type conversions
 * (also known as type casting) between different primitive data types in Java.
 * It shows conversions from an {@code int} to a {@code byte}, a {@code float}
 * to a {@code double}, and a {@code float} to an {@code int}.
 *
 * @author Andreas R. Schneider
 */
public class ExplicitConversion
{

    /**
     * Demonstrates explicit and implicit type conversions and prints the
     * results.
     */
    public static void run()
    {
        // Define an integer with a value larger than the byte range
        int higherNumber = 120;

        // Convert the int to a byte (explicit narrowing conversion)
        // Note: If higherNumber > 127 or < -128, data will be lost due to overflow
        byte smallerNumber = (byte) higherNumber;
        System.out.println("Original int (higherNumber): " + higherNumber);
        System.out.println("After conversion to byte (smallerNumber): " + smallerNumber);

        // Define a float variable
        float sumRandomNumber = 45000.32f;

        // Implicitly convert float to double (widening conversion)
        double interestingNumber = sumRandomNumber;
        System.out.println("Original float (sumRandomNumber): " + sumRandomNumber);
        System.out.println("After conversion to double (interestingNumber): " + interestingNumber);

        // Explicitly convert float to int (narrowing conversion)
        // Note: This truncates the decimal part, keeping only the integer portion
        int numberOne = (int) sumRandomNumber;
        System.out.println("After conversion of float to int (numberOne): " + numberOne);
    }
}
