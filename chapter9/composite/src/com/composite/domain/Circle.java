package com.composite.domain;

public class Circle extends Dot {

    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("중점 [ " + x + ", " + y + "]과 반지름 " + radius + " 를 가진 원 그리기");
    }
}
