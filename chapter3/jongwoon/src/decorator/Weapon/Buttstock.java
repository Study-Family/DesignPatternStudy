package decorator.Weapon;

public class Buttstock extends WeaponAccessory {

    public Buttstock(Weapon weapon) {
        super(weapon);
    }

    @Override
    public void aimAndFire() {
        holding();
        super.aimAndFire();
    }

    public void holding() {
        System.out.println("견착 중");
    }
}
