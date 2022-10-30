package teoria_22_23.adapterfacade;

public class FMEDesktop {

    public Object database;

    public FMEDesktop(Object database) {
        this.database = database;
    }

    public Object consultar() {
        return database;
    }

    public void importar(Object datos) {
        // Los datos de la variable 'datos' se añaden a la base de datos
    }

    public void exportar() {
        // Se realiza la exportación a un fichero externo
    }

}