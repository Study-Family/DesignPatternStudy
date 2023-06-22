package factory;

import button.MacOSButton;
import checkbox.Checkbox;
import button.Button;
import checkbox.MacOSCheckbox;

public class MaxOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
