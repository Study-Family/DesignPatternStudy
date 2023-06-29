package commandpattern.invoker;

import commandpattern.command.Command;

public class Shortcut {
    private Command command;

    public Shortcut(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }

    public void execute() {
        command.execute();
    }
}
