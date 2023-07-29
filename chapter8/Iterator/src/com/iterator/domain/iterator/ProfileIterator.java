package com.iterator.domain.iterator;

import com.iterator.domain.Profile;

public interface ProfileIterator {

    boolean hasNext();
    Profile getNext();
    void reset();
}
