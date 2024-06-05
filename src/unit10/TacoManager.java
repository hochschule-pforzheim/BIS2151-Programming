package unit10;

/**
 * Manager Class for Tacos
 *
 * @author Andreas Schneider
 */
public class TacoManager
{

    // Static Tacos for general use
    static Taco tacoOne = new Taco();
    static Taco tacoTwo = new Taco();
    static Taco tacoThree = new Taco();

    public static void run()
    {

        tacoInfo();

        Taco tacoFour = new Taco();
        tacoFour.setTacoName("Premium");
        tacoFour.setTacoPrice(6.50);

        tacoInfo();
        System.out.println(TacoPersistency.serializeTaco(tacoFour));

        Taco newTacoFour = TacoPersistency.deSerializeTaco();
        System.out.println("Class of new taco is: " + newTacoFour.getClass());
        System.out.println(newTacoFour.getTacoName());

    }

    public static void tacoInfo()
    {
        System.out.println("Amount of tacos is: " + Taco.getTacoCounterStatic());

        System.out.println("Amount of tacos is: " + tacoOne.getTacoCounter());
    }
}
