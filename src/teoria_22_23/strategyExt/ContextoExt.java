package teoria_22_23.strategyExt;

import teoria_22_23.strategy.Strategy;

public class ContextoExt {

    public Strategy str;
    public DistanceStrategy distance;

    public void setStrategy(Strategy str) {
        this.str = str;
    }

    public void setDistance(DistanceStrategy distance) {
        this.distance = distance;
    }

    public void run() {
        distance.calculate();
        str.execute();
    }

}
