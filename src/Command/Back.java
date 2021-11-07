package Command;

public class Back extends Command {
    public Back (BeeBot b){
        super(b);
    }

    public void execute() {
        bot.back();
    }

    public void go() {
        bot.go();
    }
}
