package building;

/**
 * The Office class represents a type of building that serves as an office
 * space. It extends the Building class and implements the Commercial interface,
 * indicating that it is subject to paying taxes. This class encapsulates
 * information about the renter and the company occupying the office. It
 * provides methods to retrieve and update this information, as well as a method
 * to pay taxes. Offices are typically located in Pforzheim, have a default
 * height of 100, and are colored black.
 *
 * @author Andreas Schneider
 */
public class Office extends Building implements Commercial
{

    private String renter;
    private String company;

    /**
     * Constructs an Office object with the specified renter and company.
     * Default location is "Pforzheim", default height is 100, and default
     * colour is "Black".
     *
     * @param renter the name of the renter occupying the office
     * @param company the name of the company occupying the office
     */
    public Office(String renter, String company)
    {
        super("Pforzheim", 100, "Black");
        this.renter = renter;
        this.company = company;
    }

    /**
     * Retrieves the name of the renter occupying the office.
     *
     * @return the name of the renter
     */
    public String getRenter()
    {
        return renter;
    }

    /**
     * Sets the name of the renter occupying the office.
     *
     * @param renter the new name of the renter
     */
    public void setRenter(String renter)
    {
        this.renter = renter;
    }

    /**
     * Retrieves the name of the company occupying the office.
     *
     * @return the name of the company
     */
    public String getCompany()
    {
        return company;
    }

    /**
     * Sets the name of the company occupying the office.
     *
     * @param company the new name of the company
     */
    public void setCompany(String company)
    {
        this.company = company;
    }

    /**
     * Implements the payTaxes() method from the Commercial interface. Displays
     * a message indicating that taxes are being paid by the office.
     */
    @Override
    public void payTaxes()
    {
        System.out.println("Paying my taxes.");
    }

}
