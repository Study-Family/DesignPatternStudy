package decorator.coffee;

public abstract class Beverage {
    protected String name = "";
    protected Size size;

    public enum Size {TALL, GRANDE, VENTI};

    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }

    public abstract double cost();
}
