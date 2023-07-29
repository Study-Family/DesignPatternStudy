package com.iterator.domain.iterator;

import com.iterator.domain.Facebook;
import com.iterator.domain.Profile;

import java.util.ArrayList;
import java.util.List;

public class FacebookIterator implements ProfileIterator {
    private Facebook facebook;
    private String type;
    private String email;
    private int currentPosition = 0;
    private List<String> emails = new ArrayList<>();
    private List<Profile> profiles = new ArrayList<>();

    public FacebookIterator(Facebook facebook, String type, String email) {
        this.facebook = facebook;
        this.type = type;
        this.email = email;
    }

    private void lazyLoading() {
        if (emails.size() == 0) {
            List<String> profiles = facebook.requestProfileFriendsFromFacebook(this.email, this.type);
            for(String profile : profiles) {
                this.emails.add(profile);
                this.profiles.add(null);
            }
        }
    }

    @Override
    public boolean hasNext() {
        lazyLoading();
        return currentPosition < emails.size();
    }

    @Override
    public Profile getNext() {
        if(!hasNext()) {
            return null;
        }

        String email = emails.get(currentPosition);
        Profile profile = profiles.get(currentPosition);
        if (profile == null) {
            profile = facebook.requestProfileFriendsFromFacebook(email);
            profiles.set(currentPosition, profile);
        }
        currentPosition++;
        return profile;
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }
}
