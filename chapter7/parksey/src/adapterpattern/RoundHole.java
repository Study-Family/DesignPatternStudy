package adapterpattern;

public class RoundHole {
    private int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    private int getRadius() {
        return radius*radius;
    }

    public boolean fits(RoundPeg peg) {
        return getRadius() >= peg.getRadius();
    }


}
