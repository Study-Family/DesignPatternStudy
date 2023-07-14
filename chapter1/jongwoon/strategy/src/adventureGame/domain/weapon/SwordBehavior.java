package adventureGame.domain.weapon;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("칼로 베기!");
    }
}
