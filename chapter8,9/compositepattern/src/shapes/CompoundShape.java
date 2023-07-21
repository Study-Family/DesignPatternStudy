package shapes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompoundShape extends BaseShape {
    protected final List<BaseShape> children;

    public CompoundShape() {
        super(0, 0);
        children = new ArrayList<>();
    }

    public CompoundShape(BaseShape... components) {
        super(0, 0);
        children = new ArrayList<>();
        add(components);
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public void print() {
        print(0);
    }

    public void add(BaseShape... components) {
        children.addAll(Arrays.asList(components));
    }

    public void clear() {
        children.clear();
    }

    @Override
    protected void print(int depth) {
        printTab(depth);
        System.out.println("CompoundShape");
        for (BaseShape child : children) {
            child.print(depth + 1);
        }
    }
}
