package command;

public class Invoker {

    Command c;

    public Invoker() {
    }

    public void setCommand(Command c) {
        this.c = c;
    }

    public void buttonPressed() {
        this.c.execute();
    }

}


