package pattern.demo.proxy;

/**
 * Proxy Pattern
 */
public class ProxyRoomTypeImage implements RoomTypeImage {
    private RoomTypeImage realImage;
    private String roomID;

    public ProxyRoomTypeImage(String roomID) {
        System.out.println("ProxyRoomTypeImage created.");
        this.roomID = roomID;
    }

    public byte[][] getImage() {
        System.out.println("Proxy getImage()");
        if (realImage == null)
            realImage = new ActualRoomTypeImage(roomID); //create the image when it's actually required.
        return realImage.getImage();
    }

    public long getSize() {
        System.out.println("Proxy getSize()");
        long size;
        if (realImage == null) {
            realImage = new ActualRoomTypeImage(roomID); //create the image when it's actually required.
        }
        return realImage.getSize();
    }
}
