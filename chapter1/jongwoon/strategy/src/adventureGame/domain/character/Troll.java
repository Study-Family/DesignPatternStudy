package adventureGame.domain.character;

import adventureGame.domain.weapon.AxeBehavior;

public class Troll extends Character {

    public Troll() {
        name = "troll";
        weapon = new AxeBehavior();
    }
}
