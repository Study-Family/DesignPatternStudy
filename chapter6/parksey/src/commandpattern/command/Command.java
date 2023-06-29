package commandpattern.command;


import commandpattern.Application;
import commandpattern.Editor;

public abstract class Command {
    protected Application application;
    protected Editor editor;

    private String backup;

    public Command(Application application, Editor editor) {
        this.application = application;
        this.editor = editor;
    }

    public void saveBackup() {
        this.backup = this.editor.getSelection();
    }

    public void undo() {
        this.editor.setText(this.backup);
    }

    abstract public void execute();
}
