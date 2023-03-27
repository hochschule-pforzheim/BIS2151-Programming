package testat2.userInterface;

/**
 * @author Prof. Werner Burkard (@wernerburkard)
 */
public class BMICalculatorSS23withObjects
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {

        // make a UserManager object
        UserManager theManager = new UserManager();

        // inform theManager about input of start parameters
        theManager.takeInput(args);

        // tell theManager to start it's job
        //theManager.go();
        //theManager.goOptimized();
        theManager.goMenu();
    }
}
