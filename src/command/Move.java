package command;

public class Move implements Command {

    public Receiver receiver;
    public Character param;

    public Move(Receiver receiver, Character param) {
        this.receiver = receiver;
        this.param = param;
    }

    @Override
    public void execute() {

        if (param.equals('F')) {
            System.out.println("Moving forward.");
            System.out.println(" ... 15 seconds ...");
            System.out.println("Done.");
        } else if (param.equals('B')) {
            System.out.println("Moving back.");
            System.out.println(" ... 15 seconds ...");
            System.out.println("Done.");
        }

    }
}
