package teoria_22_23.command;

public class DemoCommand {
    public static void main(String[] args) {

        Invoker invoker = new Invoker();
        Receiver rec = new Receiver();

        rec.operation("FBLRDI");

        Move forward = new Move(rec, 'F');
        Turn left = new Turn(rec, 'L');
        Turn right = new Turn(rec, 'R');
        Deshacer undo = new Deshacer(rec, 'D');
        Iniciar start = new Iniciar(rec, 'I');

        invoker.setCommand(forward);
        invoker.setCommand(left);
        invoker.setCommand(forward);
        invoker.setCommand(forward);
        invoker.setCommand(right);
        invoker.ejecutar();

    }
}
