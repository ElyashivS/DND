package Enemies;

public class Monster extends Enemy{
    private int visionRange;

    public Monster(int expValue, int visionRange) {
        super(expValue);
        this.visionRange = visionRange;
    }
}
