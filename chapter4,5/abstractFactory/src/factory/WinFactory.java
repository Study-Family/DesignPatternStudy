package factory;

import button.Button;
import button.WinButton;
import checkBox.CheckBox;
import checkBox.WinCheckBox;

public class WinFactory implements GUIFactory {
    private WinFactory() {
    }

    private static class WinFactoryLazyHolder {
        private static final WinFactory INSTANCE = new WinFactory();
    }

    public static WinFactory getInstance() {
        return WinFactoryLazyHolder.INSTANCE;
    }

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}
