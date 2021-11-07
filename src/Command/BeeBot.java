package Command;

import java.util.LinkedList;

public class BeeBot {
    LinkedList<String> actions;

    public BeeBot(LinkedList<String> actions) {
        this.actions = actions;
    }

    public void forward(){
        actions.add("Moving forward 15 cm!");
    }

    public void back(){
        actions.add("Moving backward 15 cm!");
    }

    public void left(){
        actions.add("Turning left 90 degrees");
    }

    public void right(){
        actions.add("Turning right 90 degrees");
    }

    public void delete() {
        System.out.println("Deleted: " + actions.removeLast());
    }

    public void go(){
        System.out.println("GO !");
        for (String action : actions) {
            System.out.println(action);
        }
    }
}