package compositePattern;

public class Circle extends Dot{

    public Circle(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw() {
        System.out.println(String.format("Circle: {} {}", x,y));
    }
}
