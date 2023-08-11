public abstract class Command {

    protected String name = "abstract";
    protected final Editor editor;
    protected String backup;

    public Command(Editor editor) {
        this.editor = editor;
    }

    public String getName() {
        return name;
    }

    public abstract boolean execute();

    public abstract void undo();

    protected void backup() {
        backup = editor.text.toString();
    }
}
