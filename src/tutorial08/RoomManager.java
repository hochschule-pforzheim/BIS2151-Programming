/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pfäfflin
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

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void saveList() {
        try {
            new ObjectOutputStream(new FileOutputStream("Rooms.ser")).writeObject(rooms);
        } catch (FileNotFoundException ex) {
            System.out.println("File not Found!");
        } catch (IOException ex) {
            System.out.println("Input/Output Error!");
        }
    }

    public void readList() {
        try {
            this.rooms = (ArrayList<Room>) new ObjectInputStream(new FileInputStream("Rooms.ser")).readObject();
        } catch (FileNotFoundException ex) {
            System.out.println("File not Found!");
        } catch (IOException ex) {
            System.out.println("Input/Output Error!");
        } catch (ClassNotFoundException ex) {
            System.out.println("Class not Found!");
        }
    }

    public void addRoom(Room r) {
        this.rooms.add(r);
    }
}
