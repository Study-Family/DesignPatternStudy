
import tmp.abstractFactory.checkBox.Checkbox;
import tmp.abstractFactory.button.Button;
import tmp.abstractFactory.button.WinButton;
import tmp.abstractFactory.checkBox.WinCheckbox;

public class WinFactory implements GUIFactory {
	private static WinFactory instance;

	private WinFactory() {
	}

	public static WinFactory getInstance() {
		if (instance == null) {
			instance = new WinFactory();
		}
		return instance;
	}

	public Button createButton() {
		return new WinButton();
	}

	public Checkbox createCheckbox() {
		return new WinCheckbox();
	}
}
