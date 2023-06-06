package adventureGame.domain.character;

import adventureGame.domain.weapon.KnifeBehavior;

public class Queen extends Character {

    public Queen() {
        name = "queen";
        weapon = new KnifeBehavior();
    }
}
