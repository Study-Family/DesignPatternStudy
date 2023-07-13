import java.util.Scanner;

public class PasteCommand extends Command{

    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.clipboard == null) {
            return false;
        }

        backup();
        System.out.println("붙여 넣을 시작 인덱스를 입력해주세요.");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Start Index: ");
        int start = scanner.nextInt();

        editor.text.insert(start, editor.clipboard);
        return true;
    }

    @Override
    public void undo() {
        editor.text = new StringBuilder(backup);
    }
}
