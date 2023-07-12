package chapter9.seungwon.iteratorPattern;

interface SocialNetwork {
	ProfileIterator createFriendsIterator(String profileId);

	ProfileIterator createCoworkersIterator(String profileId);
}
