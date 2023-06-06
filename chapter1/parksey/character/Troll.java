package strategypattern.puzzle1.character;

import strategypattern.puzzle1.weapon.AxeBehavior;

public class Troll extends Character{
    public Troll() {
        this.weaponBehavior = new AxeBehavior();
    }

    @Override
    public void fight() {
        System.out.println("troll");
    }
}
