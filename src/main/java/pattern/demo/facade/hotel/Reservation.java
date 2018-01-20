package pattern.demo.facade.hotel;

public class Reservation {
    private Guest guest;
    private Room room;

    public Reservation (Room theRoom, Guest theGuest) {
        this.room = theRoom;
        this.guest = theGuest;
        HotelSearchService.getInstance().createReservation(this);
        System.out.println("Room " + theRoom.getRoomID() + " is booked by " + theGuest.getName() + ".");
    }

    public void cancel() {
        HotelSearchService.getInstance().cancelReservation(this);
        room.setAvailable(true);
    }

    public void update(Guest guest) {
        this.guest = guest;
        Reservation reservation = (Reservation)HotelSearchService.getInstance().getReservation(this.room);
        reservation.setGuest(guest);
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
