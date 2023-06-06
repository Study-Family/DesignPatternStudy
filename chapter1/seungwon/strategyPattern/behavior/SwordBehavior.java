package behavior;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("공격 - 검 휘두르기!");
    }
}