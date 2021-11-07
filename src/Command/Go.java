package Command;

public class Go extends Command {
    public Go (BeeBot b){
        super(b);
    }

    public void execute() {
        bot.go();
    }
}