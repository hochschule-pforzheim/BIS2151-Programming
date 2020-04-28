package dotcomgame;

public class DotComGame 
{    
    public static void main(String[] args)
    {
        int numberOfGuesses = 0; 
        GameHelper helper = new GameHelper(); 
        DotCom dotcom = new DotCom(); 

        int randomNumber = (int) (Math.random() * 5); 
        int[] locations = {randomNumber, randomNumber+1, randomNumber+2}; 
        dotcom.setLocations(locations);
        
        boolean isAlive = true; 
        
        while(isAlive)
        {
            String guess = helper.getUserInput("Bitte raten sie: "); 
            String result = dotcom.checkYourself(guess); 
            numberOfGuesses++; 
            if(result.equals("kill"))
            {
                isAlive = false; 
                System.out.println("Sie haben " + numberOfGuesses + " Versuche benötigt.");
            }
        }
    }
}
