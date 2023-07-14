package chapter7.adapter;

public class AdapterTest {
	public static void main(String[] args) {
		RoundHole hole = new RoundHole(5);

		SquarePeg squarePeg = new SquarePeg(3);

		RoundPeg squarePegAdapter = new SquarePegAdapter(squarePeg);

		boolean result = hole.fits(squarePegAdapter);

		System.out.println(result);
	}
}
