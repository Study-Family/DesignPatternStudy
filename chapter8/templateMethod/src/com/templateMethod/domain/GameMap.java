package com.templateMethod.domain;

public class GameMap {
    private int[][] map;
    private Position center;

    public GameMap(int size) {
        this.map = new int[size][size];
        this.center = new Position(size / 2, size / 2);
    }

    public Position getCenter() {
        return center;
    }
}
