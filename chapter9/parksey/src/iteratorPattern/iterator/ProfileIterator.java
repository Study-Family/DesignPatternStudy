package iteratorPattern.iterator;

import iteratorPattern.Profile;

public interface ProfileIterator {
    Profile getNext();
    boolean hasMore();
}
