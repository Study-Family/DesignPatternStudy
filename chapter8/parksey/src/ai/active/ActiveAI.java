package ai.active;

import ai.GameAI;
import global.Position;
import global.resources.Resources;

/**
 * movePosition은 현재 동일한 기능이나, 후에 동료 및 혼자 다닐때, 주위 환경에 따라 동작의 상세가 변경될 수 있으므로 추가
 */
public abstract class ActiveAI extends GameAI {

    @Override
    public void collectResources(Resources resources) {
        hp += resources.takeHp();
    }

    @Override
    public boolean haveToBuild() {
        return true;
    }

    @Override
    public boolean canMove() {
        return true;
    }

}
