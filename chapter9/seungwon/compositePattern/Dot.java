package chapter9.seungwon.compositePattern;

class Dot implements Graphic {
	private int x;
	private int y;

	public Dot(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void move(int x, int y) {
		this.x += x;
		this.y += y;
	}

	public void draw() {
		System.out.println("Draw dot (" + x + ", " + y + ")");
	}

	public void bound(int[] top, int[] bottom, int[] left, int[] right) {
		top[0] = Math.max(top[0], y);
		bottom[0] = Math.min(bottom[0], y);
		left[0] = Math.min(left[0], x);
		right[0] = Math.max(right[0], x);
	}
}
