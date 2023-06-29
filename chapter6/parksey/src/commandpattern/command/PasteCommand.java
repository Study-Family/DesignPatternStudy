package commandpattern.command;

import commandpattern.Application;
import commandpattern.Editor;

public class PasteCommand extends Command{
    public PasteCommand(Application application, Editor editor) {
        super(application, editor);
    }

    @Override
    public void execute() {
        saveBackup();
        this.editor.replaceSelection(application.getClipboard());
    }
}
