package decorator.Weapon;

public class Scoped extends WeaponAccessory {

    public Scoped(Weapon weapon) {
        super(weapon);
    }

    @Override
    public void aimAndFire() {
        scope();
        super.aimAndFire();
    }

    void scope() {
        System.out.println("조준 중");
    }
}
