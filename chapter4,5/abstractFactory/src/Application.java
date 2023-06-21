import button.Button;
import checkBox.CheckBox;
import factory.GUIFactory;
import factory.MacFactory;
import factory.WinFactory;

public class Application {
    public static void main(String[] args) {
        GUIFactory factory = MacFactory.getInstance();
        Button button = factory.createButton();
        CheckBox checkBox = factory.createCheckBox();

        button.paint();
        checkBox.paint();

        factory = WinFactory.getInstance();
        button = factory.createButton();
        checkBox = factory.createCheckBox();

        button.paint();
        checkBox.paint();
    }
}
