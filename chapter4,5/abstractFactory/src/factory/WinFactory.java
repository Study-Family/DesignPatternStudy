package factory;

public class WinFactory implements GUIFactory {
    private WinFactory() {
    }

    static class WinFactoryLazyHolder {
        private static final WinFactory INSTANCE = new WinFactory();
    }

    public static WinFactory getInstance() {
        return WinFactoryLazyHolder.INSTANCE;
    }

    @Override
    public Button createButton() {
        return null;
    }

    @Override
    public CheckBox createCheckBox() {
        return null;
    }
}
