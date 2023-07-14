package adventureGame.domain.character;

import adventureGame.domain.weapon.WeaponBehavior;

public abstract class Character {
    String name;
    WeaponBehavior weapon;

    public void fight(Character character) {
        System.out.println(name + "이 무기를 사용하여 공격하였습니다.");
        weapon.useWeapon();
        character.attacked();
    }

    public void changeWeapon(WeaponBehavior weapon) {
        System.out.println(name + "이 무기를 교체하였습니다.");
        this.weapon = weapon;
    }

    private void attacked() {
        System.out.println(name + "이 피해를 입었습니다.");
    }
}
