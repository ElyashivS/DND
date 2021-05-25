package Players;

import Tiles.Health;

public class Mage extends Player {
    private int manaPool;
    private int currentMana;
    private int manaCost;
    private int spellPower;
    private int hitsCount;
    private int abilityRange;

    public Mage(String name, Health health, int attackPts, int defensePts, int exp, int level, int manaPool, int currentMana, int manaCost, int spellPower, int hitsCount, int abilityRange) {
        super(name, health, attackPts, defensePts, exp, level);
        this.manaPool = manaPool;
        this.currentMana = currentMana;
        this.manaCost = manaCost;
        this.spellPower = spellPower;
        this.hitsCount = hitsCount;
        this.abilityRange = abilityRange;
    }

    @Override
    public void levelUp() {
        super.levelUp();
        manaPool += 25 * getLevel();
        currentMana = Math.min(currentMana + (manaPool/4), manaPool);
        spellPower += 10 * getLevel();
    }
}