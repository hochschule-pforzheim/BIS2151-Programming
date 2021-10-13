package tutorial04;

/**
 * This class manages the bikes.
 *
 * @author ainzone
 */
public class BikeTester
{

    public static void main(String[] args)
    {
        printAllBikes();
    }

    public static void printAllBikes()
    {
        Bike bikeOne = new Bike();
        Bike bikeTwo = new Bike("This is a bike with description.");
        Bike bikeThree = new Bike("This bike has a decription and price", 325.0);

        bikeOne.printBike();
        bikeTwo.printBike();
        bikeThree.printBike();
    }
}
