package testat2.core;

/**
 *
 * @author Prof. Werner Burkard (@wernerburkard)
 */
public class Person
{

    private int personID;
    private String personName;
    private int personWeight;
    private double personSize;
    private double personBMI;

    public int getPersonID()
    {
        return personID;
    }

    public void setPersonID(int personID)
    {
        this.personID = personID;
    }

    public String getPersonName()
    {
        return personName;
    }

    public void setPersonName(String personName)
    {
        this.personName = personName;
    }

    public int getPersonWeight()
    {
        return personWeight;
    }

    public void setPersonWeight(int personWeight)
    {
        this.personWeight = personWeight;
    }

    public double getPersonSize()
    {
        return personSize;
    }

    public void setPersonSize(double personSize)
    {
        this.personSize = personSize;
    }

    public double getPersonBMI()
    {
        return personBMI;
    }

    public void setPersonBMI(double personBMI)
    {
        this.personBMI = personBMI;
    }

    @Override
    public String toString()
    {
        return "Person{" + "ID=" + personID + ", Name=" + personName + ", Weight=" + personWeight + ", Size=" + personSize + ", BMI=" + personBMI + '}';
    }

    void calculateBMI()
    {
        double aNewBMI = this.getPersonWeight() / (this.getPersonSize() * this.getPersonSize());
        // optimize it to have only 2 decimal digits
        aNewBMI *= 100;
        aNewBMI = Math.round(aNewBMI);  // eliminate decimal digits, but if it is over 0,5: add 1
        aNewBMI /= 100;
        setPersonBMI(aNewBMI);
    }
}
