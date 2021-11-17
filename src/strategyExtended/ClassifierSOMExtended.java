package strategyExtended;

public class ClassifierSOMExtended implements ClassifierStrategy {

    public DistanceStrategy ds;

    @Override
    public void execute(DistanceStrategy ds) {
        ds.compute();
    }
}
