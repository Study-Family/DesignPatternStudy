package chapter9.seungwon.iteratorPattern;

import java.util.ArrayList;
import java.util.List;

class Facebook implements SocialNetwork {
	public List<String> socialGraphRequest(String profileId, String type) {
		if (type.equals("friends")) {
			return List.of("f1", "f2", "f3", "f4", "f5");
		} else if (type.equals("coworkers")) {
			return List.of("w1", "w2", "w3", "w4");
		} else {
			return new ArrayList<>();
		}
	}

	public ProfileIterator createFriendsIterator(String profileId) {
		return new FacebookIterator(this, profileId, "friends");
	}

	public ProfileIterator createCoworkersIterator(String profileId) {
		return new FacebookIterator(this, profileId, "coworkers");
	}
}
