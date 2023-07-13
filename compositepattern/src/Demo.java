import editor.ImageEditor;
import shapes.Circle;
import shapes.CompoundShape;
import shapes.Dot;
import shapes.Rectangle;

public class Demo {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

        editor.loadShapes(
                new Circle(10, 10, 10),

                new CompoundShape(
                        new Circle(110, 110, 50),
                        new Dot(160, 160)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100),
                        new Dot(240, 240),
                        new Dot(240, 360),
                        new Dot(360, 360),
                        new Dot(360, 240)
                )
        );
    }
}
