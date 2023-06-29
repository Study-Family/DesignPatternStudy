package commandpattern.invoker;

import commandpattern.command.Command;
import commandpattern.util.CommandName;

import java.util.HashMap;
import java.util.Map;

public class Buttons {
    private Map<CommandName, Button> buttons;

    public Buttons() {
        buttons = new HashMap<>();
    }

    public void createUi(CommandName name, Command command) {
        buttons.put(name, new Button(command));
    }

    public Command execute(CommandName name) {
        Button button = buttons.get(name);
        button.execute();
        return button.getCommand();
    }
}
