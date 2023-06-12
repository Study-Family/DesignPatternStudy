package decoratepattern.puzzle;

import decoratepattern.puzzle.controller.DecorateController;
import decoratepattern.puzzle.ui.InputView;
import decoratepattern.puzzle.ui.OutputView;

import java.util.Scanner;

public class DecorateApplication {
    public static void main(String[] args) {
        DecorateController decorateController = new DecorateController(
                new InputView(scannerInstance())
                , new OutputView()
        );

    }

    public static Scanner scannerInstance() {
        return new Scanner(System.in);
    }
}
