package pattern.demo.proxy;

public class Client {
    public void displayRoomImage () {
        RoomTypeImage roomImage = new ProxyRoomTypeImage("A101");
        byte[][] image = roomImage.getImage();
        long size = roomImage.getSize();

        //codes to display the image below
    }
}
