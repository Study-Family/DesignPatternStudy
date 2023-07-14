package chapter6.command;

import chapter6.Application;
import chapter6.Command;
import chapter6.Editor;

public class UndoCommand extends Command {

	public UndoCommand(Application app, Editor editor) {
		super(app, editor);
	}

	@Override
	public void execute() {
		app.undo();
	}
}
