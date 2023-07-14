package com.templateMethod;

import com.templateMethod.domain.Player;
import com.templateMethod.domain.Position;
import com.templateMethod.domain.unit.Scout;
import com.templateMethod.domain.unit.Unit;
import com.templateMethod.domain.unit.Warrior;

import java.util.ArrayList;
import java.util.List;

public class OrcsAI extends GameAI {
    List<Unit> scouts = new ArrayList<>();
    List<Unit> warriors = new ArrayList<>();

    @Override
    protected void buildStructures() {

    }

    @Override
    protected void buildUnits() {
        if (noScouts()) {
            scouts.add(new Scout());
        } else {
            warriors.add(new Warrior());
        }
    }

    @Override
    protected void sendScouts(Position position) {
        if (!scouts.isEmpty()) {
            for(Unit scout : scouts) {
                scout.move(position);
            }
        }
    }

    @Override
    protected void sendWarriors(Position position) {
        if (!warriors.isEmpty()) {
            for (Unit warrior : warriors) {
                warrior.move(position);
            }
        }
    }

    private boolean noScouts() {
        return scouts.isEmpty();
    }
}
