package building;

/**
 * The Commercial interface represents commercial properties that are subject to
 * paying taxes. Classes implementing this interface must provide an
 * implementation for the payTaxes() method.
 *
 * @author Andreas Schneider
 */
public interface Commercial
{

    /**
     * Method to handle the payment of taxes for the commercial property.
     */
    public abstract void payTaxes();
}
