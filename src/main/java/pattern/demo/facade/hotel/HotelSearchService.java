package pattern.demo.facade.hotel;

import java.util.ArrayList;
import java.util.HashMap;

public class HotelSearchService {
    private Room[] rooms;
    private HashMap<String, Reservation> reservations = new HashMap<>(); //this demo allows one reservation for one room only
    static private HotelSearchService service;

    private HotelSearchService (Room[] rooms) {
        this.rooms =rooms;
    }

    static public HotelSearchService getInstance () {
        if (service == null) {
            Room[] rooms = {
                    new Room("A101"),
                    new Room("A102"),
                    new Room("A201"),
                    new Room("A202"),
                    new Room("B101")
            };
            service = new HotelSearchService (rooms);
            System.out.println("Hotel Search Service Created.");
        }
        return service;
    }

    public Room[] findRooms() {
        ArrayList<Room> availableRooms = new ArrayList<>();
        for (int i=0; i<rooms.length; i++) {
            if (rooms[i].isAvailable()) {
                availableRooms.add(rooms[i]);
                System.out.println("Room " + rooms[i].getRoomID() + " is available.");
            }
        }

        return availableRooms.toArray(new Room[0]);
    }

    void createReservation (Reservation reservation) {
        reservations.put(reservation.getRoom().getRoomID(), reservation);
    }

    void cancelReservation (Reservation reservation) {
        reservations.remove(reservation.getRoom());
    }

    Reservation getReservation (Room room) {
        return reservations.get(room);
    }
}
