package com.composite.composite;

import com.composite.domain.Graphic;

import java.util.ArrayList;
import java.util.List;

public class GraphicTools {

    List<Graphic> compoundGraphic = new ArrayList<>();

    public GraphicTools(List<Graphic>... compoundGraphic) {
        for (List<Graphic> graphics : compoundGraphic) {
            this.compoundGraphic.addAll(graphics);
        }
    }

    public void draw() {
        for (Graphic graphic : compoundGraphic) {
            graphic.draw();
        }
    }
}
