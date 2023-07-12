package chapter9.seungwon.compositePattern;

import java.util.ArrayList;
import java.util.List;

class CompoundGraphic implements Graphic {
	private final List<Graphic> children;

	public CompoundGraphic() {
		children = new ArrayList<>();
	}

	public void add(Graphic graphic) {
		children.add(graphic);
	}

	public void remove(Graphic graphic) {
		children.remove(graphic);
	}

	public void move(int x, int y) {
		for (Graphic graphic : children) {
			graphic.move(x, y);
		}
	}

	public void draw() {
		System.out.println("Draw CompoundGraphic:");
		for (Graphic graphic : children) {
			graphic.draw();
		}
		if (!children.isEmpty()) {
			int top = Integer.MIN_VALUE;
			int bottom = Integer.MAX_VALUE;
			int left = Integer.MAX_VALUE;
			int right = Integer.MIN_VALUE;
			bound(new int[] {top}, new int[] {bottom}, new int[] {left}, new int[] {right});
			System.out.println(" Draw Rectangle:");
			System.out.println("   left: " + left + "   right: " + right + "   top: " + top + "   bottom: " + bottom);
		}
	}

	public void bound(int[] top, int[] bottom, int[] left, int[] right) {
		for (Graphic graphic : children) {
			graphic.bound(top, bottom, left, right);
		}
		top[0] += 1;
		bottom[0] -= 1;
		left[0] -= 1;
		right[0] += 1;
	}
}
