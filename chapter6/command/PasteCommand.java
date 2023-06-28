package chapter6.command;

import chapter6.Application;
import chapter6.Command;
import chapter6.Editor;
import chapter6.model.Text;

public class PasteCommand extends Command {

	public PasteCommand(Application app, Editor editor) {
		super(app, editor);
	}

	@Override
	public void execute() {
		saveBackup();
		Text curClipBoardText = app.getClipboard();
		this.editor.replaceSelection(curClipBoardText);
	}
}
