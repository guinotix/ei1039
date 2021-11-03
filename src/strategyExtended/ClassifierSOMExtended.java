package strategyExtended;

public class ClassifierSOMExtended implements StrategyExtended {

    public String strategyToUse;

    public ClassifierSOMExtended(String strategy) {
        strategyToUse = strategy;
    }

    @Override
    public void execute() {
        if (strategyToUse.equals("Euclidean")) {
            distanceEuclidean();
        } else if (strategyToUse.equals("Manhattan")) {
            distanceManhattan();
        }
        System.out.println("ClassifierSOM executed");
    }

    @Override
    public void distanceEuclidean() {
        System.out.println("DistanceEuclidean computed");
    }

    @Override
    public void distanceManhattan() {
        System.out.println("DistanceManhattan computed");
    }
}
