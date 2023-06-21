package main.gui;

import main.button.Button;
import main.button.MacButton;
import main.checkbox.Checkbox;
import main.checkbox.MacCheckbox;

public class MacFactory extends GUIFactory{
    private static MacFactory macFactory;
    private MacFactory() {}
    public static MacFactory getInstance() {
        if (MacFactory.macFactory == null) {
            MacFactory.macFactory = new MacFactory();
        }

        return MacFactory.macFactory;
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
