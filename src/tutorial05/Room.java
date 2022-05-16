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
public class Room {

    private int roomID;
    private String description;
    private ArrayList<Student> students;
    private static int counter = 0;

    public Room(String description, ArrayList<Student> students) {
        this.roomID = ++counter;
        this.description = description;
        this.students = students;
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

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    private String returnStudents() {
        String output = "";
        for (Student s : students) {
            output += s.toString() + "\n";
        }
        return output;
    }

    @Override
    public String toString() {
        return "Room mit ID: "+ roomID + " hat die Beschreibung: " + description + " beinhaltet diese Studenten: \n" + this.returnStudents();
    }

}
