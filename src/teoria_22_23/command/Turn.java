package teoria_22_23.command;

public class Turn implements Command {

    public Receiver receiver;
    public Character param;

    public Turn(Receiver r, Character p) {
        this.receiver = r;
        this.param = p;
    }

    @Override
    public void execute() {
        if (param.equals('L')) {
            System.out.println("Turning left");
        } else if (param.equals('R')) {
            System.out.println("Turning right");
        }
    }
}
