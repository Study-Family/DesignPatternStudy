package chapter8;

public class MonsterAI extends GameAI {

	@Override
	public void buildStructures() {
		System.out.println("몬스터는 건물을 생성하지 않습니다.");
	}

	@Override
	public void buildUnits() {
		System.out.println("몬스터는 유닛을 만들지 않습니다.");
	}
}
