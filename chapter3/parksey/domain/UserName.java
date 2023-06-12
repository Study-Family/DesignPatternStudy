package decoratepattern.puzzle.domain;

import decoratepattern.puzzle.exception.InputException;

public class UserName implements UserInfo{
    private User user;

    public UserName() {

    }

    @Override
    public boolean save(User user) {
        validation(user.getName());
        this.user = user;
        return true;
    }


    @Override
    public void validation(String guserName) {
        InputException.checkUserName();
    }

    @Override
    public User read() {
        return user;
    }
}
