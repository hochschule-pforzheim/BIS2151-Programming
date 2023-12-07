package unit08;

/**
 * Create Animals
 *
 * @author Andreas Schneider
 */
public class MakeAnimal
{

    static public void run()
    {
        Canine c = new Dog();
        c.roam();
        Dog doggy = (Dog) c;
        doggy.roam();
    }
}
