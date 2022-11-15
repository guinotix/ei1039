package teoria_22_23.strategyExt;

public class Manhattan implements DistanceStrategy {

    @Override
    public void calculate() {
        System.out.println("Computing Manhattan distance...");
        System.out.println("Done!");
    }

}
