package org.programers.factory.win;

import org.programers.factory.Button;
import org.programers.factory.Checkbox;
import org.programers.factory.GUIFactory;

public enum WinFactory implements GUIFactory {

	INSTANCE;

	public static WinFactory getInstance() {
		return INSTANCE;
	}

	@Override
	public Button createButton() {
		return new WinButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new WinCheckbox();
	}
}
