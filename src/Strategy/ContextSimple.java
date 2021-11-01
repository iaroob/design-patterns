package Strategy;

public class ContextSimple {
    private Strategy strategy;

    public ContextSimple(Strategy strategy){
        this.strategy = strategy;
    }

    public void run() {
        strategy.run();
    }

    public void setClassifierStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
