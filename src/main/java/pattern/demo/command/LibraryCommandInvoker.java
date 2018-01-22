package pattern.demo.command;

import java.util.ArrayList;

public class LibraryCommandInvoker {
    private int lastCommand = -1;
    private ArrayList<Command> history = new ArrayList<>();

    public void executeCommand(Command lc) {
        lc.execute();
        history.add(lc);
        lastCommand = history.size() - 1;
    }

    public void redoNextCommand() {
        if (lastCommand < history.size() - 1) {
            lastCommand++;
            history.get(lastCommand).execute();
        }
    }

    public void undoLastCommand() {
        if (lastCommand >= 0) {
            history.get(lastCommand).undo();
            lastCommand--;
        }
    }
}
