package teoria_22_23.command;

import java.util.ArrayList;

public class History {
    public ArrayList<Command> history;

    public History() {
        history = new ArrayList<>();
    }

    void add(Command c) {
        history.add(c);
    }

    void removeLast() {
        history.remove(history.size()-1);
    }

    void startExecution() {
        for (Command elem : history) elem.execute();
    }
}
