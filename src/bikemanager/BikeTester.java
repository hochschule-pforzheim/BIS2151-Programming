package bikemanager;

public class BikeTester
{

    public static void startTest()
    {
        Bike testBike = new Bike(1, "Super Test Bike", 250.0);
        System.out.println(testBike.toString());
    }
}
