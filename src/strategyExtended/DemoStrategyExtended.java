package strategyExtended;


public class DemoStrategyExtended {

    public static void main(String[] args) {

        System.out.println("--- KNN with Euclidean distance ---");
        ContextExtended context = new ContextExtended(new ClassifierKnnExtended("Euclidean"));
        context.run();

        System.out.println("--- KNN with Manhattan distance ---");
        context.setClassifierStrategy(new ClassifierKnnExtended("Manhattan"));
        context.run();

        System.out.println("--- K-means with Manhattan distance ---");
        context.setClassifierStrategy(new ClassifierKmeansExtended("Manhattan"));
        context.run();

        System.out.println("--- SOM with Euclidean distance ---");
        context.setClassifierStrategy(new ClassifierSOMExtended("Euclidean"));
        context.run();

    }

}
