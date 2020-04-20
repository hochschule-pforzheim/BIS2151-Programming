package testat2;

import java.util.Arrays;

public class LottoMachineTester {

    public static void main(String[] args) {

        // Lets Create a new lottoMachine
        LottoMachine lottoMachine = new LottoMachine();

        // Lets test our LottoMachine Implementation
        System.out.println("At Start our LottoMachine is Empty: " + lottoMachine);

        System.out.println("\nLets use makeOneNumber();");
        lottoMachine.makeOneNumber();
        System.out.println("Now our LottoMachine is filled with : " + getLottoMachineArrayString(lottoMachine));
        System.out.println("Lets use makeOneNumber() again");
        lottoMachine.makeOneNumber();
        System.out.println("Now our LottoMachine is filled with : " + getLottoMachineArrayString(lottoMachine));

        System.out.println("\nLets reset the LottoMachine for a new Customer");
        lottoMachine.resetLottoNumbers();
        System.out.println("Now our LottoMachine is empty again: " + lottoMachine);

        System.out.println("\nLets use makeNewNumbers();");
        lottoMachine.makeNewNumbers();
        System.out.println("Now our LottoMachine is filled with unique Numbers");
        System.out.println("The Array lottoNumbers is filled with: " + getLottoMachineArrayString(lottoMachine));

        System.out.println("\nLets use toString();");
        System.out.println(lottoMachine.toString());
        System.out.println("As you can see Numbers are sorted thanks to our toString() implementation");
    }

    public static String getLottoMachineArrayString(LottoMachine lottoMachine) {
        return Arrays.toString(lottoMachine.getLottoNumbers());
    }

}
