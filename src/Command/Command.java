package Command;

public abstract class Command {
    BeeBot bot;

    Command(BeeBot b) {
        this.bot = b;
    }
    public abstract void execute();
}