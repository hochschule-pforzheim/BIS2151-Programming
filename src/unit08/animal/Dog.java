package unit08.animal;


/**
 * Subclass Dog
 *
 * @author Andreas Schneider
 */
public class Dog extends Canine
{

    /**
     * Overriding roam
     */
    @Override
    public void roam()
    {
        System.out.println("Roaming in a group as a dog!");
    }
    
    public void roamLikeACanine()
    {
        super.roam();
    }
}
