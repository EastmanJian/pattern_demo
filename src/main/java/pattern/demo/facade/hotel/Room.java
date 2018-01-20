package pattern.demo.facade.hotel;

public class Room {
    private String roomID;
    private boolean available = true;

    public Room(String roomID) {
        this.roomID = roomID;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void issueWakeUpCall() {
        System.out.println("Room " + roomID + " issues wake up call.");
    }

    public void updateStatus(boolean available) {
        this.available = available;
        System.out.println("Update room "+ this.roomID +" available status to " + available);
    }
}
