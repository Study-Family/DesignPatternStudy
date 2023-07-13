import factory.GUIFactory;
import factory.MacOSFactory;
import factory.WindowsFactory;
import java.util.Scanner;

public class Main {

    private static GUIFactory macOSFactory = new MacOSFactory();
    private static GUIFactory windowsFactory = new WindowsFactory();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String osKorean = scanner.nextLine();
        GUIFactory guiFactory = getOS(osKorean);
        if (!validOS(guiFactory)) {
            return;
        }

        App app = new App(guiFactory);
        app.paint();

        scanner.close();
    }

    private static boolean validOS(GUIFactory guiFactory) {
        if (guiFactory == null) {
            System.out.println("그런 OS는 존재하지 않습니다.");
            return false;
        }
        return true;
    }

    private static GUIFactory getOS(String osKorean) {
        switch (osKorean) {
            case "맥":
                return macOSFactory;
            case "윈도우":
                return windowsFactory;
            default:
                return null;
        }
    }
}