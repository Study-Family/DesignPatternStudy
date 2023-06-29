package adapterpattern;

public class RoundPeg {
    protected int radius;

    public RoundPeg(int redius) {
        this.radius = redius;
    }

    public int getRadius() {
        return radius * radius;
    }
}
