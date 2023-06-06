package chapter1.character;

import chapter1.behavior.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weapon;

    abstract public void fight();

    public void setWeapon(WeaponBehavior w){
        this.weapon = w;
    }
}
