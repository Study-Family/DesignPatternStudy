package com.composite.domain;

public class Dot implements Graphic {

    protected int x;
    protected int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        System.out.println("점 좌표를 : " + "[ " + x + ", " + y + "] 만큼 이동시킵니다.");
        this.x += x;
        this.y += y;
    }

    @Override
    public void draw() {
        System.out.println("== 점 그리기 ==");
        System.out.println(x + " , " + y);
    }
}
