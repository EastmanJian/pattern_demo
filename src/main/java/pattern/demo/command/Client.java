package pattern.demo.command;

public class Client {
    public void useLibrary () {
        Command checkIn1 = new CheckInCommand(new Patron("Endora"), new Resource("Noval"));
        Command checkIn2 = new CheckInCommand(new Patron("Violet"), new Resource("Kindal"));
        Command putOnHold = new PutOnHoldCommand(new Patron("Violet"), new Resource("Kindal"));
        Command checkOut1 = new CheckOutCommand(new Patron("Endora"), new Resource("Noval"));
        Command checkOut2 = new CheckOutCommand(new Patron("Violet"), new Resource("Kindal"));

        LibraryCommandInvoker cmdInvoker = new LibraryCommandInvoker();
        cmdInvoker.executeCommand(checkIn1);
        cmdInvoker.executeCommand(checkIn2);
        cmdInvoker.executeCommand(putOnHold);
        cmdInvoker.executeCommand(checkOut1);
        cmdInvoker.executeCommand(checkOut2);
        cmdInvoker.undoLastCommand();
        cmdInvoker.undoLastCommand();
        cmdInvoker.undoLastCommand();
        cmdInvoker.redoNextCommand();
    }
}
