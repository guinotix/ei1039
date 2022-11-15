package teoria_22_23.strategyExt;

public class Euclidean implements DistanceStrategy {

    @Override
    public void calculate() {
        System.out.println("Computing Euclidean distance...");
        System.out.println("Done!");
    }

}
