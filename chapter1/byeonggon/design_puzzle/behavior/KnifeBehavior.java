package chapter1.behavior;

public class KnifeBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("칼로 벤다");
    }
}
