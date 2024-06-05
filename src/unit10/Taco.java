package unit10;

import java.io.Serializable;

/**
 * Serialization Example with "Taco"
 *
 * @author Andreas Schneider
 */
public class Taco implements Serializable
{

    private String tacoName;
    private double tacoPrice;

    private static int tacoCounter = 0;

    public Taco()
    {
        tacoCounter++;
    }

    public int getTacoCounter()
    {
        return tacoCounter;
    }

    public static int getTacoCounterStatic()
    {
        return tacoCounter;
    }

    public String getTacoName()
    {
        return tacoName;
    }

    public void setTacoName(String tacoName)
    {
        this.tacoName = tacoName;
    }

    public double getTacoPrice()
    {
        return tacoPrice;
    }

    public void setTacoPrice(double tacoPrice)
    {
        this.tacoPrice = tacoPrice;
    }

}
