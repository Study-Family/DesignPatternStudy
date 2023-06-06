package character;

import behavior.SwordBehavior;

public class Knight extends Character {
    public Knight(){
        setWeapon(new SwordBehavior());
    }
    @Override
    public void fight() {
        System.out.println("공격 개시 - Knight");
        weapon.useWeapon();
    }
}