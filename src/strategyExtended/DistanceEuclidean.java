package strategyExtended;

public class DistanceEuclidean implements DistanceStrategy {

    @Override
    public void compute() {
        System.out.println("Computing Euclidean distance...");
        System.out.println("Done!");
    }
}
