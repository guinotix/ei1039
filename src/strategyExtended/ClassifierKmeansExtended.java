package strategyExtended;

public class ClassifierKmeansExtended implements StrategyExtended {

    public String strategyToUse;

    public ClassifierKmeansExtended(String strategy) {
        this.strategyToUse = strategy;
    }

    @Override
    public void execute() {
        if (strategyToUse.equals("Euclidean")) {
            distanceEuclidean();
        } else if (strategyToUse.equals("Manhattan")) {
            distanceManhattan();
        }
        System.out.println("ClassifierKmeans executed");
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
