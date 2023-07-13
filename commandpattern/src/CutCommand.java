import java.util.Scanner;
import javax.print.AttributeException;

public class CutCommand extends Command{

    public CutCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        System.out.println("자를 문자열의 인덱스를 입력해주세요.");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Start Index: ");
        int start = scanner.nextInt();

        System.out.print("End Index: ");
        int end = scanner.nextInt();
        if (start >= end) {
            return false;
        }

        backup();
        editor.clipboard = editor.text.substring(start, end);
        editor.text.delete(start, end);
        return true;
    }

    @Override
    public void undo() {
        editor.text = new StringBuilder(backup);
    }
}
