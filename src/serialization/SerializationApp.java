/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;

import java.util.ArrayList;

/**
 *
 * @author Ainz
 */
public class SerializationApp
{

    /**
     * Starts the serialization app with some demo content.
     *
     * @param args
     */
    public static void main(String[] args)
    {
        ArrayList<Participant> participants = new ArrayList<Participant>();
        participants.add(new Participant("Michael", "Mueller", 16));
        participants.add(new Participant("Tom", "Ford", 45));
        participants.add(new Participant("Lisa", "Mueller", 18));
        participants.add(new Participant("Hannah", "Schmidt", 20));

        System.out.println("Participants: " + participants);

        SerializationDemo demo = new SerializationDemo();
        demo.serialize(participants, "src/serialization/Participants.ser");

        System.out.println("Done.");

        ArrayList<Participant> newList = demo.deserialize("src/serialization/Participants.ser");
        System.out.println("New List: " + newList);
    }
}