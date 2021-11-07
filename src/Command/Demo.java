package Command;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> actions = new LinkedList<>();
        Invoker invoker = new Invoker();
        BeeBot bot = new BeeBot(actions);

        invoker.setCommand(new Forward(bot));
        invoker.executeCommand();

        invoker.setCommand(new Left(bot));
        invoker.executeCommand();

        invoker.setCommand(new Forward(bot));
        invoker.executeCommand();

        invoker.setCommand(new Right(bot));
        invoker.executeCommand();

        invoker.setCommand(new Delete(bot));
        invoker.executeCommand();

        invoker.setCommand(new Go(bot));
        invoker.executeCommand();

    }
}