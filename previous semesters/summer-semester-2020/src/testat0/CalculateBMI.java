package testat0;

import java.util.Scanner;

/**
 * Lecture BIS2151
 * @author wernerburkard
 * @version 1.0
 */
public class CalculateBMI
{
    /**
     * @param args the command line arguments
     *
     * If they are present they are: args[0] is the name of the person we
     * calculate the BMI args[1] is the weight args[2] is the size for example
     * 1.82 (meters)
     *
     * if an argument is missing or wrong, we ask the user for input
     *
     */
    public static void main(String[] args)
    {
        String person = ""; // persons name we calculate the BMI
        int weight = 0;     // the persons weight
        double size = 0.0;  // the persons size
        double bmi = 0.0;  // resulting BMI of the person after calculation
        /*
        // load variables from args array if possible...
        if (args.length >= 1) {  // great: we have at least one argument: the name
            person = args[0];
        }
        if (args.length >= 2) {  // great: we have at least 2 args and the weight
            try {
                weight = Integer.parseInt(args[1]);
            } catch (Exception e) {
                weight = 0;
            }
        }
        if (args.length >= 3) {  // great: we have at least 3 args and the size
            try {
                size = Double.parseDouble(args[2]);
            } catch (Exception e) {
                size = 0.0;
            }
        }
        System.out.println("Person is " + person);
        System.out.println("Weight is " + weight);
        System.out.println("Size   is " + size);

        // we have to check the variables for missing or crazy values
        // 1. lets check the name!
        person = checkPerson(person);   // checks if persons name is okay
        weight = checkWeight(weight);   // checks if weight is okay
        size = checkSize(size);         // checks if size is okay

        System.out.println("Checked arguments are:");
        System.out.println("Person is " + person);
        System.out.println("Weight is " + weight);
        System.out.println("Size   is " + size);

        // now caculate the BMI
        bmi = weight / (size * size);
        // optimize BMI to only show 2 digits
        bmi = ( (int) (bmi*100.0) ) / 100.0;
        
        System.out.println("\nRESULT:    BMI is " + bmi);
         */
        CalculateBMI myBmiMachine = new CalculateBMI();
        int theLenght = myBmiMachine.testme("testagain");
        System.out.println("Result is " + theLenght);
    }

    private static String checkPerson(String name)
    {
        Scanner s = new Scanner(System.in);
        // first we eliminate leading and trailing spaces
        name = name.trim();
        // Now: if name is too short (lower than 2 letters:)
        // then we ask user to type another name at the keyboard
        while (name.length() < 2)
        {
            System.out.print("Please enter correct persons name: ");
            // read input from keyboard
            name = s.next();
            name = name.trim();
        }
        return name;
    }

    private static int checkWeight(int weight)
    {
        String input = "";
        Scanner s = new Scanner(System.in);
        // Now: if weight is 0 or lower
        // then we ask user to type another weight at the keyboard
        while (weight <= 0)
        {
            System.out.print("Please enter correct persons weight: ");
            // read input from keyboard
            input = s.next();
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
        return weight;
    }

    private static double checkSize(double size)
    {
        String input = "";
        Scanner s = new Scanner(System.in);
        // Now: if weight is 0 or lower
        // then we ask user to type another weight at the keyboard
        while (size <= 0.0 || size > 2.4)
        { 
            // crazy sizes not okay!!
            System.out.print("Please enter correct persons size: ");
            // read input from keyboard
            input = s.next();
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
        return size;
    }

    private int testme(String something)
    {
        System.out.println("Hi, this is myBmiMachine");
        System.out.println(something);
        return something.length();
    }
}
