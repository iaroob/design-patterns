package Strategy;

public class ClassifierKnn implements Strategy {
    private Strategy strategy;

    public ClassifierKnn(Strategy strategy) {
        this.strategy = strategy;
    }

    public void run() {
        strategy.run();
        System.out.println("ClassifierKnn executed");
    }
}
