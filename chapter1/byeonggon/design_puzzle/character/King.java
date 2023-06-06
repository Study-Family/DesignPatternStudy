package chapter1.character;

public class King extends Character{
    @Override
    public void fight() {
        System.out.println("왕이");
        weapon.useWeapon();
    }
}
