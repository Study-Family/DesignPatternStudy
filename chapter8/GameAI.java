package chapter8;

import java.util.List;

import chapter8.model.Enemy;
import chapter8.model.Map;
import chapter8.model.Position;

public abstract class GameAI {

	private List<Enemy> enemies;

	private Map map;

	protected int resource;

	public GameAI() {
		Position center = new Position(5,5);
		this.map = new Map(center);
		resource = 0;
	}

	public void  turn() {
		collectResources();
		buildStructures();
		buildUnits();
		attack();
	}

	public void collectResources() {
		resource += 10;
	}

	public abstract void buildStructures();

	public abstract void buildUnits();

	public void attack(){
		//가장 가까운 적 호출
		Enemy enemy = closestEnemy();
		if (enemy == null)
			sendScouts(map.getCenter());
		else
			sendWarriors(enemy.getPosition());
	}

	public void sendScouts(Position position){
		System.out.println("send scouts to " + position.toString());
	}

	public void sendWarriors(Position position){
		System.out.println("send warriors to " + position.toString());
	}

	//가장 가까운 적
	public Enemy closestEnemy() {
		return enemies.get(0);
	}
}
