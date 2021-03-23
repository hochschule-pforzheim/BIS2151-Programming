package tutorial8.logic;

import tutorial8.logic.Bike;
import java.util.ArrayList;

/**
 * @version 1.0
 * @author ainz.one
 */
public class BikeManager
{

    private final static ArrayList<Bike> BIKES = new ArrayList<Bike>();

    public static ArrayList getBIKES()
    {
        return BIKES;
    }
}
