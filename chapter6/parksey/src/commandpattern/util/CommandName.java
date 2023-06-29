package commandpattern.util;

import java.util.HashMap;
import java.util.Map;

public enum CommandName {
    COPY("copy", "ctrl+c"),
    CUT("cut", "ctrl+x"),
    PASTE("copy", "ctrl+v"),
    UNDO("undo", "ctrl+z");

    private final String buttonCommand;
    private final String shortcutCommand;

    private static final Map<String, CommandName> buttons = new HashMap<>();
    private static final Map<String, CommandName> shortcuts = new HashMap<>();

    static {
        for (CommandName commandName : CommandName.values()) {
            buttons.put(commandName.buttonCommand, commandName);
            shortcuts.put(commandName.shortcutCommand, commandName);
        }
    }

    CommandName(String buttonCommand, String shortcutCommand) {
        this.buttonCommand = buttonCommand;
        this.shortcutCommand = shortcutCommand;
    }

    public static CommandName getButtonCommand(String command) {
        return buttons.getOrDefault(command, null);
    }

    public static CommandName getShortcuts(String command) {
        return shortcuts.getOrDefault(command, null);
    }
}
