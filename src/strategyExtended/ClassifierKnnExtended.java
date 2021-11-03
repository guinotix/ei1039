package strategyExtended;

public class ClassifierKnnExtended implements StrategyExtended {

    public String strategyToUse;

    public ClassifierKnnExtended(String strategy) {
        this.strategyToUse = strategy;
    }


    @Override
    public void execute() {
        if (strategyToUse.equals("Euclidean")) {
            distanceEuclidean();
        } else if (strategyToUse.equals("Manhattan")) {
            distanceManhattan();
        }
        System.out.println("ClassifierKnn executed");
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
