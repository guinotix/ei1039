package template_theoryclass;

public class AlgoritmoSpam extends Algoritmo {


    @Override
    void recogerDatos() {
        System.out.println("Recogiendo información de los mails...");
        System.out.println(" ... ");
        System.out.println("Datos de los mails recogidos!");
    }

    @Override
    void calcularSimilitud() {
        System.out.println("Calculando la similitud entre mails...");
        System.out.println(" ... ");
        System.out.println("Mails filtrados con éxito!");
    }
}
