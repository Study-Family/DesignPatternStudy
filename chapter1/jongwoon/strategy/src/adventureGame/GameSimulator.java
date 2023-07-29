package adventureGame;

import adventureGame.domain.character.Character;
import adventureGame.domain.character.King;
import adventureGame.domain.character.Queen;
import adventureGame.domain.weapon.BowAndArrowBehavior;

public class GameSimulator {
    public static void main(String[] args) {
        Character king = new King();
        Character queen = new Queen();
        king.fight(queen);

        king.changeWeapon(new BowAndArrowBehavior());
        king.fight(queen);
        queen.fight(king);
    }
}
