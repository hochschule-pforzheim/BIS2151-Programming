package building;

/**
 * The Flat class represents a type of building that is a flat, typically used
 * for residential purposes. It extends the Building class and inherits its
 * location, height, and colour attributes.
 *
 * @author Andreas Schneider
 */
public class Flat extends Building
{

    /**
     * Constructs a Flat object with the specified location, height, and colour
     * using the constructor of class Building.
     *
     * @param location the location of the flat
     * @param height the height of the flat
     * @param colour the colour of the flat
     */
    public Flat(String location, double height, String colour)
    {
        super(location, height, colour);
    }

}
