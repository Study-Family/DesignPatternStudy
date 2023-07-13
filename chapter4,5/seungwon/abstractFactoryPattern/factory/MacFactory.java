package tmp.abstractFactory.factory;

import tmp.abstractFactory.checkBox.Checkbox;
import tmp.abstractFactory.checkBox.MacCheckbox;
import tmp.abstractFactory.button.Button;
import tmp.abstractFactory.button.MacButton;

public class MacFactory implements GUIFactory {
	private static MacFactory instance;

	private MacFactory() {
	}

	public static MacFactory getInstance() {
		if (instance == null) {
			instance = new MacFactory();
		}
		return instance;
	}

	public Button createButton() {
		return new MacButton();
	}

	public Checkbox createCheckbox() {
		return new MacCheckbox();
	}
}
