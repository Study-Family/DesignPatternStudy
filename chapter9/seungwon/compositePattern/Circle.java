package chapter9.seungwon.compositePattern;

class Circle extends Dot {
	private final int radius;

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	public void draw() {
		System.out.println("Draw Circle - (" + x + ", " + y + "), radius : " + radius + ".");
		int cnt = 4;
		double alpha = 0.0;
		for (int i = 0; i < cnt; ++i) {
			System.out.print("  ");
			new Dot(x + (int)(radius * Math.sin(alpha)), y + (int)(radius * Math.cos(alpha))).draw();
			alpha += 2 * Math.PI / cnt;
		}
	}

	public void bound(int[] top, int[] bottom, int[] left, int[] right) {
		top[0] = Math.max(top[0], y + radius);
		bottom[0] = Math.min(bottom[0], y - radius);
		left[0] = Math.min(left[0], x - radius);
		right[0] = Math.max(right[0], x + radius);
	}
}
