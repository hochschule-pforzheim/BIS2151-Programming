/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial05;

import java.util.ArrayList;

/**
 *
 * @author Jascha Pfäfflin
 */
public class RoomManager {

    private ArrayList<Room> rooms = new ArrayList<>();

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public String readRooms() {
        String output = "";

        for (int i = 0; i < rooms.size(); i++) {
            output += rooms.get(i).toString() + "\n";
        }

        for (Room r : rooms) {
            output += r.toString();
        }

        return output;
    }
}
