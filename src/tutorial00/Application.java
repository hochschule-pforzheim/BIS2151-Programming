package tutorial00;

import java.util.Scanner;

/**
 *
 * @author Pfäfflin
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World!");
        int age = 21;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Bitte Namen eingeben: ");
        String input = keyboard.nextLine();
        
        int num = Integer.parseInt(input);
        
        System.out.println((num + 5));
        
        ausgeben(age, 75.5, "Jascha");
        //boolean test = check(-5);
        
        check(-5);
        


    }

    public static void ausgeben(int age, double mass, String name) {
        System.out.println(age);
        System.out.println(mass);
        System.out.println(name);
    }

    public static void check(int num) {
        if(num > 0) {
            System.out.println("Die Zahl ist zulässig!");
        } else {
            System.out.println("Die Zahl ist nicht zulässig");
        }
    }
}
