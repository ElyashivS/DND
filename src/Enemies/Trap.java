package Enemies;

import Board.Point;
import Tiles.Health;

public class Trap extends Enemy{
    private int visibilityTime;
    private int invisibilityTime;
    private int ticksCount;
    private boolean visible = true;

    public Trap(char tile, Point position, String name, Health health, int attackPts, int defensePts, int expValue, int visibilityTime, int invisibilityTime, int ticksCount, boolean visible) {
        super(tile, position, name, health, attackPts, defensePts, expValue);
        this.visibilityTime = visibilityTime;
        this.invisibilityTime = invisibilityTime;
        this.ticksCount = ticksCount;
        this.visible = visible;
    }
}
