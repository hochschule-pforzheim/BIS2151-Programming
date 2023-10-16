package unit02;

/**
 * Initializing and declaring variables for different primitive data types
 *
 * @author Andreas Schneider
 */
public class PrimitiveDataTypes
{

    public static void printDataTypes()
    {
        // byte: 8-bit signed integer
        byte byteVar = 100;

        // short: 16-bit signed integer
        short shortVar = 1000;

        // int: 32-bit signed integer
        int intVar = 10000;

        // long: 64-bit signed integer
        long longVar = 100000L;

        // float: 32-bit floating point
        float floatVar = 3.14f;

        // double: 64-bit floating point
        double doubleVar = 3.14159;

        // char: 16-bit Unicode character
        char charVar = 'A';

        // boolean: true or false
        boolean booleanVar = true;

        // Printing the values of the variables
        System.out.println("byteVar: " + byteVar);
        System.out.println("shortVar: " + shortVar);
        System.out.println("intVar: " + intVar);
        System.out.println("longVar: " + longVar);
        System.out.println("floatVar: " + floatVar);
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("charVar: " + charVar);
        System.out.println("booleanVar: " + booleanVar);
    }
}
