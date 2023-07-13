import behavior.AxeBehavior;
import character.Character;
import character.Queen;

public class ActionAdventureSimulator {
    public static void main(String[] args) {
        Character userCharacter = new Queen();
        userCharacter.fight();

        userCharacter.setWeapon(new AxeBehavior());
        userCharacter.fight();
    }
}
