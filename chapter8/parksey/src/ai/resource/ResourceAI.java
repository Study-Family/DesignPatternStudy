package ai.resource;

import ai.GameAI;
import global.Position;
import global.resources.Resources;
import global.resources.TakeResources;

public class ResourceAI extends GameAI {
    @Override
    public void attack(GameAI gameAI) {

    }

    @Override
    public void collectResources(Resources resources) {
        if (!(resources instanceof TakeResources)) {
            return;
        }

        addResource(resources);
    }

    @Override
    public void buildStructures() {
        throw new RuntimeException("건물을 생성할 수 없습니다.");
    }

    @Override
    public void movePosition(Position position) {
        throw new RuntimeException("움직일 수 없습니다.");
    }


    protected void addResource(Resources resources) {
        hp += resources.takeHp();
    }
}
