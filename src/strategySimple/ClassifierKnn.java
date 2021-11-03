package strategySimple;

public class ClassifierKnn implements Strategy {

    public String strategy;

    public ClassifierKnn() {
        strategy = "ClassifierKnn";
    }

    @Override
    public void execute() {
        System.out.println(strategy + " executed");
    }

}
