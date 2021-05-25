package Players;

import Tiles.Health;
import Tiles.Unit;

public abstract class Player extends Unit {
    private int exp = 0;
    private int level = 1;

    public Player(String name, Health health, int attackPts, int defensePts, int exp, int level) {
        super(name, health, attackPts, defensePts);
        this.exp = exp;
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void levelUp() {
        exp -= (50 * level);
        level++;
        health.setHealthPool(health.getHealthPool() + (10 * getLevel()));
        health.setHealthAmount(health.getHealthPool());
        setAttackPts(getAttackPts() + (4 * getLevel()));
        setDefensePts(getDefensePts() + getLevel());
    }
}
