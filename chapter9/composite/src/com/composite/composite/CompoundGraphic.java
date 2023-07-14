package com.composite.composite;

import com.composite.domain.Graphic;

import java.util.ArrayList;
import java.util.List;

public class CompoundGraphic implements Graphic {
    List<Graphic> childs = new ArrayList<>();

    public void add(Graphic child) {
        childs.add(child);
    }

    public void remove(Graphic child) {
        childs.remove(child);
    }

    @Override
    public void move(int x, int y) {
        for(Graphic child : childs) {
            child.move(x, y);
        }
    }

    @Override
    public void draw() {
        for(Graphic child : childs) {
            child.draw();
        }
    }

    public List<Graphic> getChilds() {
        return childs;
    }
}
