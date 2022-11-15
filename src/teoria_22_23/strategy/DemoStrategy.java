package teoria_22_23.strategy;

public class DemoStrategy {
    public static void main(String[] args) {
        System.out.println("--- KNN ---");
        Contexto contexto = new Contexto(new Classifier_KNN());
        contexto.run();

        System.out.println("--- K-means ---");
        contexto.setStrategy(new Classifier_Kmeans());
        contexto.run();

        System.out.println("--- SOM ---");
        contexto.setStrategy(new Classifier_SOM());
        contexto.run();
    }
}
