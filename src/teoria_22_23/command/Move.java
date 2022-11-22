package teoria_22_23.command;

public class Move implements Command {

    public Receiver receiver;
    public Character param;

    public Move(Receiver r, Character p) {
        this.receiver = r;
        this.param = p;
    }

    @Override
    public void execute() {
        if (param.equals('F')) {
            System.out.println("Moving forward");
        } else if (param.equals('B')) {
            System.out.println("Moving backwards");
        }
    }

}
