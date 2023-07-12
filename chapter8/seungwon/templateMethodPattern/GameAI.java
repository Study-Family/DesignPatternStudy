package chapter8.seungwon.templateMethodPattern;

import java.util.List;

abstract class GameAI {
	public void turn() {
		collectResources();
		buildStructures();
		buildUnits();
		attack();
	}

	protected void collectResources() {
		for (String s : buildStructures()) {
			System.out.println("ready to build " + s);
		}
	}

	protected abstract List<String> buildStructures();

	protected abstract void buildUnits();

	protected void attack() {
		Creature enemy = closestEnemy();
		if (enemy != null) {
			sendWarriors(enemy.getPosition());
		} else {
			sendScouts("center");
		}
	}

	private Creature closestEnemy() {
		Creature enemy = new Creature(100, 200);
		return enemy;
	}

	private void sendScouts(String position) {
		System.out.println("go to map center");
	}

	private void sendWarriors(Creature position) {
		int x = position.getX();
		int y = position.getY();
		System.out.println("go to (" + x + ", " + y + ")");
	}
}
