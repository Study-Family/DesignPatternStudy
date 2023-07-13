package chapter9.seungwon.compositePattern;

interface Graphic {
	void move(int x, int y);

	void draw();

	void bound(int[] top, int[] bottom, int[] left, int[] right);
}
