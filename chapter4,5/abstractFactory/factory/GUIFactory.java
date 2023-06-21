package tmp.abstractFactory.factory;

import tmp.abstractFactory.checkBox.Checkbox;
import tmp.abstractFactory.button.Button;

public interface GUIFactory {
	Button createButton();

	Checkbox createCheckbox();
}
