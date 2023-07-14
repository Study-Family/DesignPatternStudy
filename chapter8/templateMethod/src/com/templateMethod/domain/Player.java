package com.templateMethod.domain;

public class Player {
    private Position position;

    public int calcDistance(Player enemy) {
        return position.calculateDistance(enemy.position);
    }

    public Position getPosition() {
        return position;
    }
}
