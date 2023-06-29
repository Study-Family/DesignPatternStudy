public class UndoCommand extends Command {
    public UndoCommand(Application application, Editor editor) {
        super(application, editor);
    }

    @Override
    boolean execute(CursorPosition cursorPosition) {
        application.undo();
        System.out.println("현재 clipBoard 의 상태 : " + application.clipboard);
        return false;
    }
}
