package shapes;

import java.awt.Graphics;

public abstract class BaseShape implements Shape {

    private int x;
    private int y;

    BaseShape(int x, int y) {
        this.x = x;
        this.y = y;

    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    public void print() {
        System.out.println(this.getClass().getSimpleName() + ": Position -> (" + getX() + "," + getY() + "), Dimensions -> (" + getWidth() + "," + getHeight() + ")");
    }
    protected void print(int depth) {
        printTab(depth);
        print();
    }

    protected void printTab(int depth) {
        for(int i = 0; i < depth; i++) {
            System.out.print("\t");
        }
    }
}
