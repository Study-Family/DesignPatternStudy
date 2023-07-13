package tmp.abstractFactory;

import tmp.abstractFactory.button.Button;
import tmp.abstractFactory.factory.GUIFactory;

class Application {
	private final GUIFactory factory;
	private Button button;

	public Application(GUIFactory factory) {
		this.factory = factory;
	}

	public void createUI() {
		this.button = factory.createButton();
	}

	public void paint() {
		button.paint();
	}
}
