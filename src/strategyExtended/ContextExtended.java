package strategyExtended;

public class ContextExtended {

    public StrategyExtended strategy;

    public ContextExtended(StrategyExtended strategy) {
        this.strategy = strategy;
    }

    public void setClassifierStrategy(StrategyExtended strategy) {
        this.strategy = strategy;
    }

    public void run() {
        strategy.execute();
    }
}
