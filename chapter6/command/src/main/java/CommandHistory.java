import java.util.Stack;

public class CommandHistory {

    Stack<Command> history = new Stack<>();

    public void push(Command command) {
        System.out.println(command + "를 스택에 넣었습니다.");
        history.push(command);
    }

    public Command pop() {
        Command command = history.pop();
        System.out.println(command + "가 취소 되었습니다.");
        return command;
    }

    public boolean isEmptyHistory() {
        return history.isEmpty();
    }
    
}
