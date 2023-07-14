package decorator.coffee;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        this(Size.TALL);
    }

    public DarkRoast(Size size) {
        this.size = size;
        name = "다크 로스트 커피";
    }

    @Override
    public double cost() {
        return .99;
    }
}
