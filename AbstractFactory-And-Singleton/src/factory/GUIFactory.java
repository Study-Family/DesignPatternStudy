package factory;

import checkbox.Checkbox;
import button.Button;

public interface GUIFactory {

    Button createButton();

    Checkbox createCheckbox();
}
