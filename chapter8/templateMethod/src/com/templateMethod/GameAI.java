package com.templateMethod;

import com.templateMethod.domain.BuildStructure;
import com.templateMethod.domain.GameMap;
import com.templateMethod.domain.Player;
import com.templateMethod.domain.Position;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class GameAI {

    protected List<Player> playerList = new ArrayList<>();
    protected GameMap map = new GameMap(5);
    protected Position position;
    protected List<BuildStructure> buildStructures = new ArrayList<>();

    protected void turn() {
        collectResources();
        buildStructures();
        buildUnits();
        attack();
    }

    protected void collectResources() {
        for (BuildStructure structure : buildStructures) {
            structure.collect();
        }
    }

    protected abstract void buildStructures();

    protected abstract void buildUnits();

    protected void attack() {
        Player enemy = closestEnemy();

        if (enemy == null) {
            sendScouts(map.getCenter());
            return;
        }

        sendWarriors(enemy.getPosition());
    }

    private Player closestEnemy() {
        return playerList.stream()
                .min(Comparator.comparingInt(p -> p.getPosition().calculateDistance(this.position)))
                .orElse(null);
    }

    protected abstract void sendScouts(Position position);

    protected abstract void sendWarriors(Position position);
}
