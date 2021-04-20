package tutorial04;

/**
 * This class describes the object bike.
 *
 * @author ainzone
 */
public class Bike
{

    private int bikeID;
    private String description;
    private double bikePrice;
    private int counter = 1;

    public Bike(String description, double bikePrice)
    {
        this.bikeID = counter;
        this.description = description;
        this.bikePrice = bikePrice;
        counter++;
    }

    public Bike(String description)
    {
        this.bikeID = counter;
        this.description = description;
        counter++;
    }

    public Bike()
    {
        this.bikeID = counter;
        counter++;
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

    public int getCounter()
    {
        return counter;
    }

    public void setCounter(int counter)
    {
        this.counter = counter;
    }

    public void printBike()
    {
        System.out.println("Bike: " + this.bikeID + "\n Description: "
                + this.description + "\n Price: " + this.bikePrice);
    }

}
