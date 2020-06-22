/*
 * Task 5:
 * The following fully presented customer class is given:
 */
package examprep;

public class Customer
{

    private int cnr;
    private String name, location;
    private long revenue;

    public Customer(int c, String n, String l, long e)
    {
        this.cnr = c;
        this.name = n;
        this.location = l;
        this.revenue = e;
    }

    public String toString()
    {
        String text = "Customer " + this.cnr + ": " + this.name;
        text += "from " + this.location;
        text += " (Revenue: " + this.revenue + " €)";
        return text;
    }
}
