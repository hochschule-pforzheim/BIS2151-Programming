package unit08;

/**
 * Create Canine Class
 *
 * @author Andreas Schneider
 */
public class MakeCanine
{

    public void run()
    {
        Canine c;
        c = new Dog();
        // Class Canine is marked abstract, 
        // so the compiler will NOT let you do this
        // c = new Canine();
        c.roam();
    }
}
