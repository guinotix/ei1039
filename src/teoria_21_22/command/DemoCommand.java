package teoria_21_22.command;

public class DemoCommand {

    public static void main(String[] args) {

        Invoker invoker = new Invoker();
        Receiver rec = new Receiver();

        rec.operation("FBLR");

        Move forward = new Move(rec, 'F');
        Turn left = new Turn(rec, 'L');
        Turn right = new Turn(rec, 'R');

        // Forward
        invoker.setCommand(forward);
        invoker.buttonPressed();

        // Left
        invoker.setCommand(left);
        invoker.buttonPressed();

        // Forward
        invoker.setCommand(forward);
        invoker.buttonPressed();

        // Forward
        invoker.setCommand(forward);
        invoker.buttonPressed();

        // Right
        invoker.setCommand(right);
        invoker.buttonPressed();
    }

}
