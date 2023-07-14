package org.programers;

import org.programers.factory.Button;
import org.programers.factory.Checkbox;
import org.programers.factory.GUIFactory;

public class Application {
	private GUIFactory factory;
	private Button button;
	private Checkbox checkbox;

	public Application(GUIFactory factory) {
		this.factory = factory;
	}

	public void createUI() {
		this.button = factory.createButton();
		this.checkbox = factory.createCheckbox();
	}

	public void paint() {
		this.button.paint();
		this.checkbox.paint();
	}
}
