package factory;

import button.Button;
import button.MacButton;
import checkBox.CheckBox;
import checkBox.MacCheckBox;

public class MacFactory implements GUIFactory {

    private MacFactory() {
    }

    static class MacFactoryLazyHolder {
        public static final MacFactory INSTANCE = new MacFactory();
    }

    public MacFactory getInstance() {
        return MacFactoryLazyHolder.INSTANCE;
    }

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
