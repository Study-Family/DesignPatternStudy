package decorator.Weapon;

public abstract class WeaponAccessory implements Weapon{
    private Weapon weapon;

    public WeaponAccessory(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void aimAndFire() {
        weapon.aimAndFire();
    }
}
