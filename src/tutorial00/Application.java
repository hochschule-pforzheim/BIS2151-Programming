package tutorial00;

import java.util.Scanner;

/**
 *
 * @author Pfäfflin
 */
public class Application {

    // Ein Objekt vom Typ Scanner wird erstellt (keyword: "new"!) und wird referiert von unserer Variable "keyboard"
    // Definierung als Instanzvariable, dadurch können alle Methoden auf diese Variable zugreifen
    public static Scanner keyboard = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World!");

        // Variable mit Namen "age" vom Typ Integer wird dem Wert 21 zugewiesen
        int age = 21;

        System.out.print("Bitte Namen eingeben: ");

        // Wir rufen eine Methode des Scannerobjekts auf, die den nächsten Input des Users in der String Variable input speichert
        String input = keyboard.nextLine();

        // Der erhaltene input wird zu einer Integer Variable geparsed, dadürch können mit ihr kalkuliert werden
        int num = Integer.parseInt(input);

        System.out.println((num + 5));

        // Wir rufen unsere eigene Methode "ausgeben(int age, double mass, String name)" auf und übergeben ihr, die benötigten Argumente
        ausgeben(age, 75.5, "Jascha");
        //boolean test = check(-5);

        // Wir rufen unsere eigene Methode "check(int num)" auf und erfahren ob unsere Zahl zulässig ist oder nicht
        check(-5);

        String licensePlate = "AB-VP-800";

    }

    /**
     * Nimmt die 3 Parameter und gibt sie in der Konsole aus
     *
     * @param age eingegebenes Alter
     * @param mass eingebene Masse
     * @param name eingegebener Name
     */
    public static void ausgeben(int age, double mass, String name) {
        System.out.println("Bitte Name eingeben: ");
        name = keyboard.nextLine();
        System.out.println(age);
        System.out.println(mass);
        System.out.println(name);
    }

    /**
     * Nimmt den Parameter num und checkt ob er größer als 0 ist oder nicht
     *
     * @param num diese Zahl soll gecheckt werden
     */
    public static void check(int num) {

        // Wenn die Zahl größer als 0 ist
        if (num > 0) { // Dann geben Wir aus, dass die Zahl zulässig ist
            System.out.println("Die Zahl ist zulässig!");
        } else { // Sonst geben Wir aus, dass die Zahl nicht zulässig ist
            System.out.println("Die Zahl ist nicht zulässig");
        }
    }
}
