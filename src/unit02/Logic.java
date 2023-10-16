package unit02;

/**
 * Creating objects of the Car class
 *
 * @author Andreas Schneider
 */
public class Logic
{

    public static void main(String[] args)
    {
        // Creating two Car objects
        Car car1 = new Car("Red", "Sedan");
        Car car2 = new Car("Blue", "SUV");

        // Accessing object properties and methods
        System.out.println("Car 1 Color: " + car1.colour);
        System.out.println("Car 2 Model: " + car2.model);

        car1.startEngine();
        car2.stopEngine();
    }
}
