package decorator.coffee;

public class Soybean extends CondimentDecorator {

    public Soybean(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getName() {
        return beverage.getName() + ", 두유";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();

        switch(beverage.getSize()) {
            case TALL:
                cost += 0.05;
                break;
            case GRANDE:
                cost += 0.1;
                break;
            case VENTI:
                cost += 0.15;
        }
        return cost;
    }
}
