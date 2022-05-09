/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial05;

import java.util.ArrayList;

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

        RoomManager rm = new RoomManager();

        rm.addRoom(r);
        rm.addRoom(r2);
        rm.addRoom(r3);

        System.out.println(rm.readRooms());
    }

}
