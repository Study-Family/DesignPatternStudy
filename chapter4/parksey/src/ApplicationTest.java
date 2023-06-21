import main.Application;
import main.gui.GUIFactory;

public class ApplicationTest {
    public static void main(String[] args) {

        String osConfig = "Win";

        Application app = new Application(GUIFactory.getInstance(osConfig));
    }
}