package character;

import behavior.BowAndArrowBehavior;

public class Queen extends Character {
    public Queen(){
        setWeapon(new BowAndArrowBehavior());
    }
    @Override
    public void fight() {
        System.out.println("공격 개시 - Queen");
        weapon.useWeapon();
    }
}