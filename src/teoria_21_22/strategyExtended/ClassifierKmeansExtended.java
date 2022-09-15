package teoria_21_22.strategyExtended;

public class ClassifierKmeansExtended implements ClassifierStrategy {

    public DistanceStrategy ds;

    @Override
    public void execute(DistanceStrategy ds) {
        ds.compute();
    }
}
