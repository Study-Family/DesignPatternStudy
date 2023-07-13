package character;

import behavior.KnifeBehavior;

public class King extends Character {
    public King(){
        setWeapon(new KnifeBehavior());
    }
    @Override
    public void fight() {
        System.out.println("공격 개시 - King");
        weapon.useWeapon();
    }
}