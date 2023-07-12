package ai;

import ai.resource.ResourceAI;
import global.Jobs;
import global.Position;
import global.resources.Resources;

/**
 * GameAI가 자동으로 동작할 수 있도록 하는 메서드
 *   - Monster : 집 짓기 불가, 선제공격 불가
 *   - Human : 집 짓기 가능, 방어적으로 추가 기능 가능, 선제공격 선택
 *   - Orcs: : 집 짓기 가능, 공격적으로 가능, 무조건 선제공격
 */
public abstract class GameAI {
    private static final double BASIC_BOUNDARY = 10.0;
    private static final int LEVEL_UP = 10;

    protected int hp = 100;
    private int damage = 10;
    protected Position position;
    protected Jobs jobs = Jobs.FARMER;

    /**
     * 각 턴 마다 동작
      */
    public void takeTurn(GameAI gameAI, Resources resources) {
        attack(gameAI);
        collectResources(resources);

        if (haveToBuild()) {
            buildStructures();
        }
        buildUnits();
        grow();

        if (canMove()) {

        }
    }

    public void attack(GameAI gameAI) {
        if (nearByEnemies(gameAI.position)) {
            return;
        }

        if (!firstAttack()) {
            return;
        }

        damageProcess(gameAI);
    }

    public void grow() {
        hp+=LEVEL_UP;
    }


    public boolean haveToBuild() {
        return false;
    }

    public void buildUnits() {
        System.out.println("동족 생성");
    }


    public boolean canMove() {
        return false;
    }

    protected boolean nearByEnemies(Position enemyPosition) {
        double distance = position.calcDistanceTo(enemyPosition);
        return distance < BASIC_BOUNDARY;
    }

    protected boolean firstAttack() {
        return false;
    }

    protected void damageProcess(GameAI gameAI) {
        gameAI.hp = damage;
    }

    abstract public void collectResources(Resources resources);
    abstract public void buildStructures();
    abstract public void movePosition(Position position);
}

