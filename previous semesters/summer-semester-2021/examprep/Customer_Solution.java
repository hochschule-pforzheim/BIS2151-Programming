/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examprep;

/**
 *
 * @author Jonathan Hinkel
 */
public class Customer_Solution
{

    //SOLUTION FOR TASK 7
    public static int amountOfCustomers;

    private int cnr;
    private String name, location;
    private long revenue;

    public Customer_Solution(int c, String n, String l, long e)
    {
        this.cnr = c;
        this.name = n;
        this.location = l;
        this.revenue = e;
        amountOfCustomers++;
    }

    @Override
    public String toString()
    {
        String text = "Customer " + this.cnr + ": " + this.name;
        text += "from " + this.location;
        text += " (Revenue: " + this.revenue + " €)";
        return text;
    }

    //SOLUTION FOR TASK 6
    @Override
    public boolean equals(Object o)
    {
        if (o == null || !(o instanceof Customer))
        {
            return false;
        }
        else
        {
            return ((Customer) o).getCnr() == this.cnr;
        }
    }

    public int getCnr()
    {
        return cnr;
    }

    public void setCnr(int cnr)
    {
        this.cnr = cnr;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public long getRevenue()
    {
        return revenue;
    }

    public void setRevenue(long revenue)
    {
        this.revenue = revenue;
    }
}
