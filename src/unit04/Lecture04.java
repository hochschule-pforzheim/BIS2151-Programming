package unit04;

/**
 * This is a Java class declaration. It defines a public class called
 * 'Lecture04'. The class is public, which means it can be accessed from other
 * classes.
 *
 * @date 23 October 2024
 *
 * @author Andreas R. Schneider
 */
public class Lecture04
{

    /*
     * This is the main method, which is the entry point for any Java application.
     * When you run a Java program, the instructions inside this method are executed.
     * 'String[] args' represents an array of command-line arguments that the program can accept when run.
     */
    public static void main(String[] args)
    {
        // This line calls the run method from another class called 'Foobar'.
        // You would need to define the 'Foobar' class for this to work.
        Foobar.run();

        // This line calls the sayHello method from another class called 'ThirdClass'.
        // Again, you'd need to define the 'ThirdClass' elsewhere in your project.
        ThirdClass.sayHello();

        // Here, we are calling a method called 'calculation' with two arguments, 1 and 2.
        // It will return the product of these two numbers.
        calculation(1, 2);

        // This prints an empty line to the console.
        System.out.println("");

        // This line calculates 2 raised to the power of 10 using the Math.pow method, and stores the result in 'result'.
        double result = Math.pow(2, 10);

        Exercise.run();
        Person alice = new Person();
        alice.prename = "Alice";
        System.out.println("The name of 'alice' reference: " + alice.prename);
        Person bob = new Person("Bob", "Example");
        System.out.println("The name of 'bob' reference: " + bob.prename + bob.surname);
    }

    /**
     * This is a method named 'calculation'. It takes two integer arguments, 'a'
     * and 'b', and returns their product.
     *
     * @param a This is the first integer input.
     * @param b This is the second integer input.
     * @return This method returns an integer which is the result of multiplying
     * 'a' and 'b'.
     */
    public static int calculation(int a, int b)
    {
        // The multiplication of 'a' and 'b' is returned.
        return a * b;
    }
}
