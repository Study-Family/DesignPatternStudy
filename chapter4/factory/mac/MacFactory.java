package org.programers.factory.mac;

import org.programers.factory.Button;
import org.programers.factory.Checkbox;
import org.programers.factory.GUIFactory;

public enum MacFactory implements GUIFactory {

	INSTANCE;

	public static MacFactory getInstance() {
		return INSTANCE;
	}

	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new MacCheckbox();
	}
}
