package decorator.coffee;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getName() {
        return beverage.getName() + ", 모카";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();

        switch(beverage.getSize()) {
            case TALL:
                cost += 0.10;
                break;
            case GRANDE:
                cost += 0.15;
                break;
            case VENTI:
                cost += 0.20;
        }
        return cost;
    }
}
