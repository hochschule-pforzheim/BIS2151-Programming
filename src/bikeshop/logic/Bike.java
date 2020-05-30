package bikeshop.logic;

/**
 * @version 1.0
 * @author ainz.one
 */
public class Bike
{

    private int bikeID;
    private String bikeDescription;
    private double bikePrice;
    private static int counter = 1;

    public Bike(String bikeDescription, double bikePrice)
    {
        this.bikeID = counter;
        this.bikeDescription = bikeDescription;
        this.bikePrice = bikePrice;
        counter++;
    }

    public int getBikeID()
    {
        return bikeID;
    }

    public void setBikeID(int bikeID)
    {
        this.bikeID = bikeID;
    }

    public String getBikeDescription()
    {
        return bikeDescription;
    }

    public void setBikeDescription(String bikeDescription)
    {
        this.bikeDescription = bikeDescription;
    }

    public double getBikePrice()
    {
        return bikePrice;
    }

    public void setBikePrice(double bikePrice)
    {
        this.bikePrice = bikePrice;
    }

}
