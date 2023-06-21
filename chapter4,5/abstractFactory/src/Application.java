import button.Button;
import checkBox.CheckBox;
import factory.GUIFactory;

public class Application {
    private GUIFactory factory;
    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory factory) {
        this.factory = factory;
        this.button = factory.createButton();
        this.checkBox = factory.createCheckBox();
    }

    public void createUI() {
        button.paint();
        checkBox.paint();
    }
}
