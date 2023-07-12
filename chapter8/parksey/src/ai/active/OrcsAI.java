package ai.active;

import ai.GameAI;
import global.Position;

public class OrcsAI extends ActiveAI {
    private static final double SPEED = 0.5;

    @Override
    protected boolean firstAttack() {
        return true;
    }

    @Override
    public void buildStructures() {
        System.out.println("동굴 생성");
    }

    @Override
    public void movePosition(Position position) {
        this.position.moveTo(position, SPEED);
    }
}
