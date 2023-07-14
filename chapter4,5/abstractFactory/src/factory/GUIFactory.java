package factory;

import button.Button;
import checkBox.CheckBox;

public interface GUIFactory {
    Button createButton();

    CheckBox createCheckBox();
}
