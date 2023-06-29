public class CutCommand extends Command {
    public CutCommand(Application application, Editor editor) {
        super(application, editor);
    }

    @Override
    boolean execute(CursorPosition cursorPosition) {
        saveBackup();
        application.clipboard = editor.getSelection(cursorPosition.getStart(), cursorPosition.getEnd());
        editor.deleteSelection(cursorPosition.getStart(), cursorPosition.getEnd());
        System.out.println("현재 clipBoard 의 상태 : " + application.clipboard);
        return true;
    }
}
