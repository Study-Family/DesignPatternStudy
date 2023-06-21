package main;

import main.gui.GUIFactory;

/**
 * 사용자에의 해서 어플리케이션이 실행
 * ->
 * 하나의 어플리케이션에는 하나의 GUIFactory만 있어야 하고 또 다시 생성할 필요가 없다고 생각했습니다.
 */
public class Application {
    private final GUIFactory guiFactory;

    public Application(GUIFactory guiFactory) {
        this.guiFactory = guiFactory;
    }
    public void execute() {
        this.guiFactory.
    }


}
