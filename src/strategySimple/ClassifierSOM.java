package strategySimple;

public class ClassifierSOM implements Strategy {

    public String strategy;

    public ClassifierSOM() {
        strategy = "ClassifierSOM";
    }

    @Override
    public void execute() {
        System.out.println(strategy + " executed");
    }

}
