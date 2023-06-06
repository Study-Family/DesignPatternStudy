package strategypattern.puzzle1.character;

import strategypattern.puzzle1.weapon.SwordBehavior;

public class Knight extends Character{
    public Knight() {
        this.weaponBehavior = new SwordBehavior();
    }

    @Override
    public void fight() {
        System.out.println("knight");
    }
}
