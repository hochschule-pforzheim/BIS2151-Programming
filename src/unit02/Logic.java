package unit02;

/**
 * Creating objects of the Car class
 *
 * @author Andreas Schneider
 */
public class Logic
{

    public static void run(String[] args)
    {
        Car newCar = new Car("White", "Sedan");

        System.out.println(newCar.getColour());
        System.out.println(newCar.getModel());

        // Repainting the car
        newCar.setColour("Red");
        System.out.printf("New Colour: ");
        System.out.printf(newCar.getColour());

        for (int control = 10; control > 0; control--) {
            System.out.println("Iteration: " + control);
        }

        Table table1 = new Table("red");

        table1.colour = "red";

        // Creating two Car objects
        Car car1 = new Car("Red", "Sedan");
        Car car2 = new Car("Blue", "SUV");

        // Accessing object properties and methods
        System.out.println("Car 1 Color: " + car1.getColour());
        System.out.println("Car 2 Model: " + car2.getModel());

        car1.startEngine();
        car2.stopEngine();
    }
}
