package dotcomgame;

public class DotComGame
{

    /**
     * Starts the DotComeGame and provides a dialog with the user.
     */
    public static void gameStart()
    {
        System.out.println("┌───────────────────────────────────────────┐");
        System.out.println("│               DOT-COM-GAME                │");
        System.out.println("└───────────────────────────────────────────┘");
        int numberOfGuesses = 0;
        GameHelper helper = new GameHelper();
        DotCom dotcom = new DotCom();

        int randomNumber = (int) (Math.random() * 5);
        int[] locations = { randomNumber, randomNumber + 1, randomNumber + 2 };
        dotcom.setLocations(locations);

        boolean isAlive = true;

        while (isAlive)
        {
            String guess = helper.getUserInput("Make a try: ");
            String result = dotcom.checkYourself(guess);
            numberOfGuesses++;
            if (result.equals("kill"))
            {
                isAlive = false;
                System.out.println("You took " + numberOfGuesses + " tries.");
            }
        }
    }
}
