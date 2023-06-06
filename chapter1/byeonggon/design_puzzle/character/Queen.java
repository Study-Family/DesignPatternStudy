package chapter1.character;

import chapter1.behavior.WeaponBehavior;

public class Queen extends Character{

    @Override
    public void fight() {

        System.out.println("여왕이");
        weapon.useWeapon();
    }
}
