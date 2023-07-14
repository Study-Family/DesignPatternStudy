public class EditorApp {
    public static void main(String[] args) {
        Application application = new Application();
        Editor editorA = new Editor("aaaabbbbccccccccc");
        Editor editorB = new Editor("aaaaaabbbbbbsssdddsfasd");
        application.addEditor(editorA);
        application.addEditor(editorB);
        application.changeEditor(editorA);
        application.executeCommand(new CopyCommand(application, application.getActiveEditor()), new CursorPosition(0, 5));
        application.executeCommand(new CutCommand(application, application.getActiveEditor()), new CursorPosition(1, 3));
        application.executeCommand(new PasteCommand(application, application.getActiveEditor()), new CursorPosition(0, 5));
        application.executeCommand(new UndoCommand(application, application.getActiveEditor()), new CursorPosition(0, 0));
    }
}
