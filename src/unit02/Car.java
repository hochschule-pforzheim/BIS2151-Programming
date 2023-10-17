package unit02;

/**
 * Sample class "car"
 *
 * @author Andreas Schneider
 */
class Car
{

    // Attributes or properties
    private String colour;
    private String model;

    // Constructor to initialize the object
    public Car(String colour, String model)
    {

        this.colour = colour;
        this.model = model;

    }

    // Method to start the car
    public void startEngine()
    {
        System.out.println("Engine started!");
    }

    // Method to stop the car
    public void stopEngine()
    {
        System.out.println("Engine stopped!");
    }

    public String getColour()
    {
        return colour;
    }

    public void setColour(String colour)
    {
        this.colour = colour;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }
}
