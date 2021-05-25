package Players;

import Tiles.Health;

public class Rogue extends Player{
    private int cost;
    private int currentEnergy;

    public Rogue(String name, Health health, int attackPts, int defensePts, int exp, int level, int cost, int currentEnergy) {
        super(name, health, attackPts, defensePts, exp, level);
        this.cost = cost;
        this.currentEnergy = currentEnergy;
    }

    @Override
    public void levelUp() {
        super.levelUp();
        currentEnergy = 100;
        setAttackPts(3 * getLevel());
    }
}
