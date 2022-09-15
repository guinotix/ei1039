package teoria_21_22.strategySimple;

public class ContextSimple {

    public Strategy str;

    public ContextSimple(Strategy concreteStrategy) {
        str = concreteStrategy;
    }

    public void setClassifierStrategy(Strategy str) {
        this.str = str;
    }

    public void run() {
        str.execute();
    }

}
