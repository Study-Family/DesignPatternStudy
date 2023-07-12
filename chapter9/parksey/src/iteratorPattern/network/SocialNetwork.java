package iteratorPattern.network;

import iteratorPattern.Profile;
import iteratorPattern.iterator.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileId);
    ProfileIterator createCoworkersIterator(String profileId);
}
