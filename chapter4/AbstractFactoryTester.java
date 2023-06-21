package org.programers;

import org.programers.factory.GUIFactory;
import org.programers.factory.mac.MacFactory;

public class AbstractFactoryTester {
	public static void main(String[] args) {
		GUIFactory guiFactory = MacFactory.getInstance();
		Application application = new Application(guiFactory);

		application.createUI();
		application.paint();
	}
}
