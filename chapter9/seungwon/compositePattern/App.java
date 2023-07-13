package chapter9.seungwon.compositePattern;

class App {
	public void process(Dot dot) {
		dot.draw();
		dot.move(1, 2);
		dot.draw();
	}

	public App() {
		Circle circle = new Circle(1, 1, 1);
		process(circle);
		System.out.println("=========Process=========");

		CompoundGraphic all = new CompoundGraphic();
		all.add(new Dot(1, 2));
		all.add(new Circle(5, 3, 10));

		CompoundGraphic child = new CompoundGraphic();
		child.add(new Dot(2, 1));
		child.move(2, -3);
		child.add(new Circle(0, 1, 2));
		child.move(-9, -3);
		child.draw();
		System.out.println("=========Child=========");

		all.add(child);
		all.draw();
	}
}
