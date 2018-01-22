package pattern.demo.command;

public class PutOnHoldCommand implements Command{
    private Resource item;
    private Patron thePatron;

    public PutOnHoldCommand(Patron p, Resource r) {
        this.item = r;
        this.thePatron = p;
    }

    public void execute() {
        System.out.println("Patron " + thePatron + " execute PutOnHold Command on resource " + item + "...");
    }

    public void undo() {
        System.out.println("Patron " + thePatron + " undo PutOnHold Command on resource " + item + "...");
    }
}
