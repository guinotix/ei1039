package teoria_22_23.strategyExt;

import teoria_22_23.strategy.Classifier_KNN;
import teoria_22_23.strategy.Classifier_Kmeans;
import teoria_22_23.strategy.Classifier_SOM;

public class DemoStrategyExt {
    public static void main(String[] args) {
        ContextoExt contexto = new ContextoExt();

        System.out.println("--- KNN with Euclidean distance ---");
        contexto.setStrategy(new Classifier_KNN());
        contexto.setDistance(new Euclidean());
        contexto.run();

        System.out.println("--- KNN with Manhattan distance ---");
        contexto.setStrategy(new Classifier_KNN());
        contexto.setDistance(new Manhattan());
        contexto.run();

        System.out.println("--- K-means with Manhattan distance ---");
        contexto.setStrategy(new Classifier_Kmeans());
        contexto.setDistance(new Manhattan());
        contexto.run();

        System.out.println("--- SOM with Euclidean distance ---");
        contexto.setStrategy(new Classifier_SOM());
        contexto.setDistance(new Euclidean());
        contexto.run();
    }
}
