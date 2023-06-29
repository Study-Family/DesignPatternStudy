package commandpattern.command;


import commandpattern.Application;
import commandpattern.Editor;

public class UndoCommand extends Command{
    public UndoCommand(Application application, Editor editor) {
        super(application, editor);
    }

    @Override
    public void execute() {
        this.application.undo();
    }
}
