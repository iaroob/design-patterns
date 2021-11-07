package Command;

public class Right extends Command {
    public Right(BeeBot b){
        super(b);
    }

    public void execute() {
        bot.right();
    }
}