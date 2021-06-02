package Enemies;

import Board.Point;
import Tiles.Health;

public class Monster extends Enemy{
    private int visionRange;

    public Monster(char tile, Point position, String name, Health health, int attackPts, int defensePts, int expValue, int visionRange) {
        super(tile, position, name, health, attackPts, defensePts, expValue);
        this.visionRange = visionRange;
    }
}
