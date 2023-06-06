package adventureGame.domain.weapon;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("칼로 찌르기!");
    }
}
