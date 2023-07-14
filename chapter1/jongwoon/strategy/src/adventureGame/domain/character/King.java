package adventureGame.domain.character;

import adventureGame.domain.weapon.SwordBehavior;

public class King extends Character {

    public King() {
        name = "king";
        weapon = new SwordBehavior();
    }
}
