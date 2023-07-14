package domain;

public class RoundPegAdapter extends RoundPeg{

    private SquarePeg squarePeg;

    public RoundPegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    public double getRadius() {
        return squarePeg.getWidth() / 2.0;
    }
}
