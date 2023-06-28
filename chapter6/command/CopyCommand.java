package chapter6.command;

import chapter6.Application;
import chapter6.Command;
import chapter6.Editor;
import chapter6.model.Text;

public class CopyCommand extends Command {
	public CopyCommand(Application app, Editor editor) {
		super(app, editor);
	}

	@Override
	public void execute() {
		Text selectedText = editor.getSelection();
		app.setClipboard(selectedText);
	}
}
