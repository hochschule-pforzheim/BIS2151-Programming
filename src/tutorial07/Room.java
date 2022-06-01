/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial07;

import tutorial05.*;
import java.util.ArrayList;

/**
 *
 * @author Jascha Pfäfflin
 */
public class Room {

    private int roomID;
    private String description;
    private static int counter = 0;
    private int amtSeats;

    public Room(String description, int amtSeats) {
        this.roomID = ++counter;
        this.description = description;
        this.amtSeats = amtSeats;
    }

    public Room() {
        this.roomID = ++counter;
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
        return "Room mit ID: " + roomID + " hat die Beschreibung: " + description;
    }

}
