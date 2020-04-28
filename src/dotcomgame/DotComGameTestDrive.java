package dotcomgame;

public class DotComGameTestDrive 
{
    public static void main(String[] args)
    {
        DotCom dotcmom = new DotCom(); 
        int[] locations = {2,3,4}; 
        dotcmom.setLocations(locations); 
        
        String userGuess = "2";
        String result = dotcmom.checkYourself(userGuess); 
        
        String testResult = "Test failed!";
        if(result.equals("hit")) testResult = "Test passed!"; 
        
        System.out.println(testResult);
    }
}
