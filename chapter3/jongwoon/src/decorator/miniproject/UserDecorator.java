package decorator.miniproject;

public abstract class UserDecorator implements UserWrapper{

    protected UserWrapper wrappedUser;

    public UserDecorator(UserWrapper userWrapper) {
        this.wrappedUser = userWrapper;
    }

    @Override
    public void write(User user) {
        wrappedUser.write(user);
    }

    @Override
    public User read() {
        return wrappedUser.read();
    }
}
