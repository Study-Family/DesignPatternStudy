package compositePattern;

import java.util.ArrayList;
import java.util.List;

public class CompoundGraphic implements Graphic{
    List<Graphic> graphics = new ArrayList<>();

    public void add(Graphic graphic) {
        graphics.add(graphic);
    }

    public void remove(Graphic graphic) {
        graphics.remove(graphic);
    }

    @Override
    public void move(int x, int y) {
        graphics.stream()
                .forEach(graphic -> graphic.move(x,y));
    }

    @Override
    public void draw() {
        graphics.stream()
                .forEach(graphic -> graphic.draw());
    }
}
