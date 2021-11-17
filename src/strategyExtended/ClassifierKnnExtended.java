package strategyExtended;

public class ClassifierKnnExtended implements ClassifierStrategy {

    public DistanceStrategy ds;

    @Override
    public void execute(DistanceStrategy ds) {
        ds.compute();
    }
}
