package adapterpattern;

public class AdapterTest {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(10);

        System.out.println(hole.fits(new RoundPeg(9)));
        System.out.println(hole.fits(new RoundPeg(10)));
        System.out.println(hole.fits(new RoundPeg(11)));

        System.out.println(hole.fits(new SquarePegAdapter(6)));
        System.out.println(hole.fits(new SquarePegAdapter(7)));
        System.out.println(hole.fits(new SquarePegAdapter(8)));
    }
}
