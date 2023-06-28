package chapter6.model;

import chapter6.Command;

public class ShortCut {
	private String strCmd;

	private Command command;

	public ShortCut(String strCmd, Command command) {
		this.strCmd = strCmd;
		this.command = command;
	}

	public boolean isSame(String strCmd) {
		return strCmd.equals(strCmd);
	}

	public void executeCommand() {
		this.command.execute();
	}
}
