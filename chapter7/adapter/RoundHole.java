package chapter7.adapter;

public class RoundHole {
	private int radius;

	public RoundHole(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public boolean fits(RoundPeg peg) {
		if( radius > peg.getRadius() ) {
			return true;
		}

		return false;
	}
}
