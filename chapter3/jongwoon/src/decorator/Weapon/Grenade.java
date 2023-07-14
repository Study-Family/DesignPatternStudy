package decorator.Weapon;

public class Grenade extends WeaponAccessory {
    
    public Grenade(Weapon weapon) {
        super(weapon);
    }

    @Override
    public void aimAndFire() {
        super.aimAndFire();
        grenade();
    }

    void grenade() {
        System.out.println("유탄 발사!!");
    }
}
