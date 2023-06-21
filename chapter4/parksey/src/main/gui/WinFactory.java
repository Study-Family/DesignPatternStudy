package main.gui;


import main.button.Button;
import main.button.WinButton;
import main.checkbox.Checkbox;
import main.checkbox.WinCheckbox;

public class WinFactory extends GUIFactory {
    private static WinFactory winFactory;

    private WinFactory() {}
    public static WinFactory getInstance() {
        if (WinFactory.winFactory == null) {
            WinFactory.winFactory = new WinFactory();
        }

        return WinFactory.winFactory;
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
