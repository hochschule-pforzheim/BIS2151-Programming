package tutorial;

import java.util.*;
import testat0.Student;

/**
 * Tutorial BIS2151
 *
 * @author ainzone
 * @version 1.1
 */
public class Tutorial
{

    public static void main(String[] args)
    {
        logic(menu(), args);
    }

    public static void conversion(String input)
    {
        try
        {
            // conver the string into an int
            int number = Integer.parseInt(input.trim());
            // printing out the result
            System.out.println("The given number was: " + number);
        } catch (NumberFormatException nfe)
        {
            System.out.println("There was an error " + nfe.getMessage());
        }
    }

    /**
     * Displaying the menu for the Tutorial Class. The user can perform a
     * selection to run certain code.
     *
     * @return Returns the integer with the users selection.
     */
    public static int menu()
    {
        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃ Welcome to the BIS2151 Tutorial in SS2020 ┃");
        System.out.println("┡━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┩");
        System.out.println("│ Please make a selection by typing the     │");
        System.out.println("│ number:                                   │");
        System.out.println("├───────────────────────────────────────────┤");
        System.out.println("│ (0) exit the program.                     │");
        System.out.println("│ (1) run 'creating objects Student'        │");
        System.out.println("│ (2) run 'try-catch conversion test'       │");
        System.out.println("│ (3) run 'Testat 1'                        │");
        System.out.println("│ (4) run 'Testat 2'                        │");
        System.out.println("│ (5) run 'ArrayList example'               │");
        System.out.println("│ (6) run 'Dot-Com-Game'                    │");
        System.out.println("│ (7) run 'Double Wrapper'                  │");
        System.out.println("│ (8) run 'Bike Manager'                    │");
        System.out.println("└───────────────────────────────────────────┘");
        System.out.println("");
        System.out.printf("Your selection: ");

        Scanner input = new Scanner(System.in);
        boolean validInput = false;
        int selection = 0;

        while (!validInput)
        {
            try
            {
                selection = Integer.parseInt(input.nextLine());
                if ((selection < 0) || (selection > 8))
                {
                    throw new NumberFormatException();
                }
                validInput = true;
            } catch (NumberFormatException nfe)
            {
                System.out.printf("Enter a number (0 - 8) please : ");
            }
        }
        return selection;
    }

    /**
     * This method performs all calls for the given selection.
     */
    private static void logic(int selection, String[] args)
    {
        switch (selection)
        {
            case 1:
                // creating objects
                Student firstStudent = new Student("John", "Doe", 'R', 1, true);
                Student secondStudent = new Student();

                // using get and set methods
                System.out.println(firstStudent.getPrename() + " " + firstStudent.getSurname());
                firstStudent.setPrename("John Jackson");
                System.out.println(firstStudent.getPrename() + " " + firstStudent.getSurname());
                break;

            case 2:
                // try-catch conversion test
                String input = "123";
                conversion(input);
                break;

            case 3:
                // running the code from testat 1   
                testat1.Viruscalculator.run(args);
                break;

            case 4:
                // running the code from testat 2
                testat2.LottoMachineTester.runLottoMachineTester();
                break;

            case 5:
                ArrayListExample.runExample();
                break;

            case 6:
                dotcomgame.DotComGame.gameStart();
                break;

            case 7:
                doubleExample();
                break;

            case 8:
                bikemanager.BikeManager.startBikeManager();
                break;

            default:
                System.exit(0);
                break;
        }
    }

    public static void doubleExample()
    {
        double myNewDouble = 5.5;
        System.out.println(myNewDouble);
        Double mySecondDouble = new Double(5.5);
        System.out.println(mySecondDouble);

        ArrayList<Double> myDoubleArray = new ArrayList<Double>();
        myDoubleArray.add(mySecondDouble);
    }
}
