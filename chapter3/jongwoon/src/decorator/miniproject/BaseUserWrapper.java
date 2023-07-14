package decorator.miniproject;

public class BaseUserWrapper implements UserWrapper{
    private User user;

    @Override
    public void write(User user) {
        System.out.println(user);
        this.user = user;
    }

    @Override
    public User read() {
        return user;
    }
}
