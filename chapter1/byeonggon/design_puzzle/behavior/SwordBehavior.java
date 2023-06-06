package chapter1.behavior;

public class SwordBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("검을 휘두르다.");
    }
}
