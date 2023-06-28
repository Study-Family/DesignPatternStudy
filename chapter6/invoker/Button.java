package chapter6.invoker;

import chapter6.Command;

public class Button {
	private Command command;

	public Button(Command command) {
		this.command = command;
	}

	public void excuteCommand(){
		command.execute();
	}
}
