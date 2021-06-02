package Enemies;

import Board.Point;
import Tiles.Health;
import Tiles.Unit;

public abstract class Enemy extends Unit {
    private int expValue;

    public Enemy(char tile, Point position, String name, Health health, int attackPts, int defensePts, int expValue) {
        super(tile, position, name, health, attackPts, defensePts);
        this.expValue = expValue;
    }

    public int getExpValue() {
        return expValue;
    }
}
