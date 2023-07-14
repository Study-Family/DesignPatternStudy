package chapter6;

import chapter6.command.CopyCommand;
import chapter6.command.CutCommand;
import chapter6.command.PasteCommand;
import chapter6.command.UndoCommand;

public class ApplicationTest {

	public static void main(String[] args) {
		Application application = new Application();

		application.createUI();

		application.copyButton.excuteCommand();
		application.cutButton.excuteCommand();
		application.pasteButton.excuteCommand();
		application.undoButton.excuteCommand();

		application.shortcutContainer.getShortCut("ctrl+c");
		application.shortcutContainer.getShortCut("ctrl+x");
		application.shortcutContainer.getShortCut("ctrl+v");
		application.shortcutContainer.getShortCut("ctrl+z");
	}


}
