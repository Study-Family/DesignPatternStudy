public class PasteCommand extends Command {
    public PasteCommand(Application application, Editor editor) {
        super(application, editor);
    }

    @Override
    boolean execute(CursorPosition cursorPosition) {
        editor.replaceSelection(cursorPosition.getStart(), cursorPosition.getEnd(), application.clipboard);
        System.out.println("현재 clipBoard 의 상태 : " + application.clipboard);
        return true;
    }
}
