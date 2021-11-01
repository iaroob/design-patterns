package Composite;

public class SongDecorator implements Component {
    private Component component;

    public SongDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void play() {
        component.play();
    }
}
