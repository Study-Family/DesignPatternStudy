package com.iterator.service;

import com.iterator.domain.Profile;
import com.iterator.domain.SocialNetwork;
import com.iterator.domain.iterator.ProfileIterator;

public class SocialSpammer {
    public SocialNetwork socialNetwork;
    public ProfileIterator iterator;

    public SocialSpammer(SocialNetwork socialNetwork) {
        this.socialNetwork = socialNetwork;
    }

    public void sendSpamToFriends(String profileEmail, String message) {
        System.out.println("Iterating over friends...");
        iterator = socialNetwork.createFriendsIterator(profileEmail);
        while (iterator.hasNext()) {
            Profile profile = iterator.getNext();
            sendMessage(profile.getEmail(), message);
        }
    }

    public void sendSpamToCoworkers(String profileEmail, String message) {
        System.out.println("Iterating over coworkers...");
        iterator = socialNetwork.createCoWorkersIterator(profileEmail);
        while (iterator.hasNext()) {
            Profile profile = iterator.getNext();
            sendMessage(profile.getEmail(), message);
        }
    }

    public void sendMessage(String email, String message) {
        System.out.println("Sent message to: '" + email + "'. Message body: '" + message + "'");
    }
}
