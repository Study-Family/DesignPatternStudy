package decoratepattern.puzzle.domain;

import decoratepattern.puzzle.exception.InputException;

import java.security.NoSuchAlgorithmException;


public class UserNumber implements UserInfo, Cryptoable{
    private UserInfo userInfo;
    private String secretKey = "123456";

    public UserNumber(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public boolean save(User user) throws NoSuchAlgorithmException {
        validation(user.getPhoneNumber());
        return this.userInfo.save(new User(user.getName(), parseCrtpto(user.getPhoneNumber()), user.getAddress()));
    }

    @Override
    public void validation(String input) {
        InputException.checkPhoneNumber();
    }

    @Override
    public User read() {
        User user = this.userInfo.read();
        return new User(user.getName(), deparseCrytpto(user.getPhoneNumber()), user.getAddress());
    }

    @Override
    public String parseCrtpto(String noraml) throws NoSuchAlgorithmException {
        return noraml+secretKey;
    }

    @Override
    public String deparseCrytpto(String crypto) {
        return crypto.substring(0,crypto.length()-secretKey.length());
    }
}
