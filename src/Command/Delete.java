package Command;

public class Delete extends Command {
    public Delete (BeeBot b){
        super(b);
    }

    public void execute() {
        bot.delete();
    }
}