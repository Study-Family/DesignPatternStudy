package chapter6;

import java.util.Stack;

public class CommandHistory {

	Stack<Command> stackHistories;

	public CommandHistory() {
		stackHistories = new Stack<>();
	}

	public void push(Command command) {
		stackHistories.push(command);
	}

	public Command pop() {
		return stackHistories.pop();
	}
}
