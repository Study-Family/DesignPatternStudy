package com.composite;

import com.composite.composite.CompoundGraphic;
import com.composite.composite.GraphicTools;
import com.composite.domain.Circle;
import com.composite.domain.Dot;

public class Main {
    public static void main(String[] args) {
        CompoundGraphic compoundGraphicA = new CompoundGraphic();
        compoundGraphicA.add(new Dot(1, 4));
        compoundGraphicA.add(new Dot(3, 7));
        compoundGraphicA.add(new Circle(1, 4, 7));

        CompoundGraphic compoundGraphicB = new CompoundGraphic();
        compoundGraphicB.add(new Dot(3, 5));
        compoundGraphicB.add(new Dot(2, 6));
        compoundGraphicB.add(new Circle(3, 10, 12));

        GraphicTools tools = new GraphicTools(compoundGraphicA.getChilds(), compoundGraphicB.getChilds());
        tools.draw();
    }
}
