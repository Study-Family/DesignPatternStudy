package social_networks;

import iterators.FacebookIterator;
import iterators.ProfileIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import profile.Profile;

public class Facebook implements SocialNetwork {

    private final List<Profile> profiles;

    public Facebook(List<Profile> cache) {
        this.profiles = Objects.requireNonNullElseGet(cache, ArrayList::new);
    }

    @Override
    public ProfileIterator createFriendsIterator(String profileEmail) {
        return new FacebookIterator(this, "friends", profileEmail);
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileEmail) {
        return new FacebookIterator(this, "coworkers", profileEmail);
    }

    public List<String> requestProfiles(String profileEmail, String contactType) {
        simulateNetworkLatency();
        System.out.println("Facebook: Loading '" + contactType + "' list of '" + profileEmail
                + "' over the network...");

        Profile profile = findProfile(profileEmail);
        if (profile != null) {
            return profile.getContacts(contactType);
        }
        return null;
    }

    public Profile requestProfile(String profileEmail) {
        simulateNetworkLatency();
        System.out.println("Facebook: Loading profile '" + profileEmail + "' over the network...");

        return findProfile(profileEmail);
    }

    private void simulateNetworkLatency() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    private Profile findProfile(String profileEmail) {
        for (Profile profile : profiles) {
            if (Objects.equals(profile.getEmail(), profileEmail)) {
                return profile;
            }
        }
        return null;
    }
}
