import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import networks.FaceBook;
import networks.Network;
import networks.Twitter;

public class Demo {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input user name: ");
        String userName = reader.readLine();
        System.out.print("Input password: ");
        String password = reader.readLine();

        // Enter the message.
        System.out.print("Input message: ");
        String message = reader.readLine();

        System.out.println("\nChoose social network for posting message.\n" +
                "1 - Facebook\n" +
                "2 - Twitter");
        int choice = Integer.parseInt(reader.readLine());

        Network network = getNetwork(choice);
        network.post(message, userName, password);
    }

    private static Network getNetwork(int choice) {
        switch (choice) {
            case 1:
                return new FaceBook();
            case 2:
                return new Twitter();
            default:
                throw new IllegalArgumentException("존재하지 않는 번호입니다: " + choice);
        }
    }
}
