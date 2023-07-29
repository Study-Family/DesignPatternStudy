package com.prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle(10, 20, "red", 15);
        shapes.add(circle);

        Circle copyCircle = (Circle) circle.clone();
        shapesCopy.add(copyCircle);

        Rectangle rectangle = new Rectangle(0, 0, "blue", 10, 20);
        shapes.add(rectangle);

        Rectangle copyRectangle = (Rectangle) rectangle.clone();
        copyRectangle.changeWidth(30);
        shapesCopy.add(copyRectangle);

        compare(shapes, shapesCopy);
    }

    private static void compare(List<Shape> shapes, List<Shape> shapesCopy) {

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }
}
