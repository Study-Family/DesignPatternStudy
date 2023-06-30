import java.util.Scanner;

public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        System.out.println("카피를 시작합니다.");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Start Index: ");
        int start = scanner.nextInt();

        System.out.print("End Index: ");
        int end = scanner.nextInt();

        editor.clipboard = editor.text.substring(start, end);
        return false;
    }

    @Override
    public void undo() {
        throw new UnsupportedOperationException();
    }
}
