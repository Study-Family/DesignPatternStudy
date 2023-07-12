package iteratorPattern.iterator;

import iteratorPattern.Profile;
import iteratorPattern.network.Facebook;

public class FacebookIterator implements ProfileIterator{
    private static final int INIT_SIZE = 6;

    private Facebook facebook;
    private String profileId;
    private int currentPosition;
    private Profile[] cache;

    public FacebookIterator(Facebook facebook, String profileId) {
        currentPosition = 0;
        cache = new Profile[INIT_SIZE];
    }

    public FacebookIterator(Facebook facebook, String profileId, int size) {
        currentPosition = 0;
        cache = new Profile[size];
    }


    @Override
    public Profile getNext() {
        if (hasMore()) {
            return cache[++currentPosition];
        }
        return null;
    }

    @Override
    public boolean hasMore() {
        return currentPosition < cache.length;
    }
}
