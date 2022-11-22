package teoria_22_23.command;

public class DemoCommand {
    public static void main(String[] args) {

        Invoker invoker = new Invoker();
        Receiver rec = new Receiver();

        rec.operation("FBLR");

        Move forward = new Move(rec, 'F');
        Turn left = new Turn(rec, 'L');
        Turn right = new Turn(rec, 'R');

        invoker.setCommand(forward);
        invoker.presionarBoton();

        invoker.setCommand(left);
        invoker.presionarBoton();

        invoker.setCommand(forward);
        invoker.presionarBoton();

        invoker.setCommand(forward);
        invoker.presionarBoton();

        invoker.setCommand(right);
        invoker.presionarBoton();
    }
}
