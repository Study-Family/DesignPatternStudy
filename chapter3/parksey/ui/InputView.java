package decoratepattern.puzzle.ui;

import java.util.Scanner;

public class InputView {
    public Scanner scanner;
    public InputView(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getUserInput() {
        return this.scanner.nextLine();
    }
}
