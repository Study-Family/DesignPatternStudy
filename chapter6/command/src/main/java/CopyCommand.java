public class CopyCommand extends Command {
    public CopyCommand(Application application, Editor editor) {
        super(application, editor);
    }

    @Override
    boolean execute(CursorPosition cursorPosition) {
        application.clipboard = editor.getSelection(cursorPosition.getStart(), cursorPosition.getEnd());
        System.out.println("현재 clipBoard 의 상태 : " + application.clipboard);
        return false;
    }
}
