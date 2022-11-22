package teoria_22_23.command;


public class Invoker {

    History history;

    public Invoker() {
        history = new History();
    }

    public void setCommand(Command c) {
        this.history.add(c);
    }

    public void undoCommand() {
        this.history.removeLast();
    }

    public void ejecutar() {
        history.startExecution();
    }

}
