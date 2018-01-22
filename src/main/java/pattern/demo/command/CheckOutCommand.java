package pattern.demo.command;

public class CheckOutCommand implements Command{
    private Resource item;
    private Patron thePatron;

    public CheckOutCommand(Patron p, Resource r) {
        this.item = r;
        this.thePatron = p;
    }

    public void execute() {
        System.out.println("Patron " + thePatron + " execute CheckOut Command on resource " + item + "...");
    }

    public void undo() {
        System.out.println("Patron " + thePatron + " undo CheckOut Command on resource " + item + "...");
    }
}
