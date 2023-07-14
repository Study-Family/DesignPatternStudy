public abstract class Command {
    public Application application;
    public Editor editor;
    private String backup;

    public Command(Application application, Editor editor) {
        this.application = application;
        this.editor = editor;
    }

    public void saveBackup() {
        this.backup = editor.text;
    }

    public void undo() {
        editor.text = backup;
    }

    @Override
    public String toString() {
        return "Command{" +
                "application=" + application +
                ", editor=" + editor +
                ", backup='" + backup + '\'' +
                '}';
    }

    abstract boolean execute(CursorPosition cursorPosition);
}
