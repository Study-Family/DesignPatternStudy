package chapter9.seungwon.iteratorPattern;

class SocialSpammer {
	public static void send(ProfileIterator iterator, String message) {
		while (iterator.hasMore()) {
			String profile = iterator.getNext();
			System.out.println("Send " + message + " to " + profile);
		}
	}
}
