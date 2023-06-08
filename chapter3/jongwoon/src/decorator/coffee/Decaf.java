package decorator.coffee;

public class Decaf extends Beverage {

    public Decaf() {
        this(Size.TALL);
    }

    public Decaf(Size size) {
        this.size = size;
        name = "디카페인 커피";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
