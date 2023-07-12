package iteratorPattern;

import iteratorPattern.iterator.ProfileIterator;
import iteratorPattern.network.SocialNetwork;

public class Application {
    private SocialSpammer spammer;
    private SocialNetwork network;

    public void sendSpamToFriend(Profile profile) {
        ProfileIterator profileIterator = network.createFriendsIterator(profile.getId());
        spammer.send(profileIterator, "Hello, bye");
    }

    public void sendSpamToCoworkers(Profile profile) {
        ProfileIterator profileIterator = network.createCoworkersIterator(profile.getId());
        spammer.send(profileIterator, "you're fired");
    }
}
