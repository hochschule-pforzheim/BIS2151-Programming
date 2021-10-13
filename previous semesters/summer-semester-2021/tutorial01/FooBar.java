package tutorial01;

/**
 *
 * @author Jonathan Hinkel
 */
public class FooBar
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        float firstNumber = 1.6f;
        float secondNumber = 2.4f;

        float multiplyResult = multiply(firstNumber, secondNumber);
        System.out.println("The result is " + multiplyResult);

    }

    public static float multiply(float x, float y)
    {
        float result = x * y;
        return result;
    }

    public static void errorMessage()
    {
        System.out.println("There has been an error. Please try again.");
    }
}