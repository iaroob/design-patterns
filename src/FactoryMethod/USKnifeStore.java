package FactoryMethod;

public class USKnifeStore extends KnifeStore {

    public USKnifeStore(SimpleKnifeFactory factory) {
        super(factory);
    }

    @Override
    Knife createKnife(String type) {
        if (type.equals("chef")) {
            return new ChefKnife();
        } else if (type.equals("steak")) {
            return new SteakKnife();
        } else return null;
    }
}
