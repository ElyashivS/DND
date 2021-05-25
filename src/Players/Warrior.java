package Players;

import Tiles.Health;

public class Warrior extends Player {
    private int abilityCooldown;
    private int remainingCooldown = 0;

    public Warrior(String name, Health health, int attackPts, int defensePts, int exp, int level, int abilityCooldown, int remainingCooldown) {
        super(name, health, attackPts, defensePts, exp, level);
        this.abilityCooldown = abilityCooldown;
        this.remainingCooldown = remainingCooldown;
    }

    @Override
    public void levelUp() {
        super.levelUp();
        remainingCooldown = 0;
        health.setHealthPool(5 * getLevel());
        setAttackPts(getAttackPts() + (2 * getLevel()));
        setDefensePts(getDefensePts() + getLevel());
    }
}
