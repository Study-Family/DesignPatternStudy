package com.templateMethod.domain.unit;

import com.templateMethod.domain.Position;

public class Scout extends Unit {

    @Override
    public void move(Position position) {
        System.out.println(position.getX() + " , " + position.getY() + "로 정찰병이 이동합니다");
    }
}
