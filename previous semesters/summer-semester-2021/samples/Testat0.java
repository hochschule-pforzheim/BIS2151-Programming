package samples;

import java.util.Scanner;

/**
 *
 * @author werner
 */
public class Testat0
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        String person = ""; // users name
        int weight = 0;     // its weight
        double size = 0.0;  // its size
        double bmi = 0.0;   // resulting BMI after Calculation

        // let us load the variables from the args-array if possible
        if (args.length >= 1)
        { // There is a first argument, so we have a persons name!
            person = args[0];
        }

        if (args.length >= 2)
        { // There is a size given
            try
            {
                size = Double.parseDouble(args[1]);
            }
            catch (Exception e)
            {
                size = 0.0;
            }

        }

        if (args.length >= 3)
        { // There is a weight given
            try
            {
                weight = Integer.parseInt(args[2]);
            }
            catch (Exception e)
            {
                weight = 0;
            }

        }

        // let us show all given input data
        System.out.println("Calculating the BMI for:");
        System.out.println("Person is:      " + person);
        System.out.println("Person has size: " + size);
        System.out.println("Weight is: " + weight);

        person = checkPerson(person); // this method checks/corrects the name
        size = checkSize(size); // this method checks/corrects the size
        weight = checkweight(weight); // this method checks/corrects the weight    

        // Great! Now all input is fine!
        bmi = bmiCalculation(size, weight);

        System.out.println("The BMI of " + person + " is: " + bmi);
    }

    private static double bmiCalculation(double size, int weight)
    {
        double denominator = size * size;
        double bmi = weight / denominator;
        return bmi;
    }

    private static String checkPerson(String name)
    {
        name = name.trim(); // eliminates all leading and trailing spaces!

        // We do not accept name with no or only one letter in it!
        // first: We need a channel to the keyboard to ask user for better name
        Scanner myTotalyCoolScanner = new Scanner(System.in);

        while (name.length() <= 1)
        {
            System.out.print("Please enter correct name: ");
            name = myTotalyCoolScanner.next();
            name = name.trim();
        }
        // Great! Now User gave us a correct name!
        return name;
    }

    private static double checkSize(double size)
    {

        // We do not accept size of zero or negative, or if it is no number
        // first: We need a channel to the keyboard to ask user for better name
        Scanner myTotalyCoolScanner = new Scanner(System.in);
        String input;

        while ((size <= 0) || (size > 2.4))
        {

            System.out.print("Please enter correct size: ");
            input = myTotalyCoolScanner.next();
            input = input.trim();
            try
            {
                size = Double.parseDouble(input);
            }
            catch (Exception e)
            {
                size = 0.0;
            }
        }
        // Great! Now User gave us a correct name!
        return size;
    }

    private static int checkweight(int weight)
    {

        // We do not accept size of zero or negative, or if it is no number
        // first: We need a channel to the keyboard to ask user for better name
        Scanner myTotalyCoolScanner = new Scanner(System.in);
        String input;

        while ((weight <= 0) || (weight > 200))
        {

            System.out.print("Please enter correct weight: ");
            input = myTotalyCoolScanner.next();
            input = input.trim();
            try
            {
                weight = Integer.parseInt(input);
            }
            catch (Exception e)
            {
                weight = 0;
            }
        }
        // Great! Now User gave us a correct name!
        return weight;

    }
}
