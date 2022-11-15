package teoria_22_23.template;

public abstract class Algoritmo {

    // Funcion que hace de Template
    public final void calcular() {
        recolectar();
        verSimilitudes();
        distinguir();
        verResultados();
    }

    // Funciones que implementa cada algoritmo
    // de su forma concreta
    abstract void recolectar();
    abstract void verSimilitudes();

    // Procesar los resultados de los algoritmos
    public void distinguir() {
        System.out.println("Distinguiendo datos...");
        System.out.println(" ... ");
        System.out.println("Datos distinguidos!");
    }

    public void verResultados() {
        System.out.println("Ojeando datos...");
        System.out.println(" ... ");
        System.out.println("Datos listos! Mostrando datos...");
    }
}
