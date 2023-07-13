package tmp.abstractFactory;

import tmp.abstractFactory.factory.GUIFactory;
import tmp.abstractFactory.factory.MacFactory;
import tmp.abstractFactory.factory.WinFactory;

public class ApplicationConfigurator {
	public static void main(String[] args) throws Exception {
		String operatingSystem = readApplicationConfigFile();

		GUIFactory factory;

		if (operatingSystem.equals("Windows")) {
			factory = WinFactory.getInstance();
		} else if (operatingSystem.equals("Mac")) {
			factory = MacFactory.getInstance();
		} else {
			throw new Exception("Error! Unknown operating system.");
		}

		Application app = new Application(factory);
		app.createUI();
		app.paint();
	}

	private static String readApplicationConfigFile() {
		return "Windows";
	}
}
