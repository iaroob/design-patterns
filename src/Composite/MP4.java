package Composite;

public class MP4 extends SongDecorator {

    public MP4(Component component) {
            super(component);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("ON MP4");
    }
}

