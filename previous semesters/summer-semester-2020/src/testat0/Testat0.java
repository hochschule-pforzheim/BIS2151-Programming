package testat0;

/**
 * Lecture BIS2151
 * @author wernerburkard
 * @version 1.0
 */
public class Testat0
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int n1, n2, n3;
        double myWonderfullRandomNumber;
        //String username = "Prof. Burkard";
        String prenames[] = {"Anna", "Klara", "Sofie"};
        n1 = 13;
        n2 = n1 + 13;
        System.out.print("Hallo world,");
        //System.out.println("this is " + args[0] + "!");
        n3 = add(n1, n2);
        System.out.println("Result is: " + n3);
        n2 = add(17, 4);
        System.out.println("Result is now: " + n2);
        n3 = add(n1, n2);
        System.out.println("Result is: " + n3);
        System.out.println("We have " + prenames.length + " ladies with us");
        System.out.println("They are: ");
        for (int i = 0; i < prenames.length; i++)
        {
            System.out.print("This is loop number " + i + " : ");
            System.out.println(prenames[i]);
        }
        System.out.println("Lenght of args is actually " + args.length);
        for (int i = 0; i < args.length; i++)
        {
            System.out.print("This args[" + i + "]: ");
            System.out.println(args[i]);
        }

        // Now we generate a random number between 1..49
        myWonderfullRandomNumber = 1 + (49 * Math.random());
        n1 = (int) myWonderfullRandomNumber;
        System.out.println("The random number is " + n1);

        n1 = Integer.parseInt("1234");
        System.out.println("Converted String '1234' is " + n1);
    }

    public static int add(int number1, int number2)
    {
        int result = 0;
        result = number1 + number2;
        return result;
    }
}
