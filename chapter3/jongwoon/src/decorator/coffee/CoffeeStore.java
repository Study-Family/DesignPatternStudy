package decorator.coffee;

public class CoffeeStore {
    public static void main(String[] args) {
        Beverage beverage = new Soybean(new Whip(new Mocha(new DarkRoast(Beverage.Size.VENTI))));

        System.out.println(beverage.getName() + " " + beverage.cost());
    }
}
