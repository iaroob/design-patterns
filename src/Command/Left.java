package Command;

public class Left extends Command {
    public Left(BeeBot b){
        super(b);
    }

    public void execute() {
        bot.left();
    }
}