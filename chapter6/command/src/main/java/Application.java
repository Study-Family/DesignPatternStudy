import java.util.ArrayList;
import java.util.List;

public class Application {
    String clipboard;
    List<Editor> editors = new ArrayList<>();
    Editor activeEditor;
    CommandHistory history;

    public Application() {
        this.history = new CommandHistory();
    }

    public void addEditor(Editor editor) {
        System.out.println(editor + "가 추가되었습니다.");
        editors.add(editor);
    }

    public void changeEditor(Editor editor) {
        if (editors.contains(editor)) {
            activeEditor = editor;
            System.out.println("application이 관리하는 editor가 " + editor + "로 변경되었습니다.");
        }
        editors.add(editor);
        System.out.println(editor + "를 추가하고 변경하였습니다.");
        activeEditor = editor;
    }

    public Editor getActiveEditor() {
        return activeEditor;
    }

    public void executeCommand(Command command, CursorPosition cursorPosition) {
        if (command.execute(cursorPosition)) {
            history.push(command);
        }
    }

    public Command undo() {
        if (history.isEmptyHistory()) {
            return null;
        }
        return history.pop();
    }

    @Override
    public String toString() {
        return "Application{" +
                "clipboard='" + clipboard + '\'' +
                ", editors=" + editors +
                ", activeEditor=" + activeEditor +
                ", history=" + history +
                '}';
    }
}
