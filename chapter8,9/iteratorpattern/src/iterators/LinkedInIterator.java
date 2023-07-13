package iterators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import profile.Profile;
import social_networks.Facebook;
import social_networks.LinkedIn;

public class LinkedInIterator implements ProfileIterator {

    private final LinkedIn linkedIn;
    private final String type;
    private final String email;
    private List<String> emails;
    private List<Profile> profiles;

    private int currentPosition;
    public LinkedInIterator(LinkedIn linkedIn, String type, String email) {
        this.linkedIn = linkedIn;
        this.type = type;
        this.email = email;

        emails = Collections.emptyList();
        profiles = Collections.emptyList();

        currentPosition = 0;
    }

    @Override
    public boolean hasNext() {
        lazyLoad();
        return currentPosition < emails.size();
    }

    @Override
    public Profile getNext() {
        if (!hasNext()) {
            return null;
        }

        String obtainedEmail = emails.get(currentPosition);
        Profile obtainedProfile = profiles.get(currentPosition);
        if (obtainedProfile == null) {
            obtainedProfile = linkedIn.requestProfile(obtainedEmail);
            profiles.set(currentPosition, obtainedProfile);
        }
        currentPosition++;
        return obtainedProfile;
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }

    private void lazyLoad() {
        if (emails == Collections.EMPTY_LIST) {
            emails = new ArrayList<>();
            profiles = new ArrayList<>();
            List<String> requestedProfiles = linkedIn.requestProfiles(this.email, this.type);
            for (String requestedProfile : requestedProfiles) {
                emails.add(requestedProfile);
                profiles.add(null);
            }
        }
    }
}
