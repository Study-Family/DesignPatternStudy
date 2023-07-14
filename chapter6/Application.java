package chapter6;

import java.util.ArrayList;
import java.util.List;

import chapter6.command.CopyCommand;
import chapter6.command.CutCommand;
import chapter6.command.PasteCommand;
import chapter6.command.UndoCommand;
import chapter6.invoker.Button;
import chapter6.invoker.ShortcutContainer;
import chapter6.model.Text;

public class Application {

	private Text clipboard;

	private List<Editor> editors;

	private Editor activeEditor;

	private CommandHistory history;
	public ShortcutContainer shortcutContainer;
	public Button copyButton;

	public Button cutButton;

	public Button pasteButton;

	public Button undoButton;

	public Application() {
		this.clipboard = new Text();
		this.shortcutContainer = new ShortcutContainer();
		this.editors = new ArrayList<>();
		this.history = new CommandHistory();
	}

	public void createUI() {
		Command copy = new CopyCommand(this, activeEditor);
		Command cut = new CutCommand(this, activeEditor);
		Command paste = new PasteCommand(this, activeEditor);
		Command undo = new UndoCommand(this, activeEditor);

		copyButton = new Button(copy);
		cutButton = new Button(cut);
		pasteButton = new Button(paste);
		undoButton = new Button(undo);

		shortcutContainer.onKeyPress("ctrl+c", copy);
		shortcutContainer.onKeyPress("ctrl+x", cut);
		shortcutContainer.onKeyPress("ctrl+v", paste);
		shortcutContainer.onKeyPress("ctrl+z", undo);
	}

	public void undo() {
		Command command = history.pop();
		if (command != null) {
			command.undo();
		}
	}

	public Text getClipboard() {
		return clipboard;
	}

	public void setClipboard(Text clipboard) {
		this.clipboard = clipboard;
	}


}
