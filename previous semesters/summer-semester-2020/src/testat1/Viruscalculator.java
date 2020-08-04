package testat1;

import java.util.Scanner;

/**
 * Tutorial BIS2151
 * @author ainzone
 * @version 1.0
 */
public class Viruscalculator
{
    private static int infections, week;
    private static double increase, deathRate;

    /**
     * This method runs the Viruscalculator with a given String[]. The method
     * first checks whether there enough args given as well as check for each
     * argument for itself. After checking the values this method calls the
     * Viruscalculator.calculation() method.
     * @param args
     */
    public static void run(String[] args)
    {
        checkArgs(args);
        infections = checkInfections(infections);
        week = checkWeek(week);
        increase = checkIncrease(increase);
        deathRate = checkDeathRate(deathRate);
        consoleOutputHeader();
        calculation(infections, week, increase, deathRate);
    }

    /**
     * This method calculates the infections per week with an increase as well
     * as a deathRate and returns the values into the console. The amount of infected people will be rounded to an integer.
     * @param infections
     * @param week
     * @param increse
     * @param deathRate
     */
    private static void calculation(int infections, int week, double increase, double deathRate)
    {
        for (int i = 0; i < week; i++)
        {
            int weekNo = i + 1;
            double infected = infections * (increase / 100);
            
            if (i > 0)
            {
                infections = infections + (int) Math.round(infected);
            }
            
            double deaths = infections * (deathRate / 100);
            deaths = Math.round(deaths);
            consoleOutputCalculation(weekNo, infections, (int) deaths);
        }
    }

    /**
     * Performs a formatted print line in the console with information about the
     * week number, the infection as well as deaths
     * @param weekNo
     * @param intections
     * @param deaths
     */
    private static void consoleOutputCalculation(int weekNo, int infections, int deaths)
    {
        System.out.println(String.format("  %2d        %7d     %6d", weekNo, infections, (int) deaths));
    }

    /**
     * Prints the console output header with information about the arguments.
     */
    private static void consoleOutputHeader()
    {
        System.out.println("Checked numbers: \n The Viruscalculator will run with " + infections + " people and calculate \n" + week + " weeks with an increase of " + increase + " % and a mortality of " + deathRate + " %.\n");
        System.out.println("week    " + " infections    " + " deaths    ");
    }

    /**
     * Checks the length of the String[] args. The String[] should containt four
     * entries to perform the calculation. 
     * @param args
     */
    private static void checkArgs(String[] args)
    {
        if (args.length == 0)
        {
            System.out.println("You have not given any arguments. Please follow the instructions below to add arguments:");
        }

        if (args.length >= 1)
        {
            try
            {
                infections = Integer.parseInt(args[0]);
            }
            catch (NumberFormatException nfe)
            {
                infections = 0;
            }
        }

        if (args.length >= 2)
        {
            try
            {
                week = Integer.parseInt(args[1]);
            }
            catch (NumberFormatException nfe)
            {
                week = 0;
            }
        }

        if (args.length >= 3)
        {
            try
            {
                increase = Double.parseDouble(args[2]);
            }
            catch (NumberFormatException nfe)
            {
                increase = 0.0;
            }
        }

        if (args.length >= 4)
        {
            try
            {
                deathRate = Double.parseDouble(args[3]);
            }
            catch (NumberFormatException nfe)
            {
                deathRate = 0.0;
            }
        }
    }

    /**
     * Checks the infections. This value may not be less than zero.
     * If the infections input is invalid, a scanner reads new values given.
     * @param infections
     * @return Infections
     */
    private static int checkInfections(int infections)
    {
        String input;
        Scanner s = new Scanner(System.in);

        while (infections <= 0)
        {
            System.out.println("Please give a correct number of infected people: ");
            input = s.next();          
            input = input.trim();
            try
            {
                infections = Integer.parseInt(input);
            }
            catch (NumberFormatException nfe)
            {
                infections = 0;
            }
        }
        return infections;
    }

    /**
     * Checks the weeks. This value may not be less than zero.
     * If the week input is invalid, a scanner reads new values given.
     * @param week
     * @return week
     */
    private static int checkWeek(int week)
    {
        String input;
        Scanner s = new Scanner(System.in);

        while (week <= 0)
        {
            System.out.println("Please give a correct number of weeks to run the calculation: ");

            input = s.next(); 
            input = input.trim();
            try
            {
                week = Integer.parseInt(input);
            }
            catch (NumberFormatException e)
            {
                week = 0;
            }
        }
        return week;
    }

    /**
     * Checks the increase. This value may not be zero or less as well as not exceeding 100 due to procentual values.
     * If the increase input is invalid, a scanner reads new values given.
     * @param increase
     * @return increase
     */
    private static double checkIncrease(double increase)
    {
        String input;
        Scanner s = new Scanner(System.in);

        while (increase <= 0.0 || increase > 100.0)
        {
            System.out.println("Please give a valid increase rate: ");
            input = s.next();
            input = input.trim();
            try
            {
                increase = Double.parseDouble(input);
            }
            catch (NumberFormatException nfe)
            {
                increase = 0.0;
            }
        }
        return increase;
    }

    /**
     * Checks the death rate. This value may not be zero or less as well as not exceeding 100 due to procentual values.
     * If the death rate input is invalid, a scanner reads new values given.
     * @param deathRate
     * @return deathRate
     */
    private static double checkDeathRate(double deathRate)
    {
        String input;
        Scanner s = new Scanner(System.in);

        while (deathRate <= 0.0 || deathRate > 100.0)
        {
            System.out.println("Please enter correct rate of deaths from infection: ");

            input = s.next();
            input = input.trim();
            try
            {
                deathRate = Double.parseDouble(input);
            }
            catch (NumberFormatException nfe)
            {
                deathRate = 0.0;
            }
        }
        return deathRate;
    }
}