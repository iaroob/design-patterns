package Strategy;

public class ClassifierSOM implements Strategy {

    private Strategy strategy;

    public ClassifierSOM(Strategy strategy) {
        this.strategy = strategy;
    }

    public void run() {
        strategy.run();
        System.out.println("ClassifierSOM executed");
    }
}
