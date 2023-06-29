package adapterpattern;

public class SquarePegAdapter extends  RoundPeg{
    public SquarePegAdapter(int redius) {
        super(redius);
    }


    public int getRadius() {
        return this.radius * this.radius * 2;
    }
}
