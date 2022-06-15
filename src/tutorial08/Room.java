/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial08;

import java.io.Serializable;

/**
 *
 * @author Pfäfflin
 */
public class Room implements Serializable {

    private static RoomManager theRoomManager = RoomManager.getInstance();
    private int roomID;
    private String description;
    private int amtSeats;

    public Room(String description, int amtSeats) {

        if (theRoomManager.getRooms().isEmpty()) {
            this.roomID = 1;
        } else {
            this.roomID = theRoomManager.getRooms().get(theRoomManager.getRooms().size() - 1).getRoomID() + 1;
        }

        this.description = description;
        this.amtSeats = amtSeats;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmtSeats() {
        return amtSeats;
    }

    public void setAmtSeats(int amtSeats) {
        this.amtSeats = amtSeats;
    }

    @Override
    public String toString() {
        return "Room{" + "roomID=" + roomID + ", description=" + description + ", amtSeats=" + amtSeats + '}';
    }

}
