package com.iterator.domain;

import com.iterator.domain.iterator.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);
    ProfileIterator createCoWorkersIterator(String profileEmail);
}
