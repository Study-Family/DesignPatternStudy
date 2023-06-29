package commandpattern.command;

import commandpattern.Application;
import commandpattern.Editor;

public class CopyCommand extends Command {
    public CopyCommand(Application application, Editor editor) {
        super(application, editor);
    }
    @Override
    public void execute() {
        this.application.setClipboard(editor.getSelection());
    }
}
