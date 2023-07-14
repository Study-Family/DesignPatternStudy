package decorator.miniproject;

public class UserCryptographyDecorator extends UserDecorator {


    private final int MOVE_VALUE = 20;
    public UserCryptographyDecorator(UserWrapper userWrapper) {
        super(userWrapper);
    }

    @Override
    public void write(User user) {
        super.write(encryptUser(user));
    }

    private User encryptUser(User user) {
        String encryptedName = encrypt(user.getName());
        String encryptedPhoneNumber = encrypt(user.getPhoneNumber());
        String encryptedAddress = encrypt(user.getAddress());
        return new User(encryptedName, encryptedPhoneNumber, encryptedAddress);
    }

    private String encrypt(String value) {
        StringBuilder sb = new StringBuilder();
        for(char ch : value.toCharArray()) {
            sb.append((char)(ch + MOVE_VALUE));
        }
        return sb.toString();
    }


    @Override
    public User read() {
        User user = super.read();
        return decryptUser(user);
    }

    private User decryptUser(User user) {
        String decryptedName = decrypt(user.getName());
        String decryptedPhoneNumber = decrypt(user.getPhoneNumber());
        String decryptedAddress = decrypt(user.getAddress());
        return new User(decryptedName, decryptedPhoneNumber, decryptedAddress);
    }

    private String decrypt(String value) {
        StringBuilder sb = new StringBuilder();
        for(char ch : value.toCharArray()) {
            sb.append((char)(ch - MOVE_VALUE));
        }
        return sb.toString();
    }
}
