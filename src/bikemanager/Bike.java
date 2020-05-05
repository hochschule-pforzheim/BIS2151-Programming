package bikemanager;

public class Bike
{

    private int bikeID;
    private String description;
    private double bikePrice;

    public Bike(int bikeID, String description, double bikePrice)
    {
        this.bikeID = bikeID;
        this.description = description;
        this.bikePrice = bikePrice;
    }

    public static void printSomething()
    {
        System.out.println("Hello!");
    }

    public int getBikeID()
    {
        return bikeID;
    }

    public void setBikeID(int bikeID)
    {
        this.bikeID = bikeID;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public double getBikePrice()
    {
        return bikePrice;
    }

    public void setBikePrice(double bikePrice)
    {
        this.bikePrice = bikePrice;
    }

    @Override
    public String toString()
    {
        return this.getBikeID() + " " + this.getDescription() + " " + this.getBikePrice() + " €";
    }
    
}
