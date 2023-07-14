package adventureGame.domain.character;

import adventureGame.domain.weapon.BowAndArrowBehavior;

public class Knight extends Character {
    public Knight() {
        name = "knight";
        weapon = new BowAndArrowBehavior();
    }
}
