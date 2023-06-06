package chapter1.character;

public class Troll extends Character{
    @Override
    public void fight() {
        System.out.println("트롤이");
        weapon.useWeapon();
    }
}
