package strategyExtended;

public class ClassifierKmeansExtended implements ClassifierStrategy {

    public DistanceStrategy ds;

    @Override
    public void execute(DistanceStrategy ds) {
        ds.compute();
    }
}
