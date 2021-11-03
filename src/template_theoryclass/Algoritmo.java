package template_theoryclass;

public abstract class Algoritmo {

    // Metodos
    public final void calculo() {
        recogerDatos();
        calcularSimilitud();
        distinguirDatos();
        mostrarResultados();
    }

    abstract void recogerDatos();

    abstract void calcularSimilitud();

    public void distinguirDatos() {
        System.out.println("Distinguiendo datos...");
        System.out.println(" ... ");
        System.out.println("Datos distinguidos!");
    }

    public void mostrarResultados() {
        System.out.println("Ojeando datos...");
        System.out.println(" ... ");
        System.out.println("Datos listos! Mostrando datos...");
    }

}
