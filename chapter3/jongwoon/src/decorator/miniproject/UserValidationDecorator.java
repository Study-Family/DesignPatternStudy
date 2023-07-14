package decorator.miniproject;

import java.util.regex.Pattern;

public class UserValidationDecorator extends UserDecorator {

    private static final String KOREAN_REGEX = "^[가-힣]+$";
    private static final Pattern KOREAN_REGEX_COMPILE = Pattern.compile(KOREAN_REGEX);
    private static final String PHONE_NUMBER_REGEX = "^\\d{3}-\\d{4}-\\d{4}$";
    private static final Pattern PHONE_NUMBER_REGEX_COMPILE = Pattern.compile(PHONE_NUMBER_REGEX);

    public UserValidationDecorator(UserWrapper userWrapper) {
        super(userWrapper);
    }

    @Override
    public void write(User user) {
        if (validate(user)) {
            wrappedUser.write(user);
        }
    }

    private boolean validate(User user) {
        return isValidKoreanName(user.getName()) && isValidPhoneNumber(user.getPhoneNumber());
    }

    private boolean isValidKoreanName(String name) {
        return KOREAN_REGEX_COMPILE.matcher(name).matches();
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        return PHONE_NUMBER_REGEX_COMPILE.matcher(phoneNumber).matches();
    }

}
