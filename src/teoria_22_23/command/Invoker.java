package teoria_22_23.command;


public class Invoker {

    Command c;

    public Invoker() {
    }

    public void setCommand(Command c) {
        this.c = c;
    }

    // método que ejecuta la operación
    public void presionarBoton() {
        this.c.execute();
    }

}
