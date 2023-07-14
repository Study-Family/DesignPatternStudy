package decorator.coffee;

public class Espresso extends Beverage {

    public Espresso() {
        this(Size.TALL);
    }

    public Espresso(Size size) {
        this.size = size;
        name = "에스프레소 커피";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
