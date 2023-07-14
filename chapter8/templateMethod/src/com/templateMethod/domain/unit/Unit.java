package com.templateMethod.domain.unit;

import com.templateMethod.domain.Position;

public abstract class Unit {
    protected Position position;

    public abstract void move(Position position);
}
