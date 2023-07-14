package com.templateMethod.domain.unit;

import com.templateMethod.domain.Position;

public class Warrior extends Unit {

    @Override
    public void move(Position position) {
        System.out.println(position.getX() + " , " + position.getY() + "로 전사가 이동합니다");
    }
}
