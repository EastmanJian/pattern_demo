package pattern.demo.proxy;

public class ActualRoomTypeImage implements RoomTypeImage {
    private byte[][] image;

    public ActualRoomTypeImage(String roomID) {
        byte[][] image = {{'1', '2', '3'}, {'6', '9', '6'}}; //dummy image
        try {
            Thread.sleep(200); //delay some time to simulate heavy loading of the the image
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.image = image;
        System.out.println("Actual image is loaded for room " + roomID + ".");
    }

    public byte[][] getImage() {
        System.out.println("ActualRoomTypeImage.getImage()");
        return this.image;
    }

    public long getSize() {
        System.out.println("ActualRoomTypeImage.getSize()");
        return this.image.length * this.image[0].length;
    }

}
