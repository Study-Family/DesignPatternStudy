package chapter9.seungwon.iteratorPattern;

class App {
	public App() {
		SocialNetwork network = new Facebook();
		ProfileIterator fit = network.createFriendsIterator("id1");
		ProfileIterator wit = network.createCoworkersIterator("id2");
		SocialSpammer.send(fit, "hello friend");
		SocialSpammer.send(wit, "hello coworker");
	}
}
