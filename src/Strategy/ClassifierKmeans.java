package Strategy;

public class ClassifierKmeans implements Strategy {

    private Strategy strategy;
    public ClassifierKmeans(Strategy strategy) {
        this.strategy = strategy;
    }

    public void run() {
        strategy.run();
        System.out.println("ClassifierKmeans executed");
    }
}
