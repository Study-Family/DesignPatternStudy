package iterators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import profile.Profile;
import social_networks.Facebook;

public class FacebookIterator implements ProfileIterator {

    private final Facebook facebook;
    private final String type;
    private final String email;
    private List<String> emails;
    private List<Profile> profiles;

    private int currentPosition;

    public FacebookIterator(Facebook facebook, String type, String email) {
        this.facebook = facebook;
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
            obtainedProfile = facebook.requestProfile(obtainedEmail);
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
            List<String> requestedProfiles = facebook.requestProfiles(this.email, this.type);
            for (String requestedProfile : requestedProfiles) {
                emails.add(requestedProfile);
                profiles.add(null);
            }
        }
    }
}
