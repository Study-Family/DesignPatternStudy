package chapter6;

import chapter6.model.Text;

public abstract class Command {
	protected final Application app;

	protected final Editor editor;

	protected Text backup;

	public Command(Application app, Editor editor) {
		this.app = app;
		this.editor = editor;
		this.backup = new Text();
	}

	public void saveBackup() {
		this.backup = editor.getSelection();
	}

	public void undo() {
		this.editor.setEditorText(this.backup);
	}

	public abstract void execute();
}
