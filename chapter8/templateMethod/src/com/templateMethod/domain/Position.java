package com.templateMethod.domain;

public class Position {
    int x;
    int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int calculateDistance(Position p) {
        return (int)Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
