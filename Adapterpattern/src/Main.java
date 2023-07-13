public class Main {

    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        if (roundHole.fits(roundPeg)) {
            System.out.println("roundPeg가 들어갈 수 있습니다.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        SquarePegAdapter smallPeg = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largePeg = new SquarePegAdapter(largeSqPeg);
//        roundHole.fits(smallSqPeg);
//        roundHole.fits(largeSqPeg);
        if (roundHole.fits(smallPeg)) {
            System.out.println("smallPeg가 들어갈 수 있습니다.");
        }
        if (roundHole.fits(largePeg)) {
            System.out.println("largePeg가 들어갈 수 있습니다.");
        }
    }
}