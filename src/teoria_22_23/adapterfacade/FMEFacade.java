package teoria_22_23.adapterfacade;

public class FMEFacade {

    private FMEDesktop fme;

    public FMEFacade(FMEDesktop fme) {
        this.fme = fme;
    }

    public void consultar() {
        fme.consultar();
    }

    public void importar(Object datos) {
        fme.importar(datos);
    }

    public void exportar() {
        fme.exportar();
    }

}
