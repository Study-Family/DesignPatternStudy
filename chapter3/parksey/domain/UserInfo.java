package decoratepattern.puzzle.domain;

import decoratepattern.puzzle.exception.InputException;

import java.security.NoSuchAlgorithmException;
import java.util.function.Supplier;

public interface UserInfo {
    boolean save(User user) throws NoSuchAlgorithmException;
    void validation(String input);

    User read();

}
