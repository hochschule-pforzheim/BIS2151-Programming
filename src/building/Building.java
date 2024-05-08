package building;

/**
 * The Building class represents a generic building with location, height, and
 * colour attributes. It serves as a superclass for specific types of buildings.
 *
 * @author Andreas Schneider
 */
public abstract class Building
{

    private String location;
    private double height;
    private String colour;

    /**
     * Constructs a Building object with the specified location, height, and
     * colour.
     *
     * @param location the location of the building
     * @param height the height of the building
     * @param colour the colour of the building
     */
    public Building(String location, double height, String colour)
    {
        this.location = location;
        this.height = height;
        this.colour = colour;
    }

    /**
     * Retrieves the location of the building.
     *
     * @return the location of the building
     */
    public String getLocation()
    {
        return location;
    }

    /**
     * Sets the location of the building.
     *
     * @param location the new location of the building
     */
    public void setLocation(String location)
    {
        this.location = location;
    }

    /**
     * Retrieves the height of the building.
     *
     * @return the height of the building
     */
    public double getHeight()
    {
        return height;
    }

    /**
     * Sets the height of the building.
     *
     * @param height the new height of the building
     */
    public void setHeight(double height)
    {
        this.height = height;
    }

    /**
     * Retrieves the colour of the building.
     *
     * @return the colour of the building
     */
    public String getColour()
    {
        return colour;
    }

    /**
     * Sets the colour of the building.
     *
     * @param colour the new colour of the building
     */
    public void setColour(String colour)
    {
        this.colour = colour;
    }

}
