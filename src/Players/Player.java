package Players;

import Board.Point;
import Tiles.Health;
import Tiles.Unit;

public abstract class Player extends Unit {
    private int exp = 0;
    private int level = 1;


    public Player(char tile, Point position, String name, Health health, int attackPts, int defensePts, int exp, int level) {
        super('@', position, name, health, attackPts, defensePts);
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

    public void act(char action) {
        if (action == 'w')
            moveUp();
        if (action == 's')
            moveDown();
        if (action == 'd')
            moveRight();
        if (action == 'a')
            moveLeft();
//        if (action == 'e')
//            // TODO castAbility();
    }

    private void moveUp() {
        Point moved = new Point(position.getX(), position.getY() + 1);
    }
    private void moveDown() {
        Point moved = new Point(position.getX(), position.getY() - 1);
    }
    private void moveRight() {
        Point moved = new Point(position.getX() + 1, position.getY());
    }
    private void moveLeft() {
        Point moved = new Point(position.getX() - 1, position.getY());
    }
}
