package factory;

import Checkbox.Checkbox;
import button.Button;

public interface GUIFactory {

    Button createButton();

    Checkbox createCheckbox();
}
