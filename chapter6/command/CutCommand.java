package chapter6.command;

import chapter6.Application;
import chapter6.Command;
import chapter6.Editor;

import chapter6.model.Text;
public class CutCommand extends Command {

	public CutCommand(Application app, Editor editor) {
		super(app, editor);
	}

	@Override
	public void execute() {
		saveBackup();

		Text selectedText = this.editor.getSelection();
		this.app.setClipboard(selectedText);
		this.editor.deleteSelection();
	}
}
