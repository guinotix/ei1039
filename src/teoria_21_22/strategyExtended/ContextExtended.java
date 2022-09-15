package teoria_21_22.strategyExtended;

public class ContextExtended {

    public ClassifierStrategy cs;
    public DistanceStrategy ds;

    public ContextExtended() {
    }

    public void setClassifierStrategy(ClassifierStrategy str) {
        this.cs = str;
    }

    public void setDistanceStrategy(DistanceStrategy str) {
        this.ds = str;
    }

    public void run() {
        cs.execute(ds);
    }
}
