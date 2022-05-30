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
    private static RoomManager theRoomManager;

    private RoomManager() {
    }

    public static RoomManager getInstance() {
        if (theRoomManager == null) {
            theRoomManager = new RoomManager();
        }
        return theRoomManager;
    }

    /**
     *
     * @param room der Raum, der zur Liste hinzugefügt werden soll
     */
    public void addRoom(Room room) {
        rooms.add(room);
    }

    /**
     * Zeigt alle Räume an
     *
     * @return String mit Liste aller Räumen
     */
    public String readRooms() {
        String output = "";

        /*
        for (int i = 0; i < rooms.size(); i++) {
            output += rooms.get(i).toString() + "\n";
        }
         */
        for (Room r : rooms) {
            output += r.toString() + "\n";
        }

        return output;
    }

    public void deleteRoomIndex(int index) {
        rooms.remove(index); // nach index
    }

    public void deleteRoomID(int id) {
        Room r = findRoom(id);
        if (r != null) {
            rooms.remove(r); // nach Objekt
        }
    }

    public Room findRoom(int id) {
        for (Room r : rooms) {
            if (r.getRoomID() == id) {
                return r;
            }
        }
        return null;
    }

    public void updateDescription(int id, String input) {
        Room r = findRoom(id);
        System.out.println("Alte Description: " + r.getDescription());

        if (r != null) {
            r.setDescription(input);
        }
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

}
