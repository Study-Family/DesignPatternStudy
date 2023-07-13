package editor;

import shapes.BaseShape;
import shapes.CompoundShape;

public class ImageEditor {
    private CompoundShape allShapes = new CompoundShape();

    public void loadShapes(BaseShape... shapes) {
        allShapes.clear();
        allShapes.add(shapes);
        printCanvas();
    }

    private void printCanvas() {
        allShapes.print();
    }
}
