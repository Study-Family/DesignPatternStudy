package character;

import behavior.AxeBehavior;

public class Troll extends Character {
    public Troll(){
        setWeapon(new AxeBehavior());
    }
    @Override
    public void fight() {
        System.out.println("공격 개시 - Troll");
        weapon.useWeapon();
    }
}