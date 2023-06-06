package chapter1.behavior;

public class AxeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("도끼로 찍다.");
    }
}
