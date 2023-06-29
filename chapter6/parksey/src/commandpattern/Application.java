package commandpattern;

import commandpattern.command.*;
import commandpattern.invoker.Buttons;
import commandpattern.invoker.Shortcuts;
import commandpattern.util.CommandName;

import java.util.ArrayList;
import java.util.List;

public class Application {
    String clipboard;
    List<Editor> editors;
    Editor activateEditor;
    CommandHistory history;

    Buttons buttons;
    Shortcuts shortcuts;


    public Application() {
        buttons = new Buttons();
        this.editors = new ArrayList<>();
        this.history = new CommandHistory();
    }

    public void createUi() {
        Command copy = new CopyCommand(this, activateEditor);
        Command undo = new UndoCommand(this, activateEditor);
        Command cut = new CutCommand(this, activateEditor);
        Command paste = new PasteCommand(this, activateEditor);

        buttons.createUi(CommandName.COPY, copy);
        buttons.createUi(CommandName.UNDO, undo);
        buttons.createUi(CommandName.CUT, cut);
        buttons.createUi(CommandName.PASTE, paste);
        shortcuts.createUi(CommandName.COPY, copy);
        shortcuts.createUi(CommandName.UNDO, undo);
        shortcuts.createUi(CommandName.CUT, cut);
        shortcuts.createUi(CommandName.PASTE, paste);
    }

    public Command executeCommand(String command) {
        CommandName userCommand = CommandName.getButtonCommand(command);
        if (userCommand != null) {
            return buttons.execute(userCommand);
        }

        userCommand = CommandName.getShortcuts(command);
        if (userCommand != null) {
            return shortcuts.execute(userCommand);
        }
        return null;
    }

    public void execute(String command) {
        Command commandOperator = executeCommand(command);
        if (commandOperator != null) {
            history.push(commandOperator);
        }
    }


    public void undo() {
        Command command = history.pop();
        if (command != null) {
            command.undo();
        }
    }

    public void setClipboard(String newText) {
        this.clipboard = newText;
    }

    public String getClipboard() {
        return clipboard;
    }
}
