package teoria_22_23.command;

public class Iniciar implements Command {

    public Receiver receiver;
    public Character param;

    public Iniciar(Receiver r, Character p) {
        this.receiver = r;
        this.param = p;
    }

    @Override
    public void execute() {
        if (param.equals('I')) {
            // Iniciar la ejecución de comandos
        }
    }
}
