package testat2.core;

/**
 *
 * @author Prof. Werner Burkard (@wernerburkard)
 */
public class PersonManager
{

    // A person manager stores all persons to manage in an array 
    private int maxPersons = 5;
    private Person[] personStore = new Person[maxPersons];
    // there is also a counter to use, so that a persons ID is always unique
    private int nextID = 1;

    public Person[] getPersonStore()
    {
        return personStore;
    }

    // a method to create another person in the store
    public Person addPerson(String inputName, int weight, double size)
    {
        Person theNewPerson;
        int place;  // the place in the store

        // First we check in the store to find the first free place
        place = 0;
        while (personStore[place] != null)
        { // this place is already in use!
            place++;
            if (place == personStore.length) // we reached the end of the store!
            // there was no free place to store a new person!
            {
                return null; // indicate this problem to our caller
            }
        }

        // Okay a free plave is found!
        // let us create the new person:
        theNewPerson = new Person();
        // We now setup the persons attributes:
        theNewPerson.setPersonID(nextID);
        nextID++;  // increase that value for a person to add next time...
        theNewPerson.setPersonName(inputName);
        theNewPerson.setPersonWeight(weight);
        theNewPerson.setPersonSize(size);
        theNewPerson.calculateBMI();  // sets the persons BMI according its weight and size

        // Insert this new person object into our store at the found position
        personStore[place] = theNewPerson;
        // return a link to that person to our caller
        return theNewPerson;
    }

    // a method that returns true, if a text is a bad name for a person
    public boolean isBadName(String aText)
    {
        String badCharacters = "?\"!§$%&=?<>|;:,.#+*";  //some bad characters

        // if aText does even not really exist, we say bad!
        if (aText == null)
        {
            return true;
        }
        else
        {
            // there is really a String! 
            // So we delete leading and trailing spaces if they should exist...
            aText = aText.trim();
        }
        // if aText is empty now, we again say bad!  (Empty name? How stupid!
        if (aText.isEmpty())
        {
            return true;
        }

        // check if one of the bad characters are inside the theNameValue
        for (int i = 0; i < badCharacters.length(); i++)
        { // for each bad character
            if (aText.contains(badCharacters.substring(i, i + 1)))
            {
                return true;  // bad character found: so again we say: bad
            }
        }
        // All checks are done and no error was found, great!
        return false; // return false because aText is okay for a persons name
    }

    // a method that returns true, if a weight is bad for a person
    public boolean isBadWeight(int aWeight)
    {
        // a weight below  30 or over 250 kg is never okay for an adult person!!

        if (aWeight < 30)
        {
            return true;
        }

        if (aWeight > 250)
        {
            return true;
        }

        // All checks are done and no error was found, great!
        return false; // return false because weight is not bad
    }

    // a method that returns true, if a size is bad for a person
    public boolean isBadSize(double theSize)
    {
        // a size of 1.25 or below or over 2.5m is not okay for an adult person
        if (theSize <= 1.25 || theSize > 2.5)
        {
            return true;  // Yes, this size is bad
        }
        // all is fine, so:
        return false;
    }

    public Person getPerson(int personID)
    {
        Person theNewPerson;
        int place;  // the place in the store

        // We check the store to find the person with this ID
        place = findPlaceOfPerson(personID);
        if (place < 0)
        { // no such person is in our store!
            return null; // we could not find such a person!
        }
        // Okay we got the person:
        return personStore[place];
    }

    public boolean deletePerson(int personID)
    {
        int place;  // the place in the store

        // We check the store to find the place of person with this ID
        place = findPlaceOfPerson(personID);
        if (place < 0)
        { // no such person is in our store!
            return false; // we could not remove such a person!
        }
        // Okay we got the place and will now remove the person:
        personStore[place] = null;
        return true; // because we could delete that person
    }

    // find the place where a person is located in the store
    private int findPlaceOfPerson(int personID)
    {
        int place = 0;  // the place in the store

        // We search the store to find the place of a person with this ID
        while (place < personStore.length)
        {  // we scan the whole store
            if (personStore[place] != null)
            {  // there is a person located
                if (personStore[place].getPersonID() == personID)
                {
                    // Okay found! Person has this ID!
                    return place;
                }
            }
            place++; // Go on to next place in store
        }
        // we reached the end of the store and
        // there was no entry with this person ID!
        return -1; //  indicates we could not find such a person!
    }
}
