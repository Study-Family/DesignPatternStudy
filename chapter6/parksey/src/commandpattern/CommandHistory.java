package commandpattern;

import commandpattern.command.Command;

import java.util.List;

public class CommandHistory {
    List<Command> history;

    public void push(Command command) {
        history.add(command);
    }

    public Command pop() {
        return history.remove(history.size()-1);
    }

}
