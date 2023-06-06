package strategypattern.puzzle1.character;

import strategypattern.puzzle1.weapon.KnifeBehavior;

public class King extends Character {
    public King() {
        this.weaponBehavior = new KnifeBehavior();
    }

    @Override
    public void fight() {
        System.out.println("king");
    }
}
