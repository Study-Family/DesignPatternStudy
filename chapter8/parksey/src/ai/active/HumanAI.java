package ai.active;

import ai.GameAI;
import global.Jobs;
import global.Position;

public class HumanAI extends ActiveAI {
    private static final double SPEED = 1;

    @Override
    protected boolean firstAttack() {
        if (jobs.equals(Jobs.FARMER)) {
            return false;
        }
        return true;
    }


    @Override
    public void buildStructures() {
        System.out.println("마을 생성");
    }

    @Override
    public void movePosition(Position position) {
        this.position.moveTo(position, SPEED);
    }
}
