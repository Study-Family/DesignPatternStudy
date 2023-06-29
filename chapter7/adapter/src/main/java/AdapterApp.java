import domain.RoundHole;
import domain.RoundPeg;
import domain.RoundPegAdapter;
import domain.SquarePeg;

public class AdapterApp {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5.5);
        System.out.println(roundHole.fits(roundPeg));

        SquarePeg squarePeg = new SquarePeg(8);
        RoundPegAdapter roundPegAdapter = new RoundPegAdapter(squarePeg);
        System.out.println(roundHole.fits(roundPegAdapter));
    }
}
