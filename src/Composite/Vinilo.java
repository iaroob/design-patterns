package Composite;

public class Vinilo extends SongDecorator {

    public Vinilo(Component component) {
        super(component);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("ON vinyl");
    }
}
