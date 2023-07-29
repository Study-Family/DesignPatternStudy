package decorator.coffee;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
    public abstract String getName();

    public Size getSize() {
        return beverage.getSize();
    }
}
