package commandpattern.invoker;

import commandpattern.command.Command;
import commandpattern.util.CommandName;

import java.util.HashMap;
import java.util.Map;

public class Shortcuts {
    private Map<CommandName, Shortcut> shortcuts;

    public Shortcuts() {
        shortcuts = new HashMap<>();
    }

    public void createUi(CommandName name, Command command) {
        shortcuts.put(name, new Shortcut(command));
    }

    public Command execute(CommandName name) {
        Shortcut shortcut = shortcuts.get(name);
        shortcut.execute();
        return shortcut.getCommand();
    }
}
