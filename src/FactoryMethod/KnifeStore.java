package FactoryMethod;

import org.jetbrains.annotations.NotNull;

public abstract class KnifeStore {

    private SimpleKnifeFactory factory;

    public KnifeStore(SimpleKnifeFactory factory) {
        this.factory = factory;
    }

    public Knife orderKnife(@NotNull String type) {
        Knife knife = null;

        knife = factory.createKnife(type);

        knife.sharpen();
        knife.polish();
        knife.wrapp();
        return knife;
    }

    abstract Knife createKnife(String type);

}
