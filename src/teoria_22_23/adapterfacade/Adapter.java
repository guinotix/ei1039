package teoria_22_23.adapterfacade;

public class Adapter implements PostGisMetodos {

    public FMEFacade adapter;
    public Object datosFME;

    public Adapter(Object datos) {
        datosFME = convertir(datos);
    }

    public Object convertir(Object datos) {
        // Operaciones de conversión de datos
        // ...
        return new Object();
    }

    @Override
    public void consultar() {
        adapter.consultar();
    }

    @Override
    public void importar(Object datos) {
        adapter.importar(datos);
    }

    @Override
    public void exportar() {
        adapter.exportar();
    }
}
