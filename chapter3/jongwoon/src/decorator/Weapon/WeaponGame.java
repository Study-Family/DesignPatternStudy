package decorator.Weapon;

public class WeaponGame {
    public static void main(String[] args) {
        Weapon weapon = new Buttstock(new BaseWeapon());
        weapon.aimAndFire();

        System.out.println("=============");

        Weapon weapon2 = new Buttstock(new Scoped(new Grenade(new BaseWeapon())));
        weapon2.aimAndFire();
    }
}
