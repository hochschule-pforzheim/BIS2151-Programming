package unit06;

import java.util.Scanner;

/**
 * Example class for a scanner implementation.
 *
 * @author Andreas Schneider
 */
public class ScannerExample
{

    public static void run()
    {
        // Scanner definition
        Scanner scan = new Scanner(System.in);

        // input is a string ( one word )
        // read by next() function
        String str1 = scan.next();

        // print String
        System.out.println("Entered String str1 : " + str1);

        // input is a String ( complete Sentence )
        // read by nextLine()function
        String str2 = scan.nextLine();

        // print string
        System.out.println("Entered String str2 : " + str2);

        // input is an Integer
        // read by nextInt() function
        int x = scan.nextInt();

        // print integer
        System.out.println("Entered Integer : " + x);

        // input is a floatingValue
        // read by nextFloat() function
        float f = scan.nextFloat();

        // print floating value
        System.out.println("Entered FloatValue : " + f);
    }
}
