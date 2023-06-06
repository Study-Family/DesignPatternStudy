package adventureGame.domain.weapon;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("활 쏘기!");
    }
}
