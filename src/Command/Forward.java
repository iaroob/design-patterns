package Command;

public class Forward extends Command {
    public Forward (BeeBot b){
        super(b);
    }

    public void execute() {
        bot.forward();
    }
}