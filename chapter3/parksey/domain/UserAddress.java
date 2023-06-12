package decoratepattern.puzzle.domain;

import decoratepattern.puzzle.exception.InputException;

public class UserAddress implements  UserInfo{
    private UserInfo userInfo;

    public UserAddress(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public boolean save(User user) {
        validation(user.getAddress());
        return this.userInfo.save(user);
    }


    @Override
    public void validation(String input) {
        InputException.checkAddress();
    }

    @Override
    public User read() {
        return this.userInfo.read();
    }

}
