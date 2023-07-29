package com.iterator.domain;

import com.iterator.domain.iterator.FacebookIterator;
import com.iterator.domain.iterator.ProfileIterator;

import java.util.ArrayList;
import java.util.List;

public class Facebook implements SocialNetwork {
    private List<Profile> profiles;

    public Facebook(List<Profile> cache) {
        if (cache != null) {
            this.profiles = cache;
            return;
        }
        this.profiles = new ArrayList<>();
    }

    public Profile requestProfileFriendsFromFacebook(String profileEmail) {
        System.out.println("Facebook : Loading Profile '" + profileEmail + "' over the network...");

        return findProfile(profileEmail);
    }

    public List<String> requestProfileFriendsFromFacebook(String profileEmail, String contactType) {
        System.out.println("Facebook : Loading '" + contactType + "' list of '" + profileEmail + "' over the network...");

        Profile profile = findProfile(profileEmail);

        if (profile != null) {
            return profile.getContacts(contactType);
        }

        return null;
    }

    private Profile findProfile(String profileEmail) {

        return this.profiles.stream()
                .filter((profile) -> profile.getEmail().equals(profileEmail))
                .findFirst()
                .orElse(null);
    }

    @Override
    public ProfileIterator createFriendsIterator(String profileEmail) {
        return new FacebookIterator(this, "friends", profileEmail);
    }

    @Override
    public ProfileIterator createCoWorkersIterator(String profileEmail) {
        return new FacebookIterator(this, "coworkers", profileEmail);
    }
}
