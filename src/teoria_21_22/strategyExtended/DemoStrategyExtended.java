package teoria_21_22.strategyExtended;


public class DemoStrategyExtended {

    public static void main(String[] args) {

        ContextExtended context = new ContextExtended();

        System.out.println("--- KNN with Euclidean distance ---");
        context.setClassifierStrategy(new ClassifierKnnExtended());
        context.setDistanceStrategy(new DistanceEuclidean());
        context.run();

        System.out.println("--- KNN with Manhattan distance ---");
        context.setClassifierStrategy(new ClassifierKnnExtended());
        context.setDistanceStrategy(new DistanceManhattan());
        context.run();

        System.out.println("--- K-means with Manhattan distance ---");
        context.setClassifierStrategy(new ClassifierKmeansExtended());
        context.setDistanceStrategy(new DistanceManhattan());
        context.run();

        System.out.println("--- SOM with Euclidean distance ---");
        context.setClassifierStrategy(new ClassifierSOMExtended());
        context.setDistanceStrategy(new DistanceEuclidean());
        context.run();

    }

}
