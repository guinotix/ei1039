package strategyExtended;

public class DistanceManhattan implements DistanceStrategy {

    @Override
    public void compute() {
        System.out.println("Computing Manhattan distance...");
        System.out.println("Done!");
    }
}
