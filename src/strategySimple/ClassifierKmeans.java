package strategySimple;

public class ClassifierKmeans implements Strategy {

    public String strategy;

    public ClassifierKmeans() {
        strategy = "ClassifierKmeans";
    }

    @Override
    public void execute() {
        System.out.println(strategy + " executed");
    }

}
