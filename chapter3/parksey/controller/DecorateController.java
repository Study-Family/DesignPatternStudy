package decoratepattern.puzzle.controller;

import decoratepattern.puzzle.domain.*;
import decoratepattern.puzzle.exception.InputException;
import decoratepattern.puzzle.ui.InputView;
import decoratepattern.puzzle.ui.OutputView;

import java.util.function.Supplier;

public class DecorateController {
    private final InputView inputView;
    private final OutputView outputView;

    public DecorateController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }


    public void userInput() {


        User user = new User(getUserName(), getPhoneNumber(), getAddress());

        UserInfo userInfo = new UserName();
        userInfo = new UserNumber(userInfo);
        userInfo = new UserAddress(userInfo);


        userInfo.save(user);

        userInfo.read();

    }

    private String getUserName() {
        return getInput(()-> {
            this.outputView.printName();
            return inputView.getUserInput();
        });
    }

    private String getPhoneNumber() {
        return getInput(()-> {
            this.outputView.printName();
            return inputView.getUserInput();
        });
    }

    private String getAddress() {
        return getInput(()-> {
            this.outputView.printName();
            return inputView.getUserInput();
        });
    }


    private <T> T getInput(Supplier<T> inputSupplier) {
        while(true) {
            try {
                return inputSupplier.get();
            } catch (InputException error) {
                this.outputView.printMsg(error.getMessage());
            }
        }
    }
}
