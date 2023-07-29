import factory.GUIFactory;
import factory.MacFactory;
import factory.WinFactory;

public class ApplicationExecutor {
    public static void main(String[] args) {
        Output.printOs();
        Operation operation = Operation.findOperation(Input.inputOsName())
                .orElseThrow(() -> new RuntimeException("안돼요~"));

        GUIFactory factory = null;

        switch (operation) {
            case MAC:
                factory = MacFactory.getInstance();
                break;

            case WINDOW:
                factory = WinFactory.getInstance();
                break;
        }

        Application application = new Application(factory);
        application.createUI();
    }
}
