package teoria_21_22.command;

public class Turn implements Command {

    public Receiver receiver;
    public Character param;

    public Turn(Receiver receiver, Character param) {
        this.receiver = receiver;
        this.param = param;
    }

    @Override
    public void execute() {

        if (param.equals('L')) {
            System.out.println("Turning left");
            System.out.println("Done.");
        } else if (param.equals('R')) {
            System.out.println("Turning right");
            System.out.println("Done.");
        }

    }

}
