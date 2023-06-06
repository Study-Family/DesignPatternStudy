package strategypattern.puzzle1.character;

import strategypattern.puzzle1.weapon.BowAndArrowBehavior;

public class Queen extends Character{
    public Queen() {
        this.weaponBehavior = new BowAndArrowBehavior();
    }

    @Override
    void fight() {
        System.out.println("queen");
    }
}
