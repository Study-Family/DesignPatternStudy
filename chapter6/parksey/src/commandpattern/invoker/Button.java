package commandpattern.invoker;


import commandpattern.command.Command;

public class Button {

    private Command command;

    public Button(Command command) {
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
