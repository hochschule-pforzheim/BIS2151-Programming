/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial05;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jascha Pfäfflin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s = new Student("Jascha", 4);
        Student s2 = new Student("Linus", 4);

        ArrayList<Student> sm = new ArrayList<>();

        sm.add(s);
        sm.add(s2);

        Room r = new Room("Wirtschaftsinformatik", sm);
        Room r2 = new Room("Informatik", sm);
        Room r3 = new Room("Wirtschaft", sm);
        
        Room r4 = new Room();
        r4.setDescription("Mathematik");
        r4.setStudents(sm);
        
        

        RoomManager rm = RoomManager.getInstance();

        rm.addRoom(r);
        rm.addRoom(r2);
        rm.addRoom(r3);
        rm.addRoom(r4);

        System.out.println(rm.readRooms());

        Scanner keyboard = new Scanner(System.in);

        System.out.print("ID zum Updaten eingeben: ");
        String input = keyboard.nextLine();

        while (!checkInput(input)) {
            System.out.print("ID zum Updaten eingeben: ");
            input = keyboard.nextLine();
        }

        int id = Integer.parseInt(input);

        //rm.deleteRoomID(id);


            System.out.print("Neue Description eingeben: ");
            String newDescription = keyboard.nextLine();
            
            rm.updateDescription(id, newDescription);
            

        System.out.println(rm.readRooms());

    }

    private static boolean checkInput(String input) {
        try {
            int output = Integer.parseInt(input);
            if (output <= 0) {
                return false;
            }

            return true;

        } catch (NumberFormatException ex) {
            return false;
        }
    }

}
