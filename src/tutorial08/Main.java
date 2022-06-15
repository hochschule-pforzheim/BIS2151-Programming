package tutorial08;

/**
 *
 * @author Pfäfflin
 */
public class Main {

    private static RoomManager theRoomManager = RoomManager.getInstance();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        theRoomManager.readList();

        Room r = new Room("Wirtschaftsinformatik", 20);

        theRoomManager.addRoom(r);

        Room r1 = new Room("Mathematik", 30);

        theRoomManager.addRoom(r1);

        theRoomManager.saveList();

        System.out.println(theRoomManager.getRooms());

    }

}
