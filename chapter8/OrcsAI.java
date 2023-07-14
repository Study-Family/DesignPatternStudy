package chapter8;

public class OrcsAI extends GameAI{
	@Override
	public void buildStructures() {
		System.out.println("오크 건물 생성");
	}

	@Override
	public void buildUnits() {
		if (super.resource > 10) {
			System.out.println("고급 오크 생성");
		} else {
			System.out.println("일반 오크 생성");
		}
	}
}
