package Tiles;

public abstract class Unit extends Tile {
    protected String name;
    protected Health health;
    private int attackPts;
    private int defensePts;

    public Unit(String name, Health health, int attackPts, int defensePts) {
        this.name = name;
        this.health = health;
        this.attackPts = attackPts;
        this.defensePts = defensePts;
    }

    public int getAttackPts() {
        return attackPts;
    }

    public int getDefensePts() {
        return defensePts;
    }

    public void setAttackPts(int attackPts) {
        this.attackPts = attackPts;
    }

    public void setDefensePts(int defensePts) {
        this.defensePts = defensePts;
    }
}
