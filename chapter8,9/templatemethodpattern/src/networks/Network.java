package networks;

public abstract class Network {

    public boolean post(String message, String userName, String password) {
        if (logIn(userName, password)) {
            boolean result = sendData(message.getBytes());
            logOut(userName);
            return result;
        }
        return false;
    }

    protected abstract boolean logIn(String userName, String password);

    protected abstract boolean sendData(byte[] data);

    protected abstract void logOut(String userName);
}
