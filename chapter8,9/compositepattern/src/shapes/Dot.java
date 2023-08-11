package shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Dot extends BaseShape {

    private final int DOT_SIZE = 3;

    public Dot(int x, int y) {
        super(x, y);
    }

    @Override
    public int getWidth() {
        return DOT_SIZE;
    }

    @Override
    public int getHeight() {
        return DOT_SIZE;
    }
}
