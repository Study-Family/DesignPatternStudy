package ai.active;

import ai.GameAI;
import global.Position;

public class MonstersAI extends ActiveAI {
    private static final double SPEED = 2;

    @Override
    public void buildStructures() {
        System.out.println("둥지 생성");
    }

    @Override
    public void movePosition(Position position) {
        this.position.moveTo(position, SPEED);
    }
}
