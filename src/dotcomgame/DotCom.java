package dotcomgame;

public class DotCom 
{
    private int [] locationCells; 
    private int numOfHits = 0; 

    public int[] getLocations() {
        return locationCells;
    }

    public void setLocations(int[] locations) {
        this.locationCells = locations;
    }
    
    public String checkYourself(String userGuess)
    {
        int guess = Integer.parseInt(userGuess); 
        String result = "miss"; 
        
        for(int cell: locationCells)
        {
            if(guess == cell)
            {
                result = "hit"; 
                numOfHits++; 
                //hier fehlt noch etwas
                break; 
            }
        }
        
        if(numOfHits == locationCells.length)
        {
            result = "kill"; 
        }
        
        System.out.println(result);
        
        return result; 
    }
}
