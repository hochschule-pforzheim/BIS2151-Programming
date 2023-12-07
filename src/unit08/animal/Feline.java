package unit08.animal;

/**
 * Example abstract Feline Class
 *
 * @author Andreas Schneider
 */
abstract class Feline extends Animal
{

    @Override
    public void roam()
    {
        System.out.println("I am a Feline!");
    }
}
