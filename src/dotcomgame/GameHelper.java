package dotcomgame;

import java.util.Scanner;

public class GameHelper 
{
    public String getUserInput(String message)
    {
        Scanner scan = new Scanner(System.in); 
        String input = ""; 
        boolean validInput = false; 
        while(!validInput)
        {
            System.out.print(message);
            input = scan.next(); 
            try
            {
                int i = Integer.parseInt(input); 
                validInput = true; 
            }
            catch(NumberFormatException ex)
            {
                System.out.println("Bitte eine Zahl eingeben.");
            }
        }
        return input; 
    }
}
