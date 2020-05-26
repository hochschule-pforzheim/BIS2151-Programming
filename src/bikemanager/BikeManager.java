package bikemanager;

import java.util.ArrayList;
import java.util.Scanner;

public class BikeManager
{

    private final static ArrayList<Bike> BIKES = new ArrayList<Bike>();

    public static ArrayList getBIKES()
    {
        return BIKES;
    }

    public static void startBikeManager()
    {
        BikeTester.startTest();
        showMenu();
    }

    public static void createBike()
    {
        int givenID = 10;
        String givenDescription = "Superfast Bike 2020";
        double givenBikePrice = 599.0;

        BIKES.add(new Bike(givenID, givenDescription, givenBikePrice));
    }

    public static Bike readBike(int givenID)
    {
        for (Bike currentBike : BIKES)
        {
            if (currentBike.getBikeID() == givenID)
            {
                return currentBike;
            } else
            {
                System.out.println("The given ID has not been found! Please give an other value!");
            }
        }
        return null;
    }

    public static void updateBike()
    {
        int givenID = 10;
        String givenDescription = " Classic Bike";
        double givenBikePrice = 199.0;

        int index = BIKES.indexOf(readBike(givenID));
        BIKES.set(index, new Bike(givenID, givenDescription, givenBikePrice));

        /*for (Bike currentBike : BIKES)
        {
            if (currentBike.getBikeID() == givenID)
            {
                currentBike.setBikeID(newGivenID);
            }
        }*/
    }

    public static void deleteBike(int givenID)
    {
        BIKES.remove(readBike(givenID));
    }

    public static void showMenu()
    {
        System.out.println("Welcome to the bike e-shop. Please choose any functions:");
        System.out.println("(1) Create bike");
        System.out.println("(2) Read bike");
        System.out.println("(3) Update bike");
        System.out.println("(4) Delete bike");
        Scanner sc = new Scanner(System.in);
        System.out.printf("Make your selection: ");
        int newInput = (int) sc.nextInt();
        switch (newInput)
        {
            case 1:
                createBike();
                break;

            case 2:
                int givenID = (int) sc.nextInt();
                readBike(givenID);
                break;

            case 3:
                updateBike();
                break;

            case 4:
                int givenIDtoDelete = (int) sc.nextInt();
                deleteBike(givenIDtoDelete);
                break;

            default:
                System.out.println("Your selection is not valid. Closing the program.");
                System.exit(0);
                break;
        }
    }
}
