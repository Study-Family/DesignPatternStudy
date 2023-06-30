import java.util.Scanner;

public class Editor {

    public StringBuilder text = new StringBuilder();
    public String clipboard;
    public final CommandHistory history = new CommandHistory();

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("커맨드를 입력해주세요: ");
            String command = scanner.nextLine();

            switch (command) {
                case "input":
                    text.append(scanner.nextLine());
                    break;

                case "copy":
                    executeCommand(new CopyCommand(this));
                    break;

                case "cut":
                    executeCommand(new CutCommand(this));
                    break;

                case "paste":
                    executeCommand(new PasteCommand(this));
                    break;

                case "undo":
                    undo();
                    break;

                case "exit":
                    System.exit(0);
            }
            System.out.println(text.toString());
        }
    }

    private void undo() {
        if (history.isEmpty()) {
            return;
        }

        Command command = history.pop();
        if (command != null) {
            command.undo();
        }
    }

    private void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }
}
