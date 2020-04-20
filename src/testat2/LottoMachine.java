package testat2;

import java.util.ArrayList;
import java.util.Arrays;

public class LottoMachine {

    // Settings for all LottoMachines
    private static int numberAmount = 6;
    private static int minGeneratedNumber = 1;
    private static int maxGeneratedNumber = 49;

    // Instance Variables
    private int[] lottoNumbers = new int[numberAmount];

    // Methods
    public int[] getLottoNumbers() {
        return lottoNumbers;
    }

    public void resetLottoNumbers() {
        // Arrays.fill(lottoNumbers, 0); Much shorter Solution.
        for (int i = 0; i < lottoNumbers.length; i++)
            lottoNumbers[i] = 0;
    }

    private int generateRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min)) + 1;
    }

    public void makeOneNumber() {

        ArrayList<Integer> insertedNumbers = new ArrayList<Integer>();

        for (int i = 0; i < lottoNumbers.length; i++) {

            if (lottoNumbers[i] == 0) {
                int randomNumber;

                // Generate new Random Number while randomNumber is already inserted before.
                do {
                    randomNumber = generateRandomNumber(minGeneratedNumber, maxGeneratedNumber);
                } while (insertedNumbers.contains(randomNumber));

                lottoNumbers[i] = randomNumber;
                return; // Break the Loop after first inserting.

            } else {
                // Add already inserted Number to ArrayList.
                insertedNumbers.add(lottoNumbers[i]);
                // System.out.println(i + " already filled " + lottoNumbers[i]);
            }

        }

    }

    public void makeNewNumbers() {
        for (int i = 0; i < 6; i++)
            makeOneNumber();
    }

    @Override
    public String toString() {

        // Copy Array to not change the original lottoNumbers Array.
        int[] copiedArray = Arrays.copyOf(lottoNumbers, lottoNumbers.length);

        // Sort copied Array
        Arrays.sort(copiedArray);

        return "Actual LottoNumbers are: " + Arrays.toString(copiedArray);
    }
}
