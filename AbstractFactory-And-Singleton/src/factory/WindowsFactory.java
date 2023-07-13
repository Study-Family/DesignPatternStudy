package factory;

import button.WindowButton;
import checkbox.Checkbox;
import button.Button;
import checkbox.WindowCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowCheckbox();
    }
}
