package chapter1.character;

public class Knight extends Character{


    @Override
    public void fight() {
        System.out.println("나이트가");
        weapon.useWeapon();
    }
}
