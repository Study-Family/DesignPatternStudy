import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import profile.Profile;
import social_networks.Facebook;
import social_networks.LinkedIn;
import social_networks.SocialNetwork;
import spammer.SocialSpammer;

public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please specify social network to target spam tool (default:Facebook):");
        System.out.println("1. Facebook");
        System.out.println("2. LinkedIn");
        String choice = scanner.nextLine();

        SocialNetwork network = getNetwork(choice);

        SocialSpammer spammer = new SocialSpammer(network);
        spammer.sendSpamToFriends("anna.smith@bing.com",
                "Hey! This is Anna's friend Josh. Can you do me a favor and like this post [link]?");
        spammer.sendSpamToCoworkers("anna.smith@bing.com",
                "Hey! This is Anna's boss Jason. Anna told me you would be interested in [link].");
    }

    private static SocialNetwork getNetwork(String choice) {
        switch (choice) {
            case "1":
                return new Facebook(generateTestProfiles());
            case "2":
                return new LinkedIn(generateTestProfiles());
            default:
                throw new IllegalArgumentException("구현되지 않은 메뉴입니다: " + choice);
        }
    }

    private static List<Profile> generateTestProfiles() {
        List<Profile> data = new ArrayList<>();
        data.add(new Profile("anna.smith@bing.com", "Anna Smith", "friends:mad_max@ya.com", "friends:catwoman@yahoo.com", "coworkers:sam@amazon.com"));
        data.add(new Profile("mad_max@ya.com", "Maximilian", "friends:anna.smith@bing.com", "coworkers:sam@amazon.com"));
        data.add(new Profile("bill@microsoft.eu", "Billie", "coworkers:avanger@ukr.net"));
        data.add(new Profile("avanger@ukr.net", "John Day", "coworkers:bill@microsoft.eu"));
        data.add(new Profile("sam@amazon.com", "Sam Kitting", "coworkers:anna.smith@bing.com", "coworkers:mad_max@ya.com", "friends:catwoman@yahoo.com"));
        data.add(new Profile("catwoman@yahoo.com", "Liza", "friends:anna.smith@bing.com", "friends:sam@amazon.com"));
        return data;
    }
}
