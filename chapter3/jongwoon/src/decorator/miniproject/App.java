package decorator.miniproject;

public class App {
    public static void main(String[] args) {
        User user = new User("문종운", "010-6800-0708", "인천광역시 미추홀구");
        UserWrapper baseUser = new BaseUserWrapper();
        UserWrapper userDecorator = new UserValidationDecorator(new UserCryptographyDecorator(baseUser));
        userDecorator.write(user);

        System.out.println("encrypt 된 데이터 : " + baseUser.read());
        System.out.println("==============");
        System.out.println("decrypt 된 데이터 : " + userDecorator.read());
    }
}
