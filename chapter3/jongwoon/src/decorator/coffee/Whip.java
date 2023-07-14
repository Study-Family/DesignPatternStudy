package decorator.coffee;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getName() {
        return beverage.getName() + ", 휘핑크림";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();

        switch(beverage.getSize()) {
            case TALL:
                cost += 0.02;
                break;
            case GRANDE:
                cost += 0.04;
                break;
            case VENTI:
                cost += 0.1;
        }
        return cost;
    }
}
