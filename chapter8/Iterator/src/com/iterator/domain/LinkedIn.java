package com.iterator.domain;

import com.iterator.domain.iterator.LinkedInIterator;
import com.iterator.domain.iterator.ProfileIterator;

import java.util.ArrayList;
import java.util.List;

public class LinkedIn implements SocialNetwork{
    private List<Profile> profiles;

    public LinkedIn(List<Profile> cache) {
        if (cache != null) {
            this.profiles = cache;
        }
        this.profiles = new ArrayList<>();
    }

    public Profile requestContactInfoFromLinkedInAPI(String profileEmail) {
        System.out.println("LinkedIn: Loading profile '" + profileEmail + "' over the network...");

        return findContact(profileEmail);
    }

    public List<String> requestRelatedContactsFromLinkedInAPI(String profileEmail, String contactType) {
        System.out.println("LinkedIn: Loading '" + contactType + "' list of '" + profileEmail + "' over the network...");

        Profile profile = findContact(profileEmail);
        if (profile != null) {
            return profile.getContacts(contactType);
        }
        return null;
    }

    private Profile findContact(String profileEmail) {
        for (Profile profile : profiles) {
            if (profile.getEmail().equals(profileEmail)) {
                return profile;
            }
        }
        return null;
    }

    private void simulateNetworkLatency() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ProfileIterator createFriendsIterator(String profileEmail) {
        return new LinkedInIterator(this, "friends", profileEmail);
    }

    @Override
    public ProfileIterator createCoWorkersIterator(String profileEmail) {
        return new LinkedInIterator(this, "coworkers", profileEmail);
    }
}
