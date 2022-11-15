package teoria_22_23.strategy;

public class Contexto {

    public Strategy str;

    public Contexto(Strategy concreteStrategy) {
        str = concreteStrategy;
    }

    public void setStrategy(Strategy str) {
        this.str = str;
    }

    public void run() {
        str.execute();
    }

}
