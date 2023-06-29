package commandpattern.command;


import commandpattern.Application;
import commandpattern.Editor;

public class CutCommand extends Command{
    public CutCommand(Application application, Editor editor) {
        super(application, editor);
    }

    @Override
    public void execute() {
        saveBackup();

        this.application.setClipboard(this.editor.getSelection());
        this.editor.deleteSelction();
    }
}
