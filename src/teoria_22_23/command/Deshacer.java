package teoria_22_23.command;

public class Deshacer implements Command {

    public Receiver receiver;
    public Character param;

    public Deshacer(Receiver r, Character p) {
        this.receiver = r;
        this.param = p;
    }

    @Override
    public void execute() {
        if (param.equals('D')) {
            // Deshacer
        }
    }
}
