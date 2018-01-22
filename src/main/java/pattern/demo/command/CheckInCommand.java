package pattern.demo.command;

public class CheckInCommand implements Command{
    private Resource item;
    private Patron thePatron;

    public CheckInCommand(Patron p, Resource r) {
        this.item = r;
        this.thePatron = p;
    }

    public void execute() {
        System.out.println("Patron " + thePatron + " execute CheckIn Command on resource " + item + "...");
    }

    public void undo() {
        System.out.println("Patron " + thePatron + " undo CheckIn Command on resource " + item + "...");
    }
}
