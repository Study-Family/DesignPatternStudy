package strategypattern.puzzle1.character;

import strategypattern.puzzle1.weapon.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weaponBehavior;

    public void setWeapon(WeaponBehavior weapon) {
        this.weaponBehavior = weapon;
    }

    abstract void fight();
}
