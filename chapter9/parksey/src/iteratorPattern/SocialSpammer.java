package iteratorPattern;

import iteratorPattern.iterator.ProfileIterator;

import java.util.ArrayList;
import java.util.List;

public class SocialSpammer {
    public List<String> send(ProfileIterator profileIterator, String message) {
        List<String> emails = new ArrayList<>();
        while(profileIterator.hasMore()) {
            Profile profile = profileIterator.getNext();
            emails.add(profile.getEmail());
        }

        return emails;
    }

}
