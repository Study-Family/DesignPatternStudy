package chapter9.seungwon.iteratorPattern;

import java.util.ArrayList;
import java.util.List;

class FacebookIterator implements ProfileIterator {
	private final Facebook facebook;
	private final String profileId;
	private final String type;
	private List<String> cache;
	private int currentPosition;

	public FacebookIterator(Facebook facebook, String profileId, String type) {
		this.facebook = facebook;
		this.profileId = profileId;
		this.type = type;
		this.cache = new ArrayList<>();
		this.currentPosition = 0;
	}

	private void lazyInit() {
		if (cache.isEmpty()) {
			cache = facebook.socialGraphRequest(profileId, type);
		}
	}

	public String getNext() {
		if (hasMore()) {
			String ret = cache.get(currentPosition);
			currentPosition++;
			return ret;
		}
		return "";
	}

	public boolean hasMore() {
		lazyInit();
		return currentPosition < cache.size();
	}
}
