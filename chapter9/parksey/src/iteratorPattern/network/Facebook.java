package iteratorPattern.network;

import iteratorPattern.iterator.FacebookIterator;
import iteratorPattern.iterator.ProfileIterator;

public class Facebook implements SocialNetwork {

    @Override
    public ProfileIterator createFriendsIterator(String profileId) {
        return new FacebookIterator(this, profileId);
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileId) {
        return new FacebookIterator(this, profileId);
    }
}
