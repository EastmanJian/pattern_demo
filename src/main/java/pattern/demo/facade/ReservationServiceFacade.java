package pattern.demo.facade;

import pattern.demo.facade.hotel.Guest;
import pattern.demo.facade.hotel.HotelSearchService;
import pattern.demo.facade.hotel.Reservation;
import pattern.demo.facade.hotel.Room;

public class ReservationServiceFacade {
    public String makeReservation (String guestName, String guestTel) throws Exception {
        HotelSearchService hss = HotelSearchService.getInstance();
        Room[] roomsAvailable = hss.findRooms();
        if (roomsAvailable.length == 0) throw new Exception("All the rooms are booked.");
        Room theRoom = roomsAvailable[0]; //choose room
        theRoom.updateStatus(false);
        Guest theGuest = new Guest();
        theGuest.updateProfile(guestName, guestTel);
        Reservation reservation = new Reservation(theRoom, theGuest);
        return reservation.getRoom().getRoomID();
    }

    public void cancelReservation(String roomID) {
        //implementation of cancel reserviation
    }

    public String findRoom() {
        String roomID ="";
        //implementation of find room

        return roomID;
    }

    public void modifyReservation (String roomID, String guestName, String guestTel) {
        //implementation of modify reservation
    }

}
