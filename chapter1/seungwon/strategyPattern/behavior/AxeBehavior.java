package behavior;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("공격 - 도끼로 찍어버리기");
    }
}