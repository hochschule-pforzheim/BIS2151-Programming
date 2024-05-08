package building;

/**
 * The House class represents a type of building that is a house, typically used
 * for residential purposes. It extends the Building class and inherits its
 * location, height, and colour attributes.
 *
 * @author Andreas Schneider
 */
public class House extends Building
{

    /**
     * Constructs a House object with the specified location, height, and colour
     * using the constructor of Building.
     *
     * @param location the location of the house
     * @param height the height of the house
     * @param colour the colour of the house
     */
    public House(String location, double height, String colour)
    {
        super(location, height, colour);
    }

}
