package decorator.coffee;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        this(Size.TALL);
    }

    public HouseBlend(Size size) {
        this.size = size;
        name = "하우스 블렌드 커피";
    }

    public double cost() {
        return .89;
    }
}
