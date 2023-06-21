package main.gui;

import main.button.Button;
import main.checkbox.Checkbox;

public abstract class GUIFactory {
    private static GUIFactory guiFactory;

    public static GUIFactory getInstance(String os) {
        if ("Win".equals(os)) {
            return WinFactory.getInstance();
        }

        if ("Mac".equals(os)) {
            return MacFactory.getInstance();
        }
        throw new RuntimeException("해당 운영체제 없다.");
    }

    public abstract Button createButton();
    public abstract Checkbox createCheckbox();
}
